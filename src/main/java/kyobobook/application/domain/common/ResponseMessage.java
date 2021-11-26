/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com      2021. 9. 6.
 *
 ****************************************************/
package kyobobook.application.domain.common;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project     : fo-order-api
 * @FileName    : ResponseResult.java
 * @Date        : 2021. 9. 6.
 * @author      : smlee1@kyobobook.com
 * @description : 요청에 대한 응답 전문용
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor

public class ResponseMessage {
    Object data;            // 처리 결과 물
    int statusCode;         // 처리 상태 코드
    String resultMessage;   // 처리 결과 메세지
    String detailMessage;   // 처리 결과 상세 메세지
    
    /**
     * @Method      : getConvertFromMapToData
     * @Date        : 2021. 9. 8.
     * @author      : smlee1@kyobobook.com
     * @description : 
     * @param <T>
     * @param clazz
     * @return
     */
    public <T> T getConvertFromMapToData(Class<T> clazz) {
        ObjectMapper mapper = new ObjectMapper();
        return clazz.cast(mapper.convertValue(this.data, clazz));
    }
}
