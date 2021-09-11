/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * sykim@kyobobook.com      2021. 8. 30.
 *
 ****************************************************/
package kyobobook.application.adapter.out.persistence.product;

import java.util.List;

import kyobobook.application.adapter.out.persistence.product.entity.AuthorEntity;
import kyobobook.application.adapter.out.persistence.product.entity.ProductEntity;
import kyobobook.config.annotation.ReaderInterface;

/**
 * @Project     : common-prototype-api
 * @FileName    : ProductReaderMapper.java
 * @Date        : 2021. 8. 31.
 * @author      : sykim@kyobobook.com
 * @description : Reader Database의 Tec01-32 데이터 처리용 Mapper
 */
@ReaderInterface
public interface ProductReaderMapper {
    
    /**
     * @Method      : selectProducts
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 목록을 조회 한다.
     * @return
     */
    List<ProductEntity> selectProducts();
    
    /**
     * @Method      : getProduct
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 정보를 조회 한다.
     * @param cmdt_id
     * @return
     */
    ProductEntity getProduct(String cmdt_id);
    
    /**
     * @Method      : selectAuthors
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 저자 목록을 조회한다.
     * @return
     */
    List<AuthorEntity> selectAuthors();
    
    /**
     * @Method      : insertProductCmdt
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 마스터 (TM_CMDT) 정보를 등록한다. :: 오류 발생 용
     * @param productEntity
     */
    void insertProductCmdt(ProductEntity productEntity);
    
    /**
     * @Method      : insertProductAutr
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 저자 (TD_CMDT_AUTR) 정보를 등록한다. :: 오류 발생 용
     * @param productEntity
     */
    void insertProductAutr(ProductEntity productEntity);
    
    /**
     * @Method      : insertProductPrce
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 정가 (TD_CMDT_PRCE) 정보를 등록한다. :: 오류 발생 용
     * @param productEntity
     */
    void insertProductPrce(ProductEntity productEntity);
}
