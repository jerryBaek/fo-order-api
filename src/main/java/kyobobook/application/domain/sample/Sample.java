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
package kyobobook.application.domain.sample;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kyobobook.application.domain.common.ResponseMessage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project     : common-prototype-api
 * @FileName    : Sample.java
 * @Date        : 2021. 8. 12.
 * @author      : smlee1@kyobobook.com
 * @description : Sample
 */
@ApiModel(value = "샘플 Domain 클래스", description = "샘플 테스트용으로 작성된 클래스 입니다.")
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Sample extends ResponseMessage{
    
    @ApiModelProperty(value="데이터 시퀀스", required=false, example="")
    private int seq;
    
    @ApiModelProperty(value="제목", required=false, example="제목 입력")
    private String title;
    
    @ApiModelProperty(value="내용", required=false, example="내용 입력")
    private String contents;
    
    @ApiModelProperty(value="txt", required=false, example="임시 구분 field")
    private String txt;
    
    @ApiModelProperty(value="데이터 요청 타입", required=false, example="데이터 요청을 위한 타입구분, 샘플용.")
    private int reqType;
}
