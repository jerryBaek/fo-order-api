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
package kyobobook.application.biz.cart.port.out;

import java.util.List;
import kyobobook.application.adapter.out.persistence.delivery.entity.TSoDlvrAddrMEntity;
import kyobobook.application.domain.delivery.DeliveryAddress;

/**
 * @Project : fo-order-api
 * @FileName : DeliveryPersistencePort.java
 * @Date : 2021. 11. 24.
 * @author : kimsehoon@kyobobook.com
 * @description : 배송 데이터베이스 포트
 */
public interface DeliveryPersistencePort {
    List<TSoDlvrAddrMEntity> selectDeliveryList() throws Exception;

    /**
     * @Method      : deleteDeliveryAddress
     * @Date        : 2021. 11. 25.
     * @author      : seohee.ko@kyobobook.com
     * @description : 배송지 삭제
     * @param dlpnSrmb
     * @return
     */
    Integer deleteDeliveryAddress(Integer dlpnSrmb);
}
