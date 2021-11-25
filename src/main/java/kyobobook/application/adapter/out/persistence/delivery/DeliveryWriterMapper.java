/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * kimsehoon@kyobobook.com      2021. 10. 27.
 *
 ****************************************************/
package kyobobook.application.adapter.out.persistence.delivery;

import kyobobook.application.adapter.out.persistence.delivery.entity.TSoDlvrAddrMEntity;
import kyobobook.application.domain.delivery.DeliveryAddress;
import kyobobook.config.annotation.WriterInterface;

/**
 * @Project : fo-order-api
 * @FileName : DeliveryReaderMapper.java
 * @Date : 2021. 11. 24.
 * @author : kimsehoon@kyobobook.com
 * @description : 배송 쓰기 매퍼
 */
@WriterInterface
public interface DeliveryWriterMapper {

    /**
     * @Method      : deleteDeliveryAddress
     * @Date        : 2021. 11. 25.
     * @author      : seohee.ko@kyobobook.com
     * @description : 배송지 삭제
     * @param tSoDlvrAddrMEntity
     * @return
     */
    Integer deleteDeliveryAddress(TSoDlvrAddrMEntity tSoDlvrAddrMEntity);

}
