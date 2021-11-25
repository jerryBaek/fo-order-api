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
package kyobobook.application.biz.delivery.port.in;

import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.delivery.DeliveryAddress;

/**
 * @Project : fo-order-api
 * @FileName : DeliveryPort.java
 * @Date : 2021. 11. 24.
 * @author : kimsehoon@kyobobook.com
 * @description : 배송 포트
 */
public interface DeliveryPort {
    /**
     * @Method : selectDeliveryList
     * @Date : 2021. 11. 24.
     * @author : opoiper@kyobobook.com
     * @description : 배송지 목록 조회
     * @return
     */
    ResponseMessage selectDeliveryList();

    /**
     * @Method : deleteDeliveryAddress
     * @Date : 2021. 11. 25.
     * @author : seohee.ko@kyobobook.com
     * @description : 배송지 삭제
     * @param dlpnSrmb
     * @return
     */
    ResponseMessage deleteDeliveryAddress(Integer dlpnSrmb);

    /**
     * @Method : addDeliveryAddress
     * @Date : 2021. 11. 24.
     * @author : kimsehoon@kyobobook.com
     * @description : 배송주소 추가 (배송주소가 10개를 초과하는 경우 등록하지 않음)
     * @param deliveryAddress 배송주소
     * @return
     */
    ResponseMessage insertDeliveryAddress(DeliveryAddress deliveryAddress);

}
