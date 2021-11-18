/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com           2021. 8. 12.  First Draft.
 *
 ****************************************************/
package kyobobook.application.biz.cart.port.in;

import kyobobook.application.domain.common.ResponseMessage;

/**
 * @Project     : fo-order-api
 * @FileName    : CartPort.java
 * @Date        : 2021. 11. 11.
 * @author      : kimsehoon@kyobobook.com
 * @description : 장바구니 포트
 */
public interface CartPort {

    /**
     * @Method      : selectCartList
     * @Date        : 2021. 11. 11.
     * @author      : seohee.ko@kyobobook.com
     * @description : 장바구니 목록 조회
     * @return
     */
    @Deprecated
    ResponseMessage selectCartList();

    /**
     * @Method      : updateCartCheck
     * @Date        : 2021. 11. 11.
     * @author      : seohee.ko@kyobobook.com
     * @description : 장바구니 체크박스 업데이트
     * @param unfyCmdtId
     * @return
     */
    ResponseMessage updateCartCheck(String unfyCmdtId);

    /**
     * @Method      : removeProduct
     * @Date        : 2021. 11. 11.
     * @author      : seohee.ko@kyobobook.com
     * @description : 장바구니 상품삭제(상태변경)
     * @param unfyCmdtId
     * @return
     */
    ResponseMessage removeProduct(String unfyCmdtId);
    
    /**
     * @Method      : removeProducts
     * @Date        : 2021. 11. 11.
     * @author      : seohee.ko@kyobobook.com
     * @description : 장바구니 상품삭제(상태변경)
     * @return
     */
    ResponseMessage removeProducts();

}
