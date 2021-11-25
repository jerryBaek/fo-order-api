/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved. This software is the proprietary
 * information of Kyobo Book.
 *
 * Revision History Author Date Description -------------------------- ----------
 * ---------------------------------------- choi1068@kyobobook.com 2021. 11. 24.
 *
 ****************************************************/
package kyobobook.application.adapter.out.persistence.link.entity;

import java.time.LocalDateTime;
import lombok.Data;

/**
 * @Project : fo-order-api
 * @FileName : LinkCoprOrdrEntity.java
 * @Date : 2021. 11. 24.
 * @author : choi1068@kyobobook.com
 * @description :
 */
@Data
public class LinkCoprOrdrCmdtClstEntity {

    public String coprOrdrCmdtClstSrmb;
    public String coprOrdrPlcId;
    public String onlnCmdtDvsnCode;
    public String joCode;
    public String crtrId;
    public LocalDateTime cretDttm;
    public String amnrId;
    public LocalDateTime amndDttm;
    public String dltYsno;
    public String unfyCmdtId;
    public String coprOrdrCmdtClstCode;
    public String dscnAcmlDvsnCode;
    public String aplRate;
    public String acmlMthdCode;
}
