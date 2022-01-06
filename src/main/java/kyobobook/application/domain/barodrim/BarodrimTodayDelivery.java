/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * kimsehoon@kyobobook.com      2022. 1. 6.
 *
 ****************************************************/
package kyobobook.application.domain.barodrim;

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
 * @Project : fo-order-api
 * @FileName : BarodrimTodayDelivery.java
 * @Date : 2022. 1. 6.
 * @author : kimsehoon@kyobobook.com
 * @description : 바로드림오늘배송
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "바로드림오늘배송")
public class BarodrimTodayDelivery {

    /** 순번 */
    @ApiModelProperty(required = true, value = "순번", example = "")
    private BigInteger seq;
    /** 바로드림지점코드 */
    @ApiModelProperty(required = true, value = "바로드림지점코드", example = "")
    private String brdrBrancode;
    /** 바로드림지점명 */
    @ApiModelProperty(required = true, value = "바로드림지점명", example = "")
    private String brdrBranname;
    /** 시도명 */
    @ApiModelProperty(required = true, value = "시도명", example = "")
    private String sdName;
    /** 행정동시군구명 */
    @ApiModelProperty(required = true, value = "행정동시군구명", example = "")
    private String adstrdSggName;
    /** 법정동시군구명 */
    @ApiModelProperty(required = true, value = "법정동시군구명", example = "")
    private String legaldSggName;
    /** 사용여부 */
    @ApiModelProperty(required = true, value = "사용여부", example = "")
    private String useYsno;
    /** 메모 */
    @ApiModelProperty(required = true, value = "메모", example = "")
    private String memo;
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
    /** 삭제여부 */
    @ApiModelProperty(required = true, value = "삭제여부", example = "")
    private String dltYsno;

}
