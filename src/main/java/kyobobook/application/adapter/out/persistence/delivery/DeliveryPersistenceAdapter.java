/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * kimsehoon@kyobobook.com      2021. 11. 24.
 *
 ****************************************************/
package kyobobook.application.adapter.out.persistence.delivery;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import kyobobook.application.adapter.out.persistence.delivery.entity.TSoDlvrAddrMEntity;
import kyobobook.application.biz.cart.port.out.DeliveryPersistencePort;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project : fo-order-api
 * @FileName : DeliveryPersistenceAdapter.java
 * @Date : 2021. 11. 24.
 * @author : kimsehoon@kyobobook.com
 * @description : 배송 데이터베이스 어댑터
 */
@Slf4j
@Repository("deliveryPersistenceRepository")
public class DeliveryPersistenceAdapter implements DeliveryPersistencePort {

    /** 배송 읽기 매퍼 */
    @Autowired
    private DeliveryReaderMapper reader;

    /** 배송 쓰기 매퍼 */
    @Autowired
    private DeliveryWriterMapper writer;
    
    @Override
    public List<TSoDlvrAddrMEntity> selectDeliveryList() throws Exception {
        
        log.debug("########### 배송지 목록조회 Adapter :: ");
        
        List<TSoDlvrAddrMEntity> data = this.reader.selectDeliveryList();
        
        return data;
        
    }
}
