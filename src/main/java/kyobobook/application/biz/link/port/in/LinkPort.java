/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved. This software is the proprietary
 * information of Kyobo Book.
 *
 * Revision History Author Date Description -------------------------- ----------
 * ---------------------------------------- smlee1@kyobobook.com 2021. 8. 12. First Draft.
 *
 ****************************************************/
package kyobobook.application.biz.link.port.in;

import kyobobook.application.domain.common.ResponseMessage;

/**
 * @Project : fo-order-api
 * @FileName : LinkPort.java
 * @Date : 2021. 11. 24.
 * @author : choi1068@kyobobook.com
 * @description :
 */
public interface LinkPort {

    /**
     * @Method : selectLinkCoprOrdrData
     * @Date : 2021. 11. 24.
     * @author : choi1068@kyobobook.com
     * @description :
     * @param linkDvsnCode
     * @return
     */
    public ResponseMessage selectLinkCoprOrdrData(String linkDvsnCode);

    /**
     * @Method : selectLinkCoprOrdrCmdtClstList
     * @Date : 2021. 11. 24.
     * @author : choi1068@kyobobook.com
     * @description :
     * @param coprOrdrPlcId
     * @return
     */
    public ResponseMessage selectLinkCoprOrdrCmdtClstList(String coprOrdrPlcId);

    /**
     * @Method : selectLinkCoprOrdrPymtMthdList
     * @Date : 2021. 11. 24.
     * @author : choi1068@kyobobook.com
     * @description :
     * @param coprOrdrPlcId
     * @return
     */
    public ResponseMessage selectLinkCoprOrdrPymtMthdList(String coprOrdrPlcId);
}
