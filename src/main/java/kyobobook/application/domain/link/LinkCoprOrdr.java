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
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project : fo-order-api
 * @FileName : LinkCoprOrdr.java
 * @Date : 2021. 11. 24.
 * @author : choi1068@kyobobook.com
 * @description :
 */
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class LinkCoprOrdr {

    public String coprOrdrPlcId;
    public String linkDvsnCode;
    public String chnlDvsnCode;
    public String chnlDtlDvsnCode;
    public LocalDateTime aplSttgDttm;
    public LocalDateTime aplEndDttm;
    public String freeDlvrYsno;
    public String crtrId;
    public LocalDateTime cretDttm;
    public String amnrId;
    public LocalDateTime amndDttm;
    public String dltYsno;

    List<LinkCoprOrdrCmdtClst> linkCoprOrdrCmdtClstList;

    List<LinkCoprOrdrPymtMthd> linkCoprOrdrPymtMthdList;
}
