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
public class LinkCoprOrdrPymtMthdEntity {

    public String coprOrdrPymtMthdSrmb;
    public String coprOrdrPlcId;
    public String aplMthdCode;
    public String pymtMthdCode;
    public String cccpCode;
    public String crtrId;
    public LocalDateTime cretDttm;
    public String amnrId;
    public LocalDateTime amndDttm;
    public String dltYsno;
}
