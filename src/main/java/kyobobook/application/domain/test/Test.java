/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com           2021. 8. 12.  First Draft.
 *
 ****************************************************/
package kyobobook.application.domain.test;

import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import kyobobook.application.domain.common.ResponseMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project : fo-order-api
 * @FileName : Sample.java
 * @Date : 2021. 8. 12.
 * @author : smlee1@kyobobook.com
 * @description : Sample
 */
@ApiModel(value = "샘플 Domain 클래스", description = "샘플 테스트용으로 작성된 클래스 입니다.")
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Test extends ResponseMessage {

    private String ordrId;
    private String ordrDate;
    private String ordrHms;
    private String mmbrLgnId;
    private String aordName;
    private String aordPrtbTlnm;
    private String aordIpAdrs;
    private String adrs;
    private String crtrId;
    private LocalDateTime cretDttm;
    private String amnrId;
    private LocalDateTime amndDttm;
}
