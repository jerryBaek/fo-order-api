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

import java.util.List;
import kyobobook.application.adapter.out.persistence.delivery.entity.TSoDlvrAddrMEntity;
import kyobobook.config.annotation.ReaderInterface;

/**
 * @Project : fo-order-api
 * @FileName : DeliveryReaderMapper.java
 * @Date : 2021. 11. 24.
 * @author : kimsehoon@kyobobook.com
 * @description : 배송 읽기 매퍼
 */
@ReaderInterface
public interface DeliveryReaderMapper {

    /**
     * @Method      : selectDeliveryList
     * @Date        : 2021. 11. 9.
     * @author      : opoiper@kyobobook.com
     * @description : 
     * @return
     */
    List<TSoDlvrAddrMEntity> selectDeliveryList();
}
