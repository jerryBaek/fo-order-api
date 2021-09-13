/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * sykim@kyobobook.com      2021. 9. 9.
 *
 ****************************************************/
package kyobobook.application.biz.product.port.out;

import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.product.ProductAuthor;

/**
 * @Project     : common-prototype-api
 * @FileName    : ProductOutPort.java
 * @Date        : 2021. 9. 12.
 * @author      : sykim@kyobobook.com
 * @description : TEC01-32 Service Mesh 연동 구성 : Service에서 상품 정보를 처리하기 위한 Port
 */
public interface ProductOutPort {
    
    /**
     * @Method      : selectAuthors
     * @Date        : 2021. 9. 12.
     * @author      : sykim@kyobobook.com
     * @description : 저자 목록을 조회한다.
     * @return
     */
    ResponseMessage selectAuthors();
    
    /**
     * @Method      : selectProductAuthors
     * @Date        : 2021. 9. 12.
     * @author      : sykim@kyobobook.com
     * @description : 상품별 저자 목록을 조회한다.
     * @return
     */
    ResponseMessage selectProductAuthors();
    
    /**
     * @Method      : getProductAuthor
     * @Date        : 2021. 9. 12.
     * @author      : sykim@kyobobook.com
     * @description : 상품별 저자 정보를 조회한다.
     * @param cmdt_id
     * @return
     */
    ResponseMessage getProductAuthor(String cmdt_id);
    
    /**
     * @Method      : insertProductAuthor
     * @Date        : 2021. 9. 12.
     * @author      : sykim@kyobobook.com
     * @description : 상품별 저자 정보를 등록한다.
     * @param productAuthor
     * @return
     */
    ResponseMessage insertProductAuthor(ProductAuthor productAuthor);
    
    /**
     * @Method      : updateProductAuthor
     * @Date        : 2021. 9. 12.
     * @author      : sykim@kyobobook.com
     * @description : 상품별 저자 정보를 수정한다.
     * @param productAuthor
     * @return
     */
    ResponseMessage updateProductAuthor(ProductAuthor productAuthor);
    
    /**
     * @Method      : deleteProductAuthor
     * @Date        : 2021. 9. 12.
     * @author      : sykim@kyobobook.com
     * @description : 상품별 저자 정보를 삭제한다.
     * @param cmdt_id
     * @return
     */
    ResponseMessage deleteProductAuthor(String cmdt_id);
}
