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
package kyobobook.application.biz.delivery.port.out;

import java.util.List;

import kyobobook.application.adapter.out.persistence.delivery.entity.TSoDlvrAddrMEntity;
import kyobobook.application.domain.delivery.DeliveryAddressBefore;

/**
 * @Project : fo-order-api
 * @FileName : DeliveryPersistencePort.java
 * @Date : 2021. 11. 24.
 * @author : kimsehoon@kyobobook.com
 * @description : 배송 데이터베이스 포트
 */
public interface DeliveryPersistencePort {

    /**
     * @Method : selectDeliveryList
     * @Date : 2021. 11. 25.
     * @author : kimsehoon@kyobobook.com
     * @description : 배송목록 조회
     * @return
     * @throws Exception
     */
    List<TSoDlvrAddrMEntity> selectDeliveryList(String searchMmbrNum) throws Exception;

    /**
     * @Method : deleteDeliveryAddress
     * @Date : 2021. 11. 25.
     * @author : seohee.ko@kyobobook.com
     * @description : 사용자 배송지 단건 삭제(삭제여부 갱신)
     * @param deliveryAddress
     * @return
     */
    Integer deleteDeliveryAddress(DeliveryAddressBefore deliveryAddress);

    /**
     * @Method : insertDeliveryAddress
     * @Date : 2021. 11. 24.
     * @author : kimsehoon@kyobobook.com
     * @description : 배송주소 추가 (배송주소가 10개를 초과하는 경우 등록하지 않음)
     * @param deliveryAddress 배송주소
     * @return
     */
    Boolean insertDeliveryAddress(DeliveryAddressBefore deliveryAddress);

    /**
     * @Method : updateDeliveryAddressDefaultClear
     * @Date : 2021. 11. 25.
     * @author : kimsehoon@kyobobook.com
     * @description : 기본배송주소 해제
     * @param mmbrNum 회원번호
     * @return
     */
    Integer updateDeliveryAddressDefaultClear(String mmbrNum);

    /**
     * @Method      : getDeliveryAddress
     * @Date        : 2021. 11. 25.
     * @author      : seohee.ko@kyobobook.com
     * @description : 사용자 배송지 단건 조회
     * @param deliveryAddress
     * @return
     */
    DeliveryAddressBefore getDeliveryAddress(DeliveryAddressBefore deliveryAddress);

    /**
     * @Method      : updateDeliveryAddress
     * @Date        : 2021. 11. 25.
     * @author      : seohee.ko@kyobobook.com
     * @description : 사용자 배송지 기본배송지여부 상태 갱신
     * @param mmbrNum
     */
    Integer updateDeliveryAddress(String mmbrNum);

    /**
     * @Method      : updateDeliveryAddress
     * @Date        : 2021. 12. 2.
     * @author      : seohee.ko@kyobobook.com
     * @description : 배송주소록 수정
     * @param deliveryAddress
     * @return
     */
    int updateDeliveryAddress(DeliveryAddressBefore deliveryAddress);

}
