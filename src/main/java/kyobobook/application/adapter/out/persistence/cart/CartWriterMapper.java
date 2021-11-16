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
package kyobobook.application.adapter.out.persistence.cart;

import java.util.HashMap;
import kyobobook.config.annotation.WriterInterface;

/**
 * @Project     : fo-order-api
 * @FileName    : CartReaderMapper.java
 * @Date        : 2021. 11. 11.
 * @author      : kimsehoon@kyobobook.com
 * @description : 장바구니 읽기
 */
@WriterInterface
public interface CartWriterMapper {

    /**
     * @Method      : updateCartCheck
     * @Date        : 2021. 11. 11.
     * @author      : seohee.ko@kyobobook.com
     * @description : 
     * @param unfyCmdtId
     */
    Integer updateCartCheck(String unfyCmdtId);

    /**
     * @Method      : deleteCartCheck
     * @Date        : 2021. 11. 11.
     * @author      : seohee.ko@kyobobook.com
     * @description : 
     * @param check
     */
    Integer deleteCartCheck(HashMap<String, Object> map);
    
}
