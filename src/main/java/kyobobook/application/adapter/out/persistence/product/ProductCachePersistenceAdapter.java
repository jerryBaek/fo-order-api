/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * sykim@kyobobook.com      2021. 8. 27.
 *
 ****************************************************/
package kyobobook.application.adapter.out.persistence.product;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Repository;

import kyobobook.application.adapter.out.persistence.product.entity.ProductEntity;
import kyobobook.application.biz.common.port.out.CustomEventLogOutPort;
import kyobobook.application.biz.product.port.out.ProductPersistencePort;
import kyobobook.application.domain.product.Product;

/**
 * @Project     : common-prototype-api
 * @FileName    : ProductCachePersistenceAdapter.java
 * @Date        : 2021. 8. 31.
 * @author      : sykim@kyobobook.com
 * @description : TEC01-32 Service Mesh 연동 구성 Prototype : Service에서 Database를 접근하기 위한 Adapter
 */
@Repository("productCachePersistenceRepository")
public class ProductCachePersistenceAdapter implements ProductPersistencePort {
    
    private static final Logger logger = LoggerFactory.getLogger(ProductCachePersistenceAdapter.class);
    
    private final ProductWriterMapper productWriterMapper;
    
    private final ProductReaderMapper productReaderMapper;
    
    private final CustomEventLogOutPort customEventLogOtuPort;
    
    /**
     * Constructor
     * @param productWriterMapper
     * @param productReaderMapper
     * @param customEventLogOtuPort
     */
    public ProductCachePersistenceAdapter(ProductWriterMapper productWriterMapper
            , ProductReaderMapper productReaderMapper
            , CustomEventLogOutPort customEventLogOtuPort) {
        
        this.productWriterMapper = productWriterMapper;
        this.productReaderMapper = productReaderMapper;
        this.customEventLogOtuPort = customEventLogOtuPort;
    }
    

    @Override
    @Cacheable(value="products", key="#root.methodName")
    public List<Product> selectProducts() throws Exception {
        
        List<Product> products = new ArrayList<Product>();
        
        try {
            
            productReaderMapper.selectProducts().stream().forEach(entity -> {
                Product product = Product.builder()
                        .cmdt_id(entity.getCmdtId())
                        .cmdt_name(entity.getCmdtName())
                        .sbtt_name1(entity.getSbttName1())
                        .rlse_date(entity.getRlseDate())
                        .cmdt_code(entity.getCmdtCode())
                        .wncr_prce(entity.getWncrPrce())
                        .build();
                products.add(product);
            });
            
            customEventLogOtuPort.insertEventLog("### READER DB | Cache :: 상품 목록 조회 :: count :: "+ products.size());
            
        } catch(Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
        return products;

    }

    @Override
    @Cacheable(value="product", key="#cmdt_id")
    public Product getProduct(String cmdt_id) throws Exception {
        
        Product product = null;
        
        try {
            ProductEntity entity = productReaderMapper.getProduct(cmdt_id);
            
            product = Product.builder()
                    .cmdt_id(entity.getCmdtId())
                    .cmdt_name(entity.getCmdtName())
                    .sbtt_name1(entity.getSbttName1())
                    .rlse_date(entity.getRlseDate())
                    .cmdt_code(entity.getCmdtCode())
                    .wncr_prce(entity.getWncrPrce())
                    .build();
            
            customEventLogOtuPort.insertEventLog("### READER DB | Cache :: 상품 상세 조회 :: cmdt_id :: "+ cmdt_id);
            
        } catch(Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
        
        return product;
    }

    @Override
    @CacheEvict(value="products", allEntries=true)
    public Product insertProduct(Product product) throws Exception {
        
        ProductEntity entity = ProductEntity.builder()
                .cmdtId(product.getCmdt_id())
                .cmdtName(product.getCmdt_name())
                .sbttName1(product.getSbtt_name1())
                .rlseDate(product.getRlse_date())
                .cmdtCode(product.getCmdt_code())
                .wncrPrce(product.getWncr_prce())
                .build();
        
        try {
            
            productWriterMapper.insertProductCmdt(entity);
            productWriterMapper.insertProductPrce(entity);
            
            product.setCmdt_id(entity.getCmdtId());
            product.setCmdt_code(entity.getCmdtCode());
            
            customEventLogOtuPort.insertEventLog("### WRITER DB | Cache :: 상품 등록 :: product :: " + product.toString());
            
        } catch(Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
        
        return product;
    }

    @Override
    @Caching(evict = {
            @CacheEvict(value="product", key="#product.cmdt_id"), 
            @CacheEvict(value="products", allEntries=true)
    })
    public void updateProduct(Product product) throws Exception {
        
        ProductEntity entity = ProductEntity.builder()
                .cmdtId(product.getCmdt_id())
                .cmdtName(product.getCmdt_name())
                .sbttName1(product.getSbtt_name1())
                .rlseDate(product.getRlse_date())
                .cmdtCode(product.getCmdt_code())
                .wncrPrce(product.getWncr_prce())
                .build();
        
        try {
            
            productWriterMapper.updateProductCmdt(entity);
            productWriterMapper.updateProductPrce(entity);
            
            customEventLogOtuPort.insertEventLog("### WRITER DB | Cache :: 상품 변경 :: product :: " + product.toString());
            
        } catch(Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
        
    }

    @Override
    @Caching(evict = {
            @CacheEvict(value="product", key="#cmdt_id"),
            @CacheEvict(value="products", allEntries=true)
    })
    public void deleteProduct(String cmdt_id) throws Exception {
        
        try {
            
            productWriterMapper.deleteProductCmdt(cmdt_id);
            productWriterMapper.deleteProductPrce(cmdt_id);
            
            customEventLogOtuPort.insertEventLog("### WRITER DB | Cache :: 상품 삭제 :: cmdt_id :: " + cmdt_id);
            
        } catch(Exception e) {
            logger.error(e.getMessage());
            throw e;
        }   
    }

    @Override
    public Product insertReaderDBProduct(Product product) throws Exception {
        
        ProductEntity entity = ProductEntity.builder()
                .cmdtId(product.getCmdt_id())
                .cmdtName(product.getCmdt_name())
                .sbttName1(product.getSbtt_name1())
                .rlseDate(product.getRlse_date())
                .cmdtCode(product.getCmdt_code())
                .wncrPrce(product.getWncr_prce())
                .build();
        
        try {
            
            productReaderMapper.insertProductCmdt(entity);
            productReaderMapper.insertProductPrce(entity);
            
            product.setCmdt_id(entity.getCmdtId());
            product.setCmdt_code(entity.getCmdtCode());
            
            customEventLogOtuPort.insertEventLog("### >>>>>> READER DB :: 상품 등록 :: product :: " + product.toString());
            
        } catch(Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
        
        return product;
    }

}
