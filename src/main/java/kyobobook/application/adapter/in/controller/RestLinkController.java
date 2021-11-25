/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved. This software is the proprietary
 * information of Kyobo Book.
 *
 * Revision History Author Date Description --------------------------
 * -------------------------------------------------- choi1068@kyobobook.com 2021. 11. 24. First
 * Draft.
 *
 ****************************************************/
package kyobobook.application.adapter.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import kyobobook.application.biz.link.port.in.LinkPort;
import kyobobook.application.domain.common.ResponseMessage;
import lombok.extern.slf4j.Slf4j;


/**
 * @Project : fo-order-api
 * @FileName : RestLinkController.java
 * @Date : 2021. 11. 24.
 * @author : choi1068@kyobobook.com
 * @description :
 */
@Slf4j
@Api(tags = "링크제휴")
@RequestMapping("/ord")
@RestController
public class RestLinkController {

    /** 링크제휴 서비스 */
    @Autowired
    private LinkPort linkInService;

    /**
     * @Method : selectLinkCoprOrdrData
     * @Date : 2021. 11. 24.
     * @author : choi1068@kyobobook.com
     * @description :
     * @param linkDvsnCode
     * @return
     */
    @ApiOperation(value = "링크제휴정보 정책 조회", notes = "링크제휴주문 정책 정보를 조회합니다.")
    @ApiImplicitParam(name = "linkDvsnCode", value = "링크구분코드", required = true, dataType = "string",
            paramType = "query", defaultValue = "CCS")
    @GetMapping(value = "/api/v1/order/link/linkCoprOrdr/{linkDvsnCode}")
    public ResponseMessage selectLinkCoprOrdrData(
            @PathVariable(name = "linkDvsnCode") String linkDvsnCode) {
        return linkInService.selectLinkCoprOrdrData(linkDvsnCode);
    }

    /**
     * @Method : selectLinkCoprOrdrCmdtClstData
     * @Date : 2021. 11. 24.
     * @author : choi1068@kyobobook.com
     * @description :
     * @param coprOrdrPlcId
     * @return
     */
    @ApiOperation(value = "링크제휴주문 상품분류 정보 조회", notes = "링크제휴주문 상품분류리스트 정보를 조회합니다.")
    @ApiImplicitParam(name = "coprOrdrPlcId", value = "제휴주문정책ID", required = true,
            dataType = "string", paramType = "query", defaultValue = "COPR16040016")
    @GetMapping(value = "/api/v1/order/link/linkCoprOrdrCmdtClst/{coprOrdrPlcId}")
    public ResponseMessage selectLinkCoprOrdrCmdtClstData(
            @PathVariable(name = "coprOrdrPlcId") String coprOrdrPlcId) {
        return linkInService.selectLinkCoprOrdrCmdtClstList(coprOrdrPlcId);
    }

    /**
     * @Method : selectLinkCoprOrdrPymtMthd
     * @Date : 2021. 11. 24.
     * @author : choi1068@kyobobook.com
     * @description :
     * @param coprOrdrPlcId
     * @return
     */
    @ApiOperation(value = "링크제휴주문 지불방법 정보 조회", notes = "링크제휴주문 지불방법리스트 정보를 조회합니다.")
    @ApiImplicitParam(name = "coprOrdrPlcId", value = "제휴주문정책ID", required = true,
            dataType = "string", paramType = "query", defaultValue = "COPR16040016")
    @GetMapping(value = "/api/v1/order/link/linkCoprOrdrPymtMthd/{coprOrdrPlcId}")
    public ResponseMessage selectLinkCoprOrdrPymtMthd(
            @PathVariable(name = "coprOrdrPlcId") String coprOrdrPlcId) {
        return linkInService.selectLinkCoprOrdrPymtMthdList(coprOrdrPlcId);
    }
}
