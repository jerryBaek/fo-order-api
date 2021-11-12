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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import kyobobook.application.adapter.out.persistence.test.entity.TestCart;
import kyobobook.application.biz.cart.port.in.CartPort;
import kyobobook.application.biz.cart.port.out.CartPersistencePort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.exception.BizRuntimeException;

/**
 * @Project     : fo-order-api
 * @FileName    : CartService.java
 * @Date        : 2021. 11. 11.
 * @author      : kimsehoon@kyobobook.com
 * @description : 장바구니 서비스
 */
@Service
public class CartService implements CartPort {

    private static final Logger logger = LoggerFactory.getLogger(CartService.class);

//    @Qualifier("cartWriterRepository")
//    private CartPersistencePort cartWriterPort;

    @Autowired
    @Qualifier("cartRepository")
    private CartPersistencePort cartRepository;

    @Autowired
    private MessageSourceAccessor messageSource;

    @Override
    public ResponseMessage selectCartList() {
        
        ResponseMessage responseMessage = null;
        
        try {
            logger.debug("reader port >> " + this.cartRepository);
            List<TestCart> returnData = this.cartRepository.selectCartList();
            logger.debug("data size >> " + returnData.size());
            responseMessage = ResponseMessage.builder().data(returnData) // 조회
                    .statusCode(HttpStatus.OK.value()).resultMessage("완료끄..").build();

        } catch (Exception e) {
            throw new BizRuntimeException("오류끄..");
//            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage updateCartCheck(String unfyCmdtId) {
        
        ResponseMessage responseMessage = null;
        
        try {
            responseMessage = ResponseMessage.builder().data(this.cartRepository.updateCartCheck(unfyCmdtId)) 
                    .statusCode(HttpStatus.OK.value()).resultMessage("완료끄..").build();

        } catch (Exception e) {
            throw new BizRuntimeException("오류끄..");
//            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage deleteCartCheck(String checkList) {
        ResponseMessage responseMessage = null;
        
        try {
            responseMessage = ResponseMessage.builder().data(this.cartRepository.deleteCartCheck(checkList)) 
                    .statusCode(HttpStatus.OK.value()).resultMessage("완료끄..").build();

        } catch (Exception e) {
            throw new BizRuntimeException("오류끄..");
//            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        return responseMessage;
    }

}
