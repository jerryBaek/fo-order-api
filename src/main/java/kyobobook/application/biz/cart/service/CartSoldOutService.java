/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved. This software is the proprietary
 * information of Kyobo Book.
 *
 * Revision History Author Date Description -------------------------- ----------
 * ---------------------------------------- loutsiderl@kyobobook.com 2021. 11. 23.
 *
 ****************************************************/
package kyobobook.application.biz.cart.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import kyobobook.application.adapter.out.persistence.cart.entity.TmSpbkEntity;
import kyobobook.application.biz.cart.port.in.CartSoldOutPort;
import kyobobook.application.biz.cart.port.out.CartSoldOutPersistencePort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.exception.BizRuntimeException;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project : fo-order-api
 * @FileName : CartSoldOutService.java
 * @Date : 2021. 11. 23.
 * @author : loutsiderl@kyobobook.com
 * @description : 장바구니 내 품/절판 삭제 서비스
 */
@Slf4j
@Service
public class CartSoldOutService implements CartSoldOutPort {

    /** 장바구니 저장소 */
    @Autowired
    @Qualifier("cartSoldOutRepository")
    private CartSoldOutPersistencePort cartSoldOutRepository;

    /** 메시지 소스 */
    @Autowired
    private MessageSourceAccessor messageSource;

    /**
     * @Method : removeSoldOuts
     * @Date : 2021. 11. 23.
     * @author : loutsiderl@kyobobook.com
     * @description : 장바구니 내 품/절판 상품 삭제
     * @param mmbrNum
     * @return
     * @throws Exception
     */
    @Override
    public ResponseMessage removeSoldOuts(String mmbrNum) {

        ResponseMessage responseMessage = null;

        try {

            // 1. 회원ID를 기준으로 전체 장바구니 목록을 가져온다.
            // TODO: 회원 정보를 세션에서 가져오는 것으로 변경 필요.
            List<TmSpbkEntity> cartList = this.cartSoldOutRepository.selectCartSoldOutList(mmbrNum);
            String mmbrYsno = "Y";
            if(cartList.size() > 0) {
                mmbrYsno = cartList.get(0).getMmbrYsno();
            }

            // 2. 장바구니 내 상품에 대해 품/절판 여부를 체크한다.
            // TODO: 품/절판 여부 체크 방법은 상품쪽에 확인 필요.(rq/rs 정보 포함)
            List<TmSpbkEntity> cartSoldOutList = this.checkSoldOut(cartList);

            TmSpbkEntity cartSoldOut = new TmSpbkEntity();
            ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();

            for (TmSpbkEntity tmSpbkEntity : cartSoldOutList) {
                HashMap<String, Object> map = new HashMap<>();
                map.put("spbkId", tmSpbkEntity.getSpbkId());
                list.add(map);
            }

            // 회원 ID set
            cartSoldOut.setMmbrNum(mmbrNum);
            
            // 회원여부 set
            cartSoldOut.setMmbrYsno(mmbrYsno);

            // 품/절판 된 장바구니ID set
            cartSoldOut.setSpbkIdList(list);

            // 3. 품/절판 된 장바구니 정보를 삭제 처리한다.
            // TODO : 품/절판된 데이터가 없을 경우 처리 방법은?
            if (list.size() > 0) {
                responseMessage = ResponseMessage.builder()
                        .data(this.cartSoldOutRepository.deleteSoldOuts(cartSoldOut))
                        .statusCode(HttpStatus.OK.value())
                        .resultMessage(this.messageSource.getMessage("common.process.complete"))
                        .build();
            } else {
                responseMessage =
                        ResponseMessage.builder().data(null).statusCode(HttpStatus.OK.value())
                                .resultMessage("품/절판 된 상품이 없습니다.").build();
            }


        } catch (Exception e) {

            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);

        }

        return responseMessage;

    }

    /**
     * @Method : checkSoldOut
     * @Date : 2021. 11. 23.
     * @author : loutsiderl@kyobobook.com
     * @description : 상품 grpc를 콜하여 장바구니 내 상품 중 품/절판 상품 체크
     * @param List<TmSpbkEntity>
     * @return List<TmSpbkEntity>
     * @throws Exception
     */
    public List<TmSpbkEntity> checkSoldOut(List<TmSpbkEntity> cartList) {

        List<TmSpbkEntity> cartSoldOutList = new ArrayList<TmSpbkEntity>();

        // row가 2개 이상일 경우 임의로 2번째에 해당하는 정보를 품/절판 데이터로 반환
        if (cartList.size() > 2) {
            cartSoldOutList.add(cartList.get(1));
        }

        return cartSoldOutList;
    }

}
