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
package kyobobook.application.biz.cart.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import kyobobook.application.adapter.out.persistence.delivery.entity.TSoDlvrAddrMEntity;
import kyobobook.application.biz.cart.port.in.DeliveryPort;
import kyobobook.application.biz.cart.port.out.DeliveryPersistencePort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.delivery.DeliveryAddress;
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

    /** 배송지 저장소 */
    @Autowired
    @Qualifier("deliveryPersistenceRepository")
    private DeliveryPersistencePort deliveryRepository;

    /** 메시지 소스 */
    @Autowired
    private MessageSourceAccessor messageSource;
    
    @Override
    public ResponseMessage selectDeliveryList() {
        
        log.debug("########### 배송지 목록조회 Service :: ");
        
        ResponseMessage responseMessage = null;
        
        try {
            List<TSoDlvrAddrMEntity> returnData = this.deliveryRepository.selectDeliveryList();
            responseMessage = ResponseMessage.builder()
                    .data(returnData) // 조회
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(this.messageSource.getMessage("common.process.complete"))
                    .build();

        } catch (Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage deleteDeliveryAddress(Integer dlpnSrmb) {
        
        log.debug("########### 배송지 삭제 Service :: ");
        
        ResponseMessage responseMessage = null;
        
        try {
            responseMessage = ResponseMessage.builder()
                    .data(this.deliveryRepository.deleteDeliveryAddress(dlpnSrmb))
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(this.messageSource.getMessage("common.process.complete"))
                    .build();

        } catch (Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        return responseMessage;
    }


}
