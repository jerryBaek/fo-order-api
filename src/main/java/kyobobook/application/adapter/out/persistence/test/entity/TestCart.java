/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * seohee.ko@kyobobook.com      2021. 11. 9.
 *
 ****************************************************/
package kyobobook.application.adapter.out.persistence.test.entity;

import java.time.LocalDateTime;
import kyobobook.application.domain.common.ResponseMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project     : fo-order-api
 * @FileName    : TestCart.java
 * @Date        : 2021. 11. 9.
 * @author      : seohee.ko@kyobobook.com
 * @description :
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TestCart extends ResponseMessage {
    
    private String spbkId;
    private String spbkDvsnCode;
    private String spbkKindCode;
    private String unfyCmdtId;
    private String untItmSrmb;
    private String memno;
    private String tmprMmbrNum;
    private String requQntt;
    private LocalDateTime endDttm;
    private String mmbrYs;
    private String frbeYs;
    private String orglUnfyCmdtId;
    private String cyclCode;
    private String dlvrDwCode;
    private String ttlDlvrNmtm;
    private String cnrcNmtm;
    private String brdrBranCode;
    private String linkDvsnCode;
    private String joCode;
    private String sctnCode;
    private String chekYs;
    private String addtOrdrCntt;
    private String prinCntt;
    private String crtrId;
    private LocalDateTime cretDttm;
    private String amnrId;
    private LocalDateTime amndDttm;
}
