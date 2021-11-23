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
package kyobobook.application.adapter.out.persistence.purchase;

import java.util.List;

import kyobobook.application.adapter.out.persistence.purchase.entity.PurchaseProductEntity;
import kyobobook.config.annotation.ReaderInterface;

/**
 * @Project : fo-order-api
 * @FileName : PurchaseReaderMapper.java
 * @Date : 2021. 11. 12.
 * @author : kimsehoon@kyobobook.com
 * @description : 구매 읽기 매퍼
 */
@ReaderInterface
public interface PurchaseReaderMapper {

    /**
     * @Method : selectPurchaseProducts
     * @Date : 2021. 11. 12.
     * @author : kimsehoon@kyobobook.com
     * @description : 구매 상품 목록 조회
     * @param mmbrNum 회원번호
     * @return 구매상품목록
     */
    public List<PurchaseProductEntity> selectPurchaseProducts(String mmbrNum);

}
