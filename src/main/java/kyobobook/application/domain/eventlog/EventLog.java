/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * sykim@kyobobook.com      2021. 9. 2.
 *
 ****************************************************/
package kyobobook.application.domain.eventlog;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Project     : common-prototype-api
 * @FileName    : EventLog.java
 * @Date        : 2021. 9. 2.
 * @author      : sykim@kyobobook.com
 * @description : TEC01-32 Service Mesh 연동 구성 Prototype : EventLog
 */
@ApiModel(value = "TEC01-32 Event Log domain 클래스", description = "Service Mesh 연동 구성 Prototype용 class")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "eventLog")
public class EventLog {
    
    @Id
    private String id;
    
    private String applicationName;
    private String clientIP;
    private String datetime;
    private String user;
    private String msg;
}
