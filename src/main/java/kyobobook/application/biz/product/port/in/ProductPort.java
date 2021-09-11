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
package kyobobook.application.biz.product.port.in;

import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.product.Product;
import kyobobook.exception.BizRuntimeException;

/**
 * @Project     : common-prototype-api
 * @FileName    : ProductPort.java
 * @Date        : 2021. 8. 31.
 * @author      : sykim@kyobobook.com
 * @description : TEC01-32 Service Mesh 연동 구성 : Adapter에서 Service Business Logic에 접근하기 위한 Port
 */
public interface ProductPort {

    /**
     * @Method      : selectProducts
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : Reader DB - 상품 목록을 조회한다.
     * @param cacheOption
     * @return
     * @throws BizRuntimeException
     */
    ResponseMessage selectProducts(boolean cacheOption) throws BizRuntimeException;

    /**
     * @Method      : getProduct
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : Reader DB - 상품 상세 정보를 조회한다.
     * @param cacheOption
     * @param cmdt_id
     * @return
     * @throws BizRuntimeException
     */
    ResponseMessage getProduct(boolean cacheOption, String cmdt_id) throws BizRuntimeException;

    /**
     * @Method      : insertProduct
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : Writer DB - 상품 정보를 등록한다.
     * @param cacheOption
     * @param dbType
     * @param product - {@link Product}
     * @return
     * @throws BizRuntimeException
     */
    ResponseMessage insertProduct(boolean cacheOption, boolean dbType, Product product) throws BizRuntimeException;

    /**
     * @Method      : updateProduct
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : Writer DB - 상품 정보를 수정한다.
     * @param cacheOption
     * @param product - {@link Product}
     * @return
     * @throws BizRuntimeException
     */
    ResponseMessage updateProduct(boolean cacheOption, Product product) throws BizRuntimeException;

    /**
     * @Method      : deleteProduct
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : Writer DB - 상품 정보를 삭제한다.
     * @param cacheOption
     * @param cmdt_id
     * @return
     * @throws BizRuntimeException
     */
    ResponseMessage deleteProduct(boolean cacheOption, String cmdt_id) throws BizRuntimeException;
    
    /**
     * @Method      : selectAuthors
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : Reader DB - 저자 목록을 조회한다.
     * @return
     * @throws BizRuntimeException
     */
    ResponseMessage selectAuthors() throws BizRuntimeException;

}
