/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved. This software is the proprietary
 * information of Kyobo Book.
 *
 * Revision History Author Date Description -------------------------- ----------
 * ---------------------------------------- kimsehoon@kyobobook.com 2021. 10. 27.
 *
 ****************************************************/
package kyobobook.application.adapter.out.persistence.link;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import kyobobook.application.adapter.out.persistence.link.entity.LinkCoprOrdrCmdtClstEntity;
import kyobobook.application.adapter.out.persistence.link.entity.LinkCoprOrdrEntity;
import kyobobook.application.adapter.out.persistence.link.entity.LinkCoprOrdrPymtMthdEntity;
import kyobobook.application.biz.link.port.out.LinkPersistencePort;
import kyobobook.application.domain.link.LinkCoprOrdr;
import kyobobook.application.domain.link.LinkCoprOrdrCmdtClst;
import kyobobook.application.domain.link.LinkCoprOrdrPymtMthd;
import lombok.extern.slf4j.Slf4j;


/**
 * @Project : fo-order-api
 * @FileName : LinkPersistenceAdapter.java
 * @Date : 2021. 11. 24.
 * @author : choi1068@kyobobook.com
 * @description :
 */
@Slf4j
@Repository("linkReaderRepository")
public class LinkPersistenceAdapter implements LinkPersistencePort {

    /** 테스트 읽기 */
    @Autowired
    LinkReaderMapper linkReaderMapper;

    @Override
    public LinkCoprOrdr selectLinkCoprOrdrData(String linkDvsnCode) {

        LinkCoprOrdrEntity queryData = this.linkReaderMapper.selectLinkCoprOrdr(linkDvsnCode);

        LinkCoprOrdr result = new LinkCoprOrdr();

        if (queryData != null) {
            result = LinkCoprOrdr.builder().coprOrdrPlcId(queryData.getCoprOrdrPlcId())
                    .linkDvsnCode(queryData.getLinkDvsnCode())
                    .chnlDvsnCode(queryData.getChnlDvsnCode())
                    .chnlDtlDvsnCode(queryData.getChnlDtlDvsnCode())
                    .aplSttgDttm(queryData.getAplSttgDttm()).aplEndDttm(queryData.getAplEndDttm())
                    .freeDlvrYsno(queryData.getFreeDlvrYsno()).crtrId(queryData.getCrtrId())
                    .cretDttm(queryData.getCretDttm()).amnrId(queryData.getAmnrId())
                    .amndDttm(queryData.getAmndDttm()).dltYsno(queryData.getDltYsno()).build();
        }

        return result;
    }

    @Override
    public List<LinkCoprOrdrCmdtClst> selectLinkCoprOrdrCmdtClstList(String coprOrdrPlcId,
            String coprOrdrCmdtClstCode, String dscnAcmlDvsnCode) {

        Map<String, String> paramMap = new HashMap<String, String>();

        paramMap.put("coprOrdrPlcId", coprOrdrPlcId);
        paramMap.put("coprOrdrCmdtClstCode", coprOrdrCmdtClstCode);
        paramMap.put("dscnAcmlDvsnCode", dscnAcmlDvsnCode);

        List<LinkCoprOrdrCmdtClstEntity> queryList =
                this.linkReaderMapper.selectLinkCoprOrdrCmdtClstList(paramMap);

        List<LinkCoprOrdrCmdtClst> result = new ArrayList<LinkCoprOrdrCmdtClst>();
        queryList.stream().forEach(linkCoprOrdrCmdtClst -> {
            result.add(LinkCoprOrdrCmdtClst.builder()
                    .coprOrdrCmdtClstSrmb(linkCoprOrdrCmdtClst.getCoprOrdrCmdtClstSrmb())
                    .coprOrdrPlcId(linkCoprOrdrCmdtClst.getCoprOrdrPlcId())
                    .onlnCmdtDvsnCode(linkCoprOrdrCmdtClst.getOnlnCmdtDvsnCode())
                    .joCode(linkCoprOrdrCmdtClst.getJoCode())
                    .crtrId(linkCoprOrdrCmdtClst.getCrtrId())
                    .cretDttm(linkCoprOrdrCmdtClst.getCretDttm())
                    .amnrId(linkCoprOrdrCmdtClst.getAmnrId())
                    .amndDttm(linkCoprOrdrCmdtClst.getAmndDttm())
                    .dltYsno(linkCoprOrdrCmdtClst.getDltYsno())
                    .unfyCmdtId(linkCoprOrdrCmdtClst.getUnfyCmdtId())
                    .coprOrdrCmdtClstCode(linkCoprOrdrCmdtClst.getCoprOrdrCmdtClstCode())
                    .dscnAcmlDvsnCode(linkCoprOrdrCmdtClst.getDscnAcmlDvsnCode())
                    .aplRate(linkCoprOrdrCmdtClst.getAplRate())
                    .acmlMthdCode(linkCoprOrdrCmdtClst.getAcmlMthdCode()).build());
        });

        return result;
    }

    @Override
    public List<LinkCoprOrdrPymtMthd> selectLinkCoprOrdrPymtMthdList(String coprOrdrPlcId) {

        List<LinkCoprOrdrPymtMthdEntity> queryList =
                this.linkReaderMapper.selectLinkCoprOrdrPymtMthdList(coprOrdrPlcId);

        List<LinkCoprOrdrPymtMthd> result = new ArrayList<LinkCoprOrdrPymtMthd>();
        queryList.stream().forEach(linkCoprOrdrPymtMthd -> {
            result.add(LinkCoprOrdrPymtMthd.builder()
                    .coprOrdrPymtMthdSrmb(linkCoprOrdrPymtMthd.getCoprOrdrPymtMthdSrmb())
                    .coprOrdrPlcId(linkCoprOrdrPymtMthd.getCoprOrdrPlcId())
                    .aplMthdCode(linkCoprOrdrPymtMthd.getAplMthdCode())
                    .pymtMthdCode(linkCoprOrdrPymtMthd.getPymtMthdCode())
                    .cccpCode(linkCoprOrdrPymtMthd.getCccpCode())
                    .crtrId(linkCoprOrdrPymtMthd.getCrtrId())
                    .cretDttm(linkCoprOrdrPymtMthd.getCretDttm())
                    .amnrId(linkCoprOrdrPymtMthd.getAmnrId())
                    .amndDttm(linkCoprOrdrPymtMthd.getAmndDttm())
                    .dltYsno(linkCoprOrdrPymtMthd.getDltYsno()).build());
        });

        return result;
    }
}
