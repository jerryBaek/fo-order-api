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
import kyobobook.application.adapter.out.persistence.delivery.entity.TSoDlvrAddrMInsertEntity;
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
     * @Method : deleteDeliveryAddress
     * @Date : 2021. 11. 25.
     * @author : seohee.ko@kyobobook.com
     * @description : 배송지 삭제
     * @param tSoDlvrAddrMEntity
     * @return
     */
    Integer deleteDeliveryAddress(TSoDlvrAddrMEntity tSoDlvrAddrMEntity);

    /**
     * @Method : insertTSoDlvrAddrM
     * @Date : 2021. 11. 24.
     * @author : kimsehoon@kyobobook.com
     * @description : 배송주소 등록 (배송주소가 10개를 초과하는 경우 등록하지 않음)
     * @param tSoDlvrAddrMInsertEntity 배송정보
     * @return
     */
    public Boolean insertDeliveryAddress(TSoDlvrAddrMInsertEntity tSoDlvrAddrMInsertEntity);

    /**
     * @Method : updateDeliveryAddressDefaultClear
     * @Date : 2021. 11. 25.
     * @author : kimsehoon@kyobobook.com
     * @description : 기본배송주소 해제
     * @param mmbrNum 회원번호
     * @return
     */
    public Integer updateDeliveryAddressDefaultClear(String mmbrNum);

    /**
     * @Method      : updateDeliveryAddress
     * @Date        : 2021. 11. 25.
     * @author      : seohee.ko@kyobobook.com
     * @description : 사용자 배송지 기본배송지여부 상태 갱신
     * @param tSoDlvrAddrMEntity
     * @return
     */
    Integer updateDeliveryAddress(TSoDlvrAddrMEntity tSoDlvrAddrMEntity);

}
