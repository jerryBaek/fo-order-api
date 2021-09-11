/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * sykim@kyobobook.com      2021. 8. 27.
 *
 ****************************************************/
package kyobobook.application.biz.product.port.out;

import kyobobook.application.domain.product.Product;
import kyobobook.exception.BizRuntimeException;

/**
 * @Project     : common-prototype-api
 * @FileName    : ProductGrpcPort.java
 * @Date        : 2021. 9. 1.
 * @author      : sykim@kyobobook.com
 * @description : Service에서 GRPC를 통해 sub-api와 통신하기 위한 Port
 */
public interface ProductGrpcPort {

    /**
     * @Method      : getProductDetail
     * @Date        : 2021. 9. 1.
     * @author      : sykim@kyobobook.com
     * @description : 상품 서평/목차 정보를 조회한다.
     * @param cmdt_id
     * @return
     * @throws BizRuntimeException
     */
    Product getProductDetail(String cmdt_id) throws BizRuntimeException;
    
    /**
     * @Method      : insertProductDetail
     * @Date        : 2021. 9. 1.
     * @author      : sykim@kyobobook.com
     * @description : 상품 서평/목차 정보를 등록한다.
     * @param product
     * @throws BizRuntimeException
     */
    void insertProductDetail(Product product) throws BizRuntimeException;

    /**
     * @Method      : updateProductDetail
     * @Date        : 2021. 9. 1.
     * @author      : sykim@kyobobook.com
     * @description : 상품 서평/목차 정보를 수정한다.
     * @param product
     * @throws BizRuntimeException
     */
    void updateProductDetail(Product product) throws BizRuntimeException;

    /**
     * @Method      : deleteProductDetail
     * @Date        : 2021. 9. 1.
     * @author      : sykim@kyobobook.com
     * @description : 상품 서평/목차 정보를 삭제한다.
     * @param cmdt_id
     * @throws BizRuntimeException
     */
    void deleteProductDetail(String cmdt_id) throws BizRuntimeException;
}
