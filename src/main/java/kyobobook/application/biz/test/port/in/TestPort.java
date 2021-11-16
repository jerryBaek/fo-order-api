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
package kyobobook.application.biz.test.port.in;

import kyobobook.application.domain.common.ResponseMessage;

/**
 * @Project : fo-order-api
 * @FileName : SamplePort.java
 * @Date : 2021. 8. 12.
 * @author : smlee1@kyobobook.com
 * @description : Adapter 에서 Sample Service의 Business 로직에 접근하기 위한 Port
 */
public interface TestPort {

    ResponseMessage selectMultipleData();

    ResponseMessage selectNonMultipleData(String ordrId);

    ResponseMessage selectMultipleDataUsingRpc();

    ResponseMessage selectNonMultipleDataUsingRpc(String ordrId);
    
//    ResponseMessage selectCartList();
//
//    /**
//     * @Method      : updateCartCheck
//     * @Date        : 2021. 11. 10.
//     * @author      : seohee.ko@kyobobook.com
//     * @description : 
//     * @param unfyCmdtId
//     * @return
//     */
//    ResponseMessage updateCartCheck(String unfyCmdtId);

}
