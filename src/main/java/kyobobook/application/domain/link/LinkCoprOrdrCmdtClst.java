/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved. This software is the proprietary
 * information of Kyobo Book.
 *
 * Revision History Author Date Description -------------------------- ----------
 * ---------------------------------------- seohee.ko@kyobobook.com 2021. 11. 9.
 *
 ****************************************************/
package kyobobook.application.domain.link;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project : fo-order-api
 * @FileName : LinkCoprOrdrCmdtClst.java
 * @Date : 2021. 11. 24.
 * @author : choi1068@kyobobook.com
 * @description :
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class LinkCoprOrdrCmdtClst {

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
