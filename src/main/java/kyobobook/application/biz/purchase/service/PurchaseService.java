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
import kyobobook.common.Constants;
import kyobobook.exception.BizRuntimeException;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project : fo-order-api
 * @FileName : PurchaseService.java
 * @Date : 2021. 11. 12.
 * @author : kimsehoon@kyobobook.com
 * @description : 구매 서비스
 */
@Slf4j
@Service
public class PurchaseService implements PurchasePort {

    /** 구매 저장소 */
    @Autowired
    private PurchasePersistencePort purchaseRepository;

    /** 메시지 소스 */
    @Autowired
    private MessageSourceAccessor messageSource;

    @Override
    public ResponseMessage getPurchasedInCart() {

        ResponseMessage result = null;

        // TODO 회원세션정보에서 가져와야 함
        String mmbrNum = "62210667167";
        log.debug("회원번호 : {}", mmbrNum);

        try {

            List<PurchaseProduct> resultList = this.purchaseRepository.getPurchasedInCart(mmbrNum);
            log.debug("장바구니 상품 1년 이내 구매 내역 조회결과 : {}", resultList);

            result = ResponseMessage.builder().data(resultList).statusCode(HttpStatus.OK.value())
                    .resultMessage(this.messageSource.getMessage(Constants.MessageSource.COMPLETE)).build();

        } catch (Exception e) {

            throw new BizRuntimeException(this.messageSource.getMessage(Constants.MessageSource.ERROR), e);

        }

        return result;

    }

}
