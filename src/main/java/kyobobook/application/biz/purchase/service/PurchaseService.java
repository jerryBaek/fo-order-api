/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * kimsehoon@kyobobook.com      2021. 11. 12.
 *
 ****************************************************/
package kyobobook.application.biz.purchase.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import kyobobook.application.biz.purchase.port.in.PurchasePort;
import kyobobook.application.biz.purchase.port.out.PurchasePersistencePort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.purchase.PurchaseProduct;
import kyobobook.exception.BizRuntimeException;

/**
 * @Project     : fo-order-api
 * @FileName    : PurchaseService.java
 * @Date        : 2021. 11. 12.
 * @author      : kimsehoon@kyobobook.com
 * @description : 구매 서비스
 */
@Service
public class PurchaseService implements PurchasePort {
    
    /** 구매 저장소 */
    @Autowired
    private PurchasePersistencePort purchaseRepository;
    
    /** 메시지 소스 */
    @Autowired
    private MessageSourceAccessor messageSource;

    @Override
    public ResponseMessage getPurchasedInCart(Integer limitYear) {
        
        ResponseMessage result = null;
        
        try {
            
            List<PurchaseProduct> resultList = this.purchaseRepository.getPurchasedInCart(limitYear);
            result = ResponseMessage.builder()
                    .data(resultList)
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete"))
                    .build();
            
        } catch (Exception e) {
            
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
            
        }
        
        return result;
        
    }

}
