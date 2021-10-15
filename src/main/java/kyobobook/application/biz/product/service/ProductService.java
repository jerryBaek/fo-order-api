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
package kyobobook.application.biz.product.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import kyobobook.application.biz.product.port.in.ProductPort;
import kyobobook.application.biz.product.port.out.ProductGrpcPort;
import kyobobook.application.biz.product.port.out.ProductOutPort;
import kyobobook.application.biz.product.port.out.ProductPersistencePort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.product.Product;
import kyobobook.application.domain.product.ProductAuthor;
import kyobobook.exception.BizRuntimeException;

/**
 * @Project     : common-prototype-api
 * @FileName    : ProductService.java
 * @Date        : 2021. 8. 31.
 * @author      : sykim@kyobobook.com
 * @description : TEC01-32 Service Mesh 연동 구성 Prototype : Service Class
 */
@Service
public class ProductService implements ProductPort {
    
    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);
    
    private final ProductPersistencePort productPersistencePort;
    
    private final ProductPersistencePort productCachePersistencePort;
    
    private final ProductGrpcPort productGrpcPort;
    
    private final ProductOutPort productOutPort;
    
    private final MessageSourceAccessor messageSource;
    
    /**
     * Constructor
     * @param productPersistencePort
     * @param productCachePersistencePort
     * @param productGrpcPort
     * @param productOutPort
     * @param messageSource
     */
    public ProductService(@Qualifier("productPersistenceRepository") ProductPersistencePort productPersistencePort
            , @Qualifier("productCachePersistenceRepository") ProductPersistencePort productCachePersistencePort
            , @Qualifier("grpcProductAdapter") ProductGrpcPort productGrpcPort
            , @Qualifier("restProductAdapter") ProductOutPort productOutPort
            , MessageSourceAccessor messageSource) {
        
        this.productPersistencePort = productPersistencePort;
        this.productCachePersistencePort = productCachePersistencePort;
        this.productGrpcPort = productGrpcPort;
        this.productOutPort = productOutPort;
        this.messageSource = messageSource;
    }
    
    @Override
    public ResponseMessage selectProducts(boolean cacheOption) throws BizRuntimeException {
        
        ResponseMessage responseMessage = null;
        
        try {
            
            List<Product> products = null;
            
            if (cacheOption) {
                products = productCachePersistencePort.selectProducts();
            } else {
                products = productPersistencePort.selectProducts();
            }
            
            logger.debug("### selectProducts :: product-before :: {}", products.toString());
            
            String json = new ObjectMapper().writeValueAsString(productOutPort.selectProductAuthors().getData());
            
            ObjectMapper mapper = new ObjectMapper();
            
            List<ProductAuthor> productAuthors = mapper.readValue(json, new TypeReference<List<ProductAuthor>>() {});
            
            products.forEach(product -> {
                
                ProductAuthor productAuthor = productAuthors.stream()
                        .filter(p -> p.getCmdt_id().equalsIgnoreCase(product.getCmdt_id())).findFirst().get();
                product.setAutr_code1(productAuthor.getAutr_code1());
                product.setAutr_name1(productAuthor.getAutr_name1());
                product.setAutr_code2(productAuthor.getAutr_code2());
                product.setAutr_name2(productAuthor.getAutr_name2());
                product.setAutr_code3(productAuthor.getAutr_code3());
                product.setAutr_name3(productAuthor.getAutr_name3());
            });
            
            logger.debug("### selectProducts :: product-after :: {}", products.toString());
            
            responseMessage = ResponseMessage.builder()
                    .data(products)
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete"))
                    .build();
            
        } catch(Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        
        return responseMessage;
        
    }

    @Override
    public ResponseMessage getProduct(boolean cacheOption, String cmdt_id) throws BizRuntimeException {
        
        ResponseMessage responseMessage = null;
        
        try {
            
            Product product = null;
            
            if (cacheOption) {
                product = productCachePersistencePort.getProduct(cmdt_id);
            } else {
                product = productPersistencePort.getProduct(cmdt_id);
            }
            
            String json = new ObjectMapper().writeValueAsString(productOutPort.getProductAuthor(cmdt_id).getData());
            
            ObjectMapper mapper = new ObjectMapper();
            
            ProductAuthor productAuthor = mapper.readValue(json, ProductAuthor.class);
            
            product.setAutr_code1(productAuthor.getAutr_code1());
            product.setAutr_name1(productAuthor.getAutr_name1());
            product.setAutr_code2(productAuthor.getAutr_code2());
            product.setAutr_name2(productAuthor.getAutr_name2());
            product.setAutr_code3(productAuthor.getAutr_code3());
            product.setAutr_name3(productAuthor.getAutr_name3());
            
            Product detail = productGrpcPort.getProductDetail(cmdt_id);
            
            product.setBkrv_cntt(detail.getBkrv_cntt());
            product.setCtnt_cntt(detail.getCtnt_cntt());
            
            responseMessage = ResponseMessage.builder()
                    .data(product)
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete"))
                    .build();
            
        } catch(Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        
        return responseMessage;
    }

    @Override
    public ResponseMessage insertProduct(boolean cacheOption, boolean dbType, Product product) throws BizRuntimeException {
        
        ResponseMessage responseMessage = null;
        
        try {
            
            if(dbType) {
                productPersistencePort.insertReaderDBProduct(product);
            } else {
                
                if (cacheOption) {
                    productCachePersistencePort.insertProduct(product);
                } else {
                    productPersistencePort.insertProduct(product);
                }
            }
            
            ProductAuthor productAuthor = ProductAuthor.builder()
                    .cmdt_id(product.getCmdt_id())
                    .autr_code1(product.getAutr_code1())
                    .autr_name1(product.getAutr_name1())
                    .autr_code2(product.getAutr_code2())
                    .autr_name2(product.getAutr_name2())
                    .autr_code3(product.getAutr_code3())
                    .autr_name3(product.getAutr_name3())
                    .build();
            
            productOutPort.insertProductAuthor(productAuthor);
            
            productGrpcPort.insertProductDetail(product);
            
            responseMessage = ResponseMessage.builder()
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete"))
                    .build();
            
        } catch(Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        
        return responseMessage;
        
    }

    @Override
    public ResponseMessage updateProduct(boolean cacheOption, Product product) throws BizRuntimeException {
        
        ResponseMessage responseMessage = null;
        
        try {
            
            if (cacheOption) {
                productCachePersistencePort.updateProduct(product);
            } else {
                productPersistencePort.updateProduct(product);
            }
            
            ProductAuthor productAuthor = ProductAuthor.builder()
                    .cmdt_id(product.getCmdt_id())
                    .autr_code1(product.getAutr_code1())
                    .autr_name1(product.getAutr_name1())
                    .autr_code2(product.getAutr_code2())
                    .autr_name2(product.getAutr_name2())
                    .autr_code3(product.getAutr_code3())
                    .autr_name3(product.getAutr_name3())
                    .build();
            
            productOutPort.updateProductAuthor(productAuthor);
            
            productGrpcPort.updateProductDetail(product);
            
            responseMessage = ResponseMessage.builder()
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete"))
                    .build();
            
        } catch(Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        
        return responseMessage;
        
    }

    @Override
    public ResponseMessage deleteProduct(boolean cacheOption, String cmdt_id) throws BizRuntimeException {
        
        ResponseMessage responseMessage = null;
        
        try {
            
            if (cacheOption) {
                productCachePersistencePort.deleteProduct(cmdt_id);
            } else {
                productPersistencePort.deleteProduct(cmdt_id);
            }
            
            productOutPort.deleteProductAuthor(cmdt_id);
            
            productGrpcPort.deleteProductDetail(cmdt_id);
            
            responseMessage = ResponseMessage.builder()
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete"))
                    .build();
            
        } catch(Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        
        return responseMessage;
        
    }

    @Override
    public ResponseMessage selectAuthors() {
        
        return productOutPort.selectAuthors();
        
    }
}
