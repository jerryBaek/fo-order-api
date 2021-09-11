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
package kyobobook.application.biz.product.port.out;

import java.util.List;

import kyobobook.application.domain.product.Author;
import kyobobook.application.domain.product.Product;

/**
 * @Project     : common-prototype-api
 * @FileName    : ProductPersistencePort.java
 * @Date        : 2021. 8. 31.
 * @author      : sykim@kyobobook.com
 * @description : TEC01-32 Service Mesh 연동 구성 Prototype : Database 처리를 위한 Port
 */
public interface ProductPersistencePort {

    /**
     * @Method      : selectProducts
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 목록을 조회한다.
     * @return
     * @throws Exception
     */
    List<Product> selectProducts() throws Exception;

    /**
     * @Method      : getProduct
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 정보를 조회한다.
     * @param cmdt_id
     * @return
     * @throws Exception
     */
    Product getProduct(String cmdt_id) throws Exception;

    /**
     * @Method      : insertProduct
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 정보를 등록한다.
     * @param product
     * @return
     * @throws Exception
     */
    Product insertProduct(Product product) throws Exception;

    /**
     * @Method      : updateProduct
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 정보를 수정한다. 
     * @param product
     * @throws Exception
     */
    void updateProduct(Product product) throws Exception;

    /**
     * @Method      : deleteProduct
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 정보를 삭제한다.
     * @param cmdt_id
     * @throws Exception
     */
    void deleteProduct(String cmdt_id) throws Exception;

    /**
     * @Method      : selectAuthors
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 저자 목록을 조회한다.
     * @return
     * @throws Exception
     */
    List<Author> selectAuthors() throws Exception;
    
    /**
     * @Method      : insertReaderDBProduct
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : READER DB에 상품 정보를 등록한다. :: 오류 발생용
     * @param product
     * @return
     * @throws Exception
     */
    Product insertReaderDBProduct(Product product) throws Exception;
}
