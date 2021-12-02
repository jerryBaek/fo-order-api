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

import kyobobook.application.adapter.out.persistence.cart.entity.TmSpbkEntity;
import kyobobook.application.biz.cart.port.in.CartPort;
import kyobobook.application.biz.cart.port.out.CartPersistencePort;
import kyobobook.application.domain.cart.Cart;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.common.Constants;
import kyobobook.exception.BizRuntimeException;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project : fo-order-api
 * @FileName : CartService.java
 * @Date : 2021. 11. 11.
 * @author : kimsehoon@kyobobook.com
 * @description : 장바구니 서비스
 */
@Slf4j
@Service
public class CartService implements CartPort {

    /** 장바구니 저장소 */
    @Autowired
    @Qualifier("cartRepository")
    private CartPersistencePort cartRepository;

    /** 메시지 소스 */
    @Autowired
    private MessageSourceAccessor messageSource;

    @Deprecated
    @Override
    public ResponseMessage selectCartList() {

        ResponseMessage responseMessage = null;

        try {
            List<TmSpbkEntity> returnData = this.cartRepository.selectCartList();
            responseMessage = ResponseMessage.builder().data(returnData).statusCode(HttpStatus.OK.value())
                    .resultMessage(this.messageSource.getMessage(Constants.MessageSource.COMPLETE)).build();

        } catch (Exception e) {
            throw new BizRuntimeException(this.messageSource.getMessage(Constants.MessageSource.ERROR), e);
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage updateCartCheck(Cart cart) {

        ResponseMessage responseMessage = null;

        try {
            // int updateCnt = cartRepository.updateCartCheck(cart);
            responseMessage = ResponseMessage.builder().data(this.cartRepository.updateCartCheck(cart))
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(this.messageSource.getMessage(Constants.MessageSource.COMPLETE)).build();

        } catch (Exception e) {
            throw new BizRuntimeException(this.messageSource.getMessage(Constants.MessageSource.ERROR), e);
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage removeProduct(String unfyCmdtId) {

        ResponseMessage responseMessage = null;

        try {

            responseMessage = ResponseMessage.builder().data(this.cartRepository.deleteProduct(unfyCmdtId))
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(this.messageSource.getMessage(Constants.MessageSource.COMPLETE)).build();

        } catch (Exception e) {

            throw new BizRuntimeException(this.messageSource.getMessage(Constants.MessageSource.ERROR), e);

        }

        return responseMessage;

    }

    @Override
    public ResponseMessage removeProducts() {

        ResponseMessage responseMessage = null;

        // TODO 회원세션에서 정보 얻어와야 함
        String memno = "asdfasdfasd";

        try {

            responseMessage = ResponseMessage.builder().data(this.cartRepository.deleteProduct(memno))
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(this.messageSource.getMessage(Constants.MessageSource.COMPLETE)).build();

        } catch (Exception e) {

            throw new BizRuntimeException(this.messageSource.getMessage(Constants.MessageSource.ERROR), e);

        }

        return responseMessage;

    }

    @Override
    public ResponseMessage selectNewProductCode(String memberId) {
        ResponseMessage responseMessage = null;

        try {
            responseMessage = ResponseMessage.builder().data(this.cartRepository.selectNewProductCode(memberId))
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(this.messageSource.getMessage(Constants.MessageSource.COMPLETE)).build();

        } catch (Exception e) {
            throw new BizRuntimeException(this.messageSource.getMessage(Constants.MessageSource.ERROR), e);
        }
        
        return responseMessage;
    }
    
    
    /**
     * @Method      : selectCartGroupList
     * @Date        : 2021. 11. 29.
     * @author      : eszho@kyobobook.com
     * @description : 장바구니 그룹별 목록조회
     * @return
     */
    @Override
    public ResponseMessage selectCartGroupList(String memberId) {

        ResponseMessage responseMessage = null;

        try {
                List<TmSpbkEntity> returnData = this.cartRepository.selectCartGroupList(memberId);
                responseMessage = ResponseMessage.builder().data(returnData).statusCode(HttpStatus.OK.value())
                        .resultMessage(this.messageSource.getMessage(Constants.MessageSource.COMPLETE)).build();

        } catch (Exception e) {
            throw new BizRuntimeException(this.messageSource.getMessage(Constants.MessageSource.ERROR), e);
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage updateCartCheckAll(String chekVal) {
        ResponseMessage responseMessage = null;

        try {
            responseMessage = ResponseMessage.builder().data(this.cartRepository.updateCartCheckAll(chekVal))
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(this.messageSource.getMessage(Constants.MessageSource.COMPLETE)).build();

        } catch (Exception e) {
            throw new BizRuntimeException(this.messageSource.getMessage(Constants.MessageSource.ERROR), e);
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage selectCartProduct(String unfyCmdtId) {
        ResponseMessage responseMessage = null;
        
        TmSpbkEntity tmSpbkEntity = TmSpbkEntity.builder()
                                                .mmbrNum("62012413657")
                                                .unfyCmdtId(unfyCmdtId)
                                                .build();
        
        try {
            responseMessage = ResponseMessage.builder().data(this.cartRepository.selectCartProduct(tmSpbkEntity))
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(this.messageSource.getMessage(Constants.MessageSource.COMPLETE)).build();

        } catch (Exception e) {
            throw new BizRuntimeException(this.messageSource.getMessage(Constants.MessageSource.ERROR), e);
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage selectCartProducts() {
        ResponseMessage responseMessage = null;
        
        try {
            responseMessage = ResponseMessage.builder().data(this.cartRepository.selectCartProducts("62012413657"))
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(this.messageSource.getMessage(Constants.MessageSource.COMPLETE)).build();

        } catch (Exception e) {
            throw new BizRuntimeException(this.messageSource.getMessage(Constants.MessageSource.ERROR), e);
        }
        return responseMessage;
    }

}
