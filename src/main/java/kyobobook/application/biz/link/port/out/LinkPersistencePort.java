/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved. This software is the proprietary
 * information of Kyobo Book.
 *
 * Revision History Author Date Description -------------------------- ----------
 * ---------------------------------------- smlee1@kyobobook.com 2021. 8. 12. First Draft.
 *
 ****************************************************/
package kyobobook.application.biz.link.port.out;

import java.util.List;
import kyobobook.application.domain.link.LinkCoprOrdr;
import kyobobook.application.domain.link.LinkCoprOrdrCmdtClst;
import kyobobook.application.domain.link.LinkCoprOrdrPymtMthd;

/**
 * @Project : fo-order-api
 * @FileName : LinkPersistencePort.java
 * @Date : 2021. 11. 24.
 * @author : choi1068@kyobobook.com
 * @description :
 */
public interface LinkPersistencePort {

    /**
     * @Method : selectLinkCoprOrdrData
     * @Date : 2021. 11. 24.
     * @author : choi1068@kyobobook.com
     * @description :
     * @return
     * @throws Exception
     */
    LinkCoprOrdr selectLinkCoprOrdrData(String linkDvsnCode) throws Exception;


    /**
     * @Method : selectLinkCoprOrdrCmdtClst
     * @Date : 2021. 11. 24.
     * @author : choi1068@kyobobook.com
     * @description :
     * @param coprOrdrPlcId
     * @return
     * @throws Exception
     */
    List<LinkCoprOrdrCmdtClst> selectLinkCoprOrdrCmdtClstList(String coprOrdrPlcId,
            String coprOrdrCmdtClstCode, String dscnAcmlDvsnCode) throws Exception;


    /**
     * @Method : selectLinkCoprOrdrPymtMthd
     * @Date : 2021. 11. 24.
     * @author : choi1068@kyobobook.com
     * @description :
     * @param coprOrdrPlcId
     * @return
     * @throws Exception
     */
    List<LinkCoprOrdrPymtMthd> selectLinkCoprOrdrPymtMthdList(String coprOrdrPlcId)
            throws Exception;
}
