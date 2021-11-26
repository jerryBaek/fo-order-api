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
package kyobobook.application.biz.delivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import kyobobook.application.adapter.out.persistence.delivery.entity.TSoDlvrAddrMEntity;
import kyobobook.application.adapter.out.persistence.delivery.entity.TSoDlvrAddrMInsertEntity;
import kyobobook.application.biz.delivery.port.in.DeliveryPort;
import kyobobook.application.biz.delivery.port.out.DeliveryPersistencePort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.delivery.DeliveryAddress;
import kyobobook.common.Constants;
import kyobobook.exception.BizRuntimeException;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project : fo-order-api
 * @FileName : DeliveryService.java
 * @Date : 2021. 11. 24.
 * @author : kimsehoon@kyobobook.com
 * @description : 배송 서비스
 */
@Slf4j
@Service
public class DeliveryService implements DeliveryPort {

    /** 장바구니 저장소 */
    @Autowired
    @Qualifier("deliveryPersistenceRepository")
    private DeliveryPersistencePort deliveryRepository;

    /** 메시지 소스 */
    @Autowired
    private MessageSourceAccessor messageSource;

    @Override
    public ResponseMessage selectDeliveryList(String searchMmbrNum) {

        log.debug("########### 배송지 목록조회 Service :: ");

        ResponseMessage responseMessage = null;

        try {
            List<TSoDlvrAddrMEntity> returnData = this.deliveryRepository.selectDeliveryList(searchMmbrNum);
            responseMessage = ResponseMessage.builder().data(returnData) // 조회
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(this.messageSource.getMessage("common.process.complete")).build();

        } catch (Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage deleteDeliveryAddress(String dlpnSrmb) {

        log.debug("########### 배송지 삭제 Service :: ");

        ResponseMessage responseMessage = null;
        
        // TODO mmbrNum 세션에서 획득해야함.
        DeliveryAddress deliveryAddress = DeliveryAddress.builder()
                                                         .mmbrNum("62210667167")
                                                         .dlpnSrmb(dlpnSrmb)
                                                         .build();

        try {
            
            // 배송지 상태 확인
            DeliveryAddress valiDeliveryAddress = this.deliveryRepository.getDeliveryAddress(deliveryAddress);
            
            if(valiDeliveryAddress != null) {
                
                responseMessage = ResponseMessage.builder().data(this.deliveryRepository.deleteDeliveryAddress(deliveryAddress))
                        .statusCode(HttpStatus.OK.value())
                        .resultMessage(this.messageSource.getMessage("common.process.complete")).build();
                
                // 기본배송지여부 갱신
                this.deliveryRepository.updateDeliveryAddress(deliveryAddress.getMmbrNum());
                
            } else {
                // 삭제할 데이터 없음
            }

        } catch (Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage insertDeliveryAddress(DeliveryAddress deliveryAddress) {

        ResponseMessage responseMessage = null;

        // TODO 회원주소 세션에서 가져와야 함
        deliveryAddress.setMmbrId("kimsehoon@kyobobook.com");
        deliveryAddress.setMmbrNum("62210667167");

        try {

            if (deliveryAddress.isDefaultAddress()) {

                Integer clearCount = this.deliveryRepository
                        .updateDeliveryAddressDefaultClear(deliveryAddress.getMmbrNum());
                log.debug("기본배송지로 등록하므로 다른 배송주소에 대한 기본배송지 설정을 {}개를 해제하였습니다.", clearCount);

            }

            Boolean result = this.deliveryRepository.insertDeliveryAddress(deliveryAddress);

            if (result) {

                responseMessage = ResponseMessage.builder().data(deliveryAddress).statusCode(HttpStatus.OK.value())
                        .resultMessage(this.messageSource.getMessage(Constants.MessageSource.COMPLETE)).build();

            } else {

                responseMessage = ResponseMessage.builder().data(deliveryAddress).statusCode(HttpStatus.OK.value())
                        .resultMessage(this.messageSource.getMessage(Constants.MessageSource.ERROR))
                        .detailMessage(this.messageSource.getMessage("delivery.address.insert.error.excess",
                                new Object[] { TSoDlvrAddrMInsertEntity.MAX_INSERT_COUNT }))
                        .build();

            }

        } catch (Exception e) {

            throw new BizRuntimeException(messageSource.getMessage(Constants.MessageSource.ERROR), e);

        }

        return responseMessage;

    }

}
