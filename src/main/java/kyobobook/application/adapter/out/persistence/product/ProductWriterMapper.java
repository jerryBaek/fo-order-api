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

import kyobobook.application.adapter.out.persistence.product.entity.ProductEntity;
import kyobobook.config.annotation.WriterInterface;

/**
 * @Project     : common-prototype-api
 * @FileName    : ProductWriterMapper.java
 * @Date        : 2021. 8. 31.
 * @author      : sykim@kyobobook.com
 * @description : Writer Database의 Tec01-32 데이터 처리용 Mapper
 */
@WriterInterface
public interface ProductWriterMapper {
    
    /**
     * @Method      : insertProductCmdt
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 마스터 (TM_CMDT) 정보를 등록한다.
     * @param productEntity
     */
    void insertProductCmdt(ProductEntity productEntity);
    
    /**
     * @Method      : insertProductAutr
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 저자 (TD_CMDT_AUTR) 정보를 등록한다.
     * @param productEntity
     */
    void insertProductAutr(ProductEntity productEntity);
    
    /**
     * @Method      : insertProductPrce
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 정가 (TD_CMDT_PRCE) 정보를 등록한다.
     * @param productEntity
     */
    void insertProductPrce(ProductEntity productEntity);
    
    /**
     * @Method      : updateProductCmdt
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 마스터 (TM_CMDT) 정보를 수정한다.
     * @param productEntity
     */
    void updateProductCmdt(ProductEntity productEntity);
    
    /**
     * @Method      : updateProductAutr
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 저자 (TD_CMDT_AUTR) 정보를 수정한다.
     * @param productEntity
     */
    void updateProductAutr(ProductEntity productEntity);
    
    /**
     * @Method      : updateProductPrce
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 정가 (TD_CMDT_PRCE) 정보를 수정한다.
     * @param productEntity
     */
    void updateProductPrce(ProductEntity productEntity);
    
    /**
     * @Method      : deleteProductCmdt
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 마스터 (TM_CMDT) 정보를 삭제한다.
     * @param cmdt_id
     */
    void deleteProductCmdt(String cmdt_id);
    
    /**
     * @Method      : deleteProductAutr
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 저자 (TD_CMDT_AUTR) 정보를 삭제한다.
     * @param cmdt_id
     */
    void deleteProductAutr(String cmdt_id);
    
    /**
     * @Method      : deleteProductPrce
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 정가 (TD_CMDT_PRCE) 정보를 삭제한다.
     * @param cmdt_id
     */
    void deleteProductPrce(String cmdt_id);
}
