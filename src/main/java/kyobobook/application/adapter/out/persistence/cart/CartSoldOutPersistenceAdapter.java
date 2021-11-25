/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved. This software is the proprietary
 * information of Kyobo Book.
 *
 * Revision History Author Date Description -------------------------- ----------
 * ---------------------------------------- loutsiderl@kyobobook.com 2021. 11. 23.
 *
 ****************************************************/
package kyobobook.application.adapter.out.persistence.cart;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import kyobobook.application.adapter.out.persistence.cart.entity.TmSpbkEntity;
import kyobobook.application.biz.cart.port.out.CartSoldOutPersistencePort;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project : fo-order-api
 * @FileName : CartSoldOutPersistenceAdapter.java
 * @Date : 2021. 11. 23.
 * @author : loutsiderl@kyobobook.com
 * @description : 장바구니 내 품/절판 삭제 어댑터
 */
@Slf4j
@Repository("cartSoldOutRepository")
public class CartSoldOutPersistenceAdapter implements CartSoldOutPersistencePort {

    /** 장바구니 읽기 */
    @Autowired
    private CartSoldOutReaderMapper reader;

    /** 장바구니 쓰기 */
    @Autowired
    private CartSoldOutWriterMapper writer;

    /**
     * @Method : selectCartSoldOutList
     * @Date : 2021. 11. 23.
     * @author : loutsiderl@kyobobook.com
     * @description : 장바구니 내 상품 조회
     * @param mmbrNum
     * @return List<TmSpbkEntity>
     */
    @Override
    public List<TmSpbkEntity> selectCartSoldOutList(String mmbrNum) throws Exception {
        List<TmSpbkEntity> data = this.reader.selectCartSoldOutList(mmbrNum);
        return data;
    }

    /**
     * @Method : deleteSoldOuts
     * @Date : 2021. 11. 23.
     * @author : loutsiderl@kyobobook.com
     * @description : 장바구니 내 품/절판 상품 삭제
     * @param TmSpbkEntity
     * @return
     */
    @Override
    public Integer deleteSoldOuts(TmSpbkEntity soldOut) throws Exception {
        return this.writer.deleteSoldOuts(soldOut);
    }

}
