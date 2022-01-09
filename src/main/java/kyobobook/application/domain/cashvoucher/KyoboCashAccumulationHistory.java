/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * seohee.ko@kyobobook.com      2022. 1. 6.
 *
 ****************************************************/
package kyobobook.application.domain.cashvoucher;

import java.math.BigInteger;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project     : fo-order-api
 * @FileName    : KyoboCashAccumulationHistory.java
 * @Date        : 2022. 1. 6.
 * @author      : seohee.ko@kyobobook.com
 * @description :
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "교보캐시적립이력")
public class KyoboCashAccumulationHistory {

    private String kbcshAcmlNum;
    private String kbcshHstrSrmb;
    private String destWtdwDvsnCode;
    private String assetMdfcDsrpDvsnCode;
    private String kbcshBnblCnvsRsnCode;
    private String kbcshBnblCnvsRsn;
    private String kbcshUseAcmlDate;
    private String kbcshUseAcmlAmnt;
    private String unfyOrdrChnlCode;
    private String ordrStlmNum;
    private String ordrStlmPatrCode;
    private String unfyOrdrId;
    private String strOrdrSrmb;
    /** 생성자ID */
    @ApiModelProperty(required = true, value = "생성자ID", example = "")
    private String crtrId;
    /** 생성일시 */
    @ApiModelProperty(required = true, value = "생성일시", example = "")
    private LocalDateTime cretDttm;
    /** 수정자ID */
    @ApiModelProperty(required = true, value = "수정자ID", example = "")
    private String amnrId;
    /** 수정일시 */
    @ApiModelProperty(required = true, value = "수정일시", example = "")
    private LocalDateTime amndDttm;
}
