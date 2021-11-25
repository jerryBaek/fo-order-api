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
 * @FileName : LinkCoprOrdrPymtMthd.java
 * @Date : 2021. 11. 24.
 * @author : choi1068@kyobobook.com
 * @description :
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class LinkCoprOrdrPymtMthd {

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
