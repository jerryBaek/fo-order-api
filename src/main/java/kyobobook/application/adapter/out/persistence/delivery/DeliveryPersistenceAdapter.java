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
import kyobobook.application.biz.delivery.port.out.DeliveryPersistencePort;
import kyobobook.application.domain.delivery.DeliveryAddressBefore;
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
    public List<TSoDlvrAddrMEntity> selectDeliveryList(String searchMmbrNum) throws Exception {

        log.debug("########### 배송지 목록조회 Adapter :: ");

        List<TSoDlvrAddrMEntity> data = this.reader.selectDeliveryList(searchMmbrNum);

        return data;

    }

    @Override
    public Integer deleteDeliveryAddress(DeliveryAddressBefore deliveryAddress) {

        log.debug("########### 배송지 삭제 Adapter :: ");

        TSoDlvrAddrMEntity tSoDlvrAddrMEntity = TSoDlvrAddrMEntity.builder().mmbrNum(deliveryAddress.getMmbrNum()).dlpnSrmb(deliveryAddress.getDlpnSrmb())
                .build();

        return this.writer.deleteDeliveryAddress(tSoDlvrAddrMEntity);
    }

    @Override
    public Boolean insertDeliveryAddress(DeliveryAddressBefore deliveryAddress) {

        return this.writer.insertDeliveryAddress(deliveryAddress.convertToInsertEntity());

    }

    @Override
    public Integer updateDeliveryAddressDefaultClear(String mmbrNum) {

        return this.writer.updateDeliveryAddressDefaultClear(mmbrNum);

    }

    @Override
    public DeliveryAddressBefore getDeliveryAddress(DeliveryAddressBefore searchDeliveryAddress) {
        TSoDlvrAddrMEntity tSoDlvrAddrMEntity = this.reader.getDeliveryAddress(searchDeliveryAddress);
        
        DeliveryAddressBefore deliveryAddress = DeliveryAddressBefore.builder()
                                                         .bscDlpnYsno(tSoDlvrAddrMEntity.getBscDlpnYsno())
                                                         .dlpnSrmb(tSoDlvrAddrMEntity.getDlpnSrmb())
                                                         .build();
        return deliveryAddress;
    }

    @Override
    public Integer updateDeliveryAddress(String mmbrNum) {
        
        return this.writer.updateDeliveryAddressStus(mmbrNum);
    }

    @Override
    public int updateDeliveryAddress(DeliveryAddressBefore deliveryAddress) {
        
        TSoDlvrAddrMEntity tSoDlvrAddrMEntity = TSoDlvrAddrMEntity.builder()
                                                                  .mmbrNum(deliveryAddress.getMmbrNum())
                                                                  .amnrId(deliveryAddress.getMmbrId())
                                                                  .dlpnSrmb(deliveryAddress.getDlpnSrmb())
                                                                  .dlpnName(deliveryAddress.getName())
                                                                  .tlnm(deliveryAddress.getTelephone())
                                                                  .cphnTlnm(deliveryAddress.getCellphone())
                                                                  .bscDlpnYsno(deliveryAddress.getBscDlpnYsno())
                                                                  .pssrNum(deliveryAddress.getZipcode())
                                                                  .bscAdrs(deliveryAddress.getBasicAddress())
                                                                  .dtlAdrs(deliveryAddress.getDetailAddress())
                                                                  .dlpnAtnmName(deliveryAddress.getAlias())
                                                                  .build();
        
        return this.writer.updateDeliveryAddress(tSoDlvrAddrMEntity);
    }

}
