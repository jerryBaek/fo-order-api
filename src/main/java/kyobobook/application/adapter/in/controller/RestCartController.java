/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com           2021. 8. 17.  First Draft.
 *
 ****************************************************/
package kyobobook.application.adapter.in.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kyobobook.application.biz.cart.port.in.CartPort;
import kyobobook.application.domain.common.ResponseMessage;

/**
 * @Project     : fo-order-api
 * @FileName    : RestCartController.java
 * @Date        : 2021. 11. 11.
 * @author      : kimsehoon@kyobobook.com
 * @description : 카트 컨트롤러
 */
@Api(tags = "RestCartController")
@RestController
public class RestCartController {
    
    private static final Logger logger = LoggerFactory.getLogger(RestCartController.class);
    
    /** 카트 서비스 */
    @Autowired
    private CartPort cartService;

}