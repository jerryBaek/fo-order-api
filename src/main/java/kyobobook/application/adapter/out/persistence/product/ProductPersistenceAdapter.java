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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kyobobook.application.adapter.out.persistence.product.entity.ProductEntity;
import kyobobook.application.biz.common.port.out.CustomEventLogOutPort;
import kyobobook.application.biz.product.port.out.ProductPersistencePort;
import kyobobook.application.domain.product.Product;

/**
 * @Project     : common-prototype-api
 * @FileName    : ProductPersistenceAdapter.java
 * @Date        : 2021. 8. 31.
 * @author      : sykim@kyobobook.com
 * @description : TEC01-32 Service Mesh 연동 구성 Prototype : Service에서 Database를 접근하기 위한 Adapter
 */
@Repository("productPersistenceRepository")
public class ProductPersistenceAdapter implements ProductPersistencePort {
    
    private static final Logger logger = LoggerFactory.getLogger(ProductPersistenceAdapter.class);
    
    @Autowired
    ProductWriterMapper productWriterMapper;
    
    @Autowired
    ProductReaderMapper productReaderMapper;
    
    @Autowired
    CustomEventLogOutPort customEventLogOtuPort;

    @Override
    public List<Product> selectProducts() throws Exception {
        
        List<Product> products = new ArrayList<Product>();
        
        try {
            productReaderMapper.selectProducts().stream().forEach(entity -> {
                Product product = Product.builder()
                        .cmdt_id(entity.getCmdt_id())
                        .cmdt_name(entity.getCmdt_name())
                        .sbtt_name1(entity.getSbtt_name1())
                        .rlse_date(entity.getRlse_date())
                        .cmdt_code(entity.getCmdt_code())
                        .wncr_prce(entity.getWncr_prce())
                        .build();
                products.add(product);
            });
            
            customEventLogOtuPort.insertEventLog("### READER DB :: 상품 목록 조회 :: count :: "+ products.size());
            
        } catch(Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
        
        return products;

    }

    @Override
    public Product getProduct(String cmdt_id) throws Exception {
        
        Product product = null;
        
        try {
            ProductEntity entity = productReaderMapper.getProduct(cmdt_id);
            
            product = Product.builder()
                    .cmdt_id(entity.getCmdt_id())
                    .cmdt_name(entity.getCmdt_name())
                    .sbtt_name1(entity.getSbtt_name1())
                    .rlse_date(entity.getRlse_date())
                    .cmdt_code(entity.getCmdt_code())
                    .wncr_prce(entity.getWncr_prce())
                    .build();            
            customEventLogOtuPort.insertEventLog("### READER DB :: 상품 상세 조회 :: cmdt_id :: "+ cmdt_id);
            
        } catch(Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
        
        return product;

    }

    @Override
    public Product insertProduct(Product product) throws Exception {
        
        ProductEntity entity = ProductEntity.builder()
                .cmdt_id(product.getCmdt_id())
                .cmdt_name(product.getCmdt_name())
                .sbtt_name1(product.getSbtt_name1())
                .rlse_date(product.getRlse_date())
                .cmdt_code(product.getCmdt_code())
                .wncr_prce(product.getWncr_prce())
                .build();
        
        try {
            
            productWriterMapper.insertProductCmdt(entity);
            productWriterMapper.insertProductPrce(entity);
            
            product.setCmdt_id(entity.getCmdt_id());
            product.setCmdt_code(entity.getCmdt_code());
            
            customEventLogOtuPort.insertEventLog("### WRITER DB :: 상품 등록 :: product :: " + product.toString());
            
        } catch(Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
        
        return product;
    }

    @Override
    public void updateProduct(Product product) throws Exception {
        
        ProductEntity entity = ProductEntity.builder()
                .cmdt_id(product.getCmdt_id())
                .cmdt_name(product.getCmdt_name())
                .sbtt_name1(product.getSbtt_name1())
                .rlse_date(product.getRlse_date())
                .cmdt_code(product.getCmdt_code())
                .wncr_prce(product.getWncr_prce())
                .build();
        
        try {
            
            productWriterMapper.updateProductCmdt(entity);
            productWriterMapper.updateProductPrce(entity);
            
            customEventLogOtuPort.insertEventLog("### WRITER DB :: 상품 변경 :: product :: " + product.toString());
            
        } catch(Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
        
    }

    @Override
    public void deleteProduct(String cmdt_id) throws Exception {
        
        try {
            productWriterMapper.deleteProductCmdt(cmdt_id);
            productWriterMapper.deleteProductPrce(cmdt_id);
            
            customEventLogOtuPort.insertEventLog("### WRITER DB :: 상품 삭제 :: cmdt_id :: " + cmdt_id);
        } catch(Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
    }    
    
    @Override
    public Product insertReaderDBProduct(Product product) throws Exception {
        
        ProductEntity entity = ProductEntity.builder()
                .cmdt_id(product.getCmdt_id())
                .cmdt_name(product.getCmdt_name())
                .sbtt_name1(product.getSbtt_name1())
                .rlse_date(product.getRlse_date())
                .cmdt_code(product.getCmdt_code())
                .wncr_prce(product.getWncr_prce())
                .build();
        
        try {
            
            productReaderMapper.insertProductCmdt(entity);
            productReaderMapper.insertProductAutr(entity);
            productReaderMapper.insertProductPrce(entity);
            
            product.setCmdt_id(entity.getCmdt_id());
            product.setCmdt_code(entity.getCmdt_code());
            
        } catch(Exception e) {
            logger.error(e.getMessage());
            customEventLogOtuPort.insertEventLog("### >>>>> READER DB - 상품 등록 (insertReaderDBProduct) :: Exception :: " + e);
            throw e;
        }
 
        return product;
    }


}
