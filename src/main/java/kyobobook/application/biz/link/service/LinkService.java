/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved. This software is the proprietary
 * information of Kyobo Book.
 *
 * Revision History Author Date Description -------------------------- ----------
 * ---------------------------------------- kimsehoon@kyobobook.com 2021. 10. 27.
 *
 ****************************************************/
package kyobobook.application.biz.link.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import kyobobook.application.biz.link.port.in.LinkPort;
import kyobobook.application.biz.link.port.out.LinkPersistencePort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.link.LinkCoprOrdr;
import kyobobook.application.domain.link.LinkCoprOrdrCmdtClst;
import kyobobook.application.domain.link.LinkCoprOrdrPymtMthd;
import kyobobook.exception.BizRuntimeException;


/**
 * @Project : fo-order-api
 * @FileName : LinkService.java
 * @Date : 2021. 11. 24.
 * @author : choi1068@kyobobook.com
 * @description :
 */
@Service
public class LinkService implements LinkPort {

    private static final Logger logger = LoggerFactory.getLogger(LinkService.class);

    @Autowired
    @Qualifier("linkReaderRepository")
    private LinkPersistencePort linkReaderPort;

    @Override
    public ResponseMessage selectLinkCoprOrdrData(String linkDvsnCode) throws BizRuntimeException {

        ResponseMessage responseMessage = null;

        try {
            LinkCoprOrdr returnData = this.linkReaderPort.selectLinkCoprOrdrData(linkDvsnCode);

            // List<LinkCoprOrdrCmdtClst> queryList01 =
            // this.linkReaderPort.selectLinkCoprOrdrCmdtClstList(coprOrdrPlcId);
            // List<LinkCoprOrdrPymtMthd> queryList02 =
            // this.linkReaderPort.selectLinkCoprOrdrPymtMthdList(coprOrdrPlcId);

            responseMessage = ResponseMessage.builder().data(returnData) // 조회
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage("selectLinkCoprOrdrData sucess").build();

        } catch (Exception e) {
            // throw new BizRuntimeException("오류끄..");
            throw new BizRuntimeException("BizRuntime Error");
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage selectLinkCoprOrdrCmdtClstList(String coprOrdrPlcId)
            throws BizRuntimeException {

        ResponseMessage responseMessage = null;

        try {

            // 주문가능 상품(100)-추가할인(200)
            List<LinkCoprOrdrCmdtClst> queryList01 =
                    this.linkReaderPort.selectLinkCoprOrdrCmdtClstList(coprOrdrPlcId, "100", "200");

            // 주문가능 상품(100)-추가적립(100)
            List<LinkCoprOrdrCmdtClst> queryList02 =
                    this.linkReaderPort.selectLinkCoprOrdrCmdtClstList(coprOrdrPlcId, "100", "100");

            // 주문제외 상품(200)
            List<LinkCoprOrdrCmdtClst> queryList03 =
                    this.linkReaderPort.selectLinkCoprOrdrCmdtClstList(coprOrdrPlcId, "200", "");

            Map<String, Object> returnMap = new HashMap<String, Object>();

            returnMap.put("allowCoprOrdrDcntList", queryList01);
            returnMap.put("allowCoprOrdrAddList", queryList02);
            returnMap.put("denideCoprOrdrList", queryList03);

            responseMessage = ResponseMessage.builder().data(returnMap) // 조회
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage("selectLinkCoprOrdrCmdtClstList sucess").build();

        } catch (Exception e) {
            // throw new BizRuntimeException("오류끄..");
            throw new BizRuntimeException("BizRuntime Error");
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage selectLinkCoprOrdrPymtMthdList(String coprOrdrPlcId)
            throws BizRuntimeException {

        ResponseMessage responseMessage = null;

        try {
            List<LinkCoprOrdrPymtMthd> queryList =
                    this.linkReaderPort.selectLinkCoprOrdrPymtMthdList(coprOrdrPlcId);

            responseMessage = ResponseMessage.builder().data(queryList) // 조회
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage("selectLinkCoprOrdrPymtMthdList sucess").build();

        } catch (Exception e) {
            // throw new BizRuntimeException("오류끄..");
            throw new BizRuntimeException("BizRuntime Error");
        }
        return responseMessage;
    }
}
