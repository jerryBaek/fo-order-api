/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved. This software is the proprietary
 * information of Kyobo Book.
 *
 * Revision History Author Date Description -------------------------- ----------
 * ---------------------------------------- kimsehoon@kyobobook.com 2021. 10. 27.
 *
 ****************************************************/
package kyobobook.application.adapter.out.persistence.link;

import java.util.List;
import java.util.Map;
import kyobobook.application.adapter.out.persistence.link.entity.LinkCoprOrdrCmdtClstEntity;
import kyobobook.application.adapter.out.persistence.link.entity.LinkCoprOrdrEntity;
import kyobobook.application.adapter.out.persistence.link.entity.LinkCoprOrdrPymtMthdEntity;
import kyobobook.config.annotation.ReaderInterface;


/**
 * @Project : fo-order-api
 * @FileName : LinkReaderMapper.java
 * @Date : 2021. 11. 24.
 * @author : choi1068@kyobobook.com
 * @description :
 */
@ReaderInterface
public interface LinkReaderMapper {

    /**
     * @Method : selectLinkCoprOrdrData
     * @Date : 2021. 11. 24.
     * @author : choi1068@kyobobook.com
     * @description :
     * @return
     */
    public LinkCoprOrdrEntity selectLinkCoprOrdr(String linkDvsnCode);

    public List<LinkCoprOrdrCmdtClstEntity> selectLinkCoprOrdrCmdtClstList(
            Map<String, String> paramMap);

    public List<LinkCoprOrdrPymtMthdEntity> selectLinkCoprOrdrPymtMthdList(String coprOrdrPlcId);
}
