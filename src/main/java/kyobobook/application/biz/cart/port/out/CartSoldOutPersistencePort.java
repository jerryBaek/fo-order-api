/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved. This software is the proprietary
 * information of Kyobo Book.
 *
 * Revision History Author Date Description -------------------------- ----------
 * ---------------------------------------- loutsiderl@kyobobook.com 2021. 11. 23. First Draft.
 *
 ****************************************************/
package kyobobook.application.biz.cart.port.out;

import java.util.List;
import kyobobook.application.adapter.out.persistence.cart.entity.TmSpbkEntity;

/**
 * @Project : fo-order-api
 * @FileName : CartSoldOutPersistencePort.java
 * @Date : 2021. 11. 11.
 * @author : loutsiderl@kyobobook.com
 * @description : 장바구니 내 품/절판 삭제 데이터베이스 포트
 */
public interface CartSoldOutPersistencePort {

    /**
     * @Method : deleteSoldOuts
     * @Date : 2021. 11. 11.
     * @author : loutsiderl@kyobobook.com
     * @description : 장바구니 내 품/절판 상품 삭제
     * @param TmSpbkEntity
     * @return
     * @throws Exception
     */
    Integer deleteSoldOuts(TmSpbkEntity soldOutLIst) throws Exception;

    /**
     * @Method : selectCartSoldOutList
     * @Date : 2021. 11. 23.
     * @author : loutsiderl@kyobobook.com
     * @description : 장바구니 목록 조회
     * @param mmbrNum
     * @return
     * @throws Exception
     */
    List<TmSpbkEntity> selectCartSoldOutList(String mmbrNum) throws Exception;


}
