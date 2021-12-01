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
package kyobobook.application.adapter.out.persistence.test.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Project : fo-order-api
 * @FileName : CartEntity.java
 * @Date : 2021. 10. 27.
 * @author : kimsehoon@kyobobook.com
 * @description :
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestEntity {

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
    private String unfyCmdtId;

}
