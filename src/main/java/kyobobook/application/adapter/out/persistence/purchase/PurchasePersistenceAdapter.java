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
package kyobobook.application.adapter.out.persistence.purchase;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kyobobook.application.adapter.out.persistence.purchase.entity.PurchaseProductEntity;
import kyobobook.application.biz.purchase.port.out.PurchasePersistencePort;
import kyobobook.application.domain.purchase.PurchaseProduct;

/**
 * @Project : fo-order-api
 * @FileName : PurchasePersistenceAdapter.java
 * @Date : 2021. 11. 12.
 * @author : kimsehoon@kyobobook.com
 * @description : 구매 데이터베이스 어댑터
 */
@Repository("purchaseRepository")
public class PurchasePersistenceAdapter implements PurchasePersistencePort {

    /** 구매 읽기 */
    @Autowired
    private PurchaseReaderMapper reader;

    @Override
    public List<PurchaseProduct> getPurchasedInCart(String mmbrNum) throws Exception {

        List<PurchaseProductEntity> queryResult = this.reader.selectPurchaseProducts(mmbrNum);
        List<PurchaseProduct> result = new ArrayList<PurchaseProduct>();
        queryResult.stream().forEach(purchaseProduct -> {
            result.add(PurchaseProduct.builder().ordrDate(purchaseProduct.getOrdrDate())
                    .unfyCmdtId(purchaseProduct.getUnfyCmdtId()).OnlnCmdtDvsnCode(purchaseProduct.getOnlnCmdtDvsnCode())
                    .orderQty(purchaseProduct.getOrderQty()).build());
        });

        return result;

    }

}
