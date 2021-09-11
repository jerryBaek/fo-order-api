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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import kyobobook.application.biz.product.port.in.ProductPort;
import kyobobook.application.biz.product.port.out.ProductGrpcPort;
import kyobobook.application.biz.product.port.out.ProductPersistencePort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.product.Product;
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
    
    @Autowired
    @Qualifier("productPersistenceRepository")
    ProductPersistencePort productPersistencePort;
    
    @Autowired
    @Qualifier("productCachePersistenceRepository")
    ProductPersistencePort productCachePersistencePort;
    
    @Autowired
    @Qualifier("grpcProductAdapter")
    ProductGrpcPort productGrpcPort;
    
    @Autowired
    MessageSourceAccessor messageSource;
    
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
    public ResponseMessage selectAuthors() throws BizRuntimeException {
        
        ResponseMessage responseMessage = null;
        
        try {
            responseMessage = ResponseMessage.builder()
                    .data(productPersistencePort.selectAuthors())
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete"))
                    .build();
            
        } catch(Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        
        return responseMessage;
        
    }
}
