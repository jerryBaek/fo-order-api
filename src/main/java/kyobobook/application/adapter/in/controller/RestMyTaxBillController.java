/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * jhbaek@kyobobook.com      2022. 01. 05.
 *
 ****************************************************/
package kyobobook.application.adapter.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import kyobobook.application.biz.cart.port.in.CartPort;
import kyobobook.application.domain.business.BusinessInfoMaster;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.taxbill.TaxbillMaster;
import kyobobook.common.Constants;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project : fo-order-api
 * @FileName : MyTaxBillController.java
 * @Date : 2021. 12. 21.
 * @author : jhbaek@kyobobook.com
 * @description : MyTaxBill Controller
 */
@Slf4j
@Api(tags = "세금계산서")
@RequestMapping("/ord")
@RestController
public class RestMyTaxBillController {

    /** 장바구니 서비스 */
    @Autowired
    private CartPort cartService;

    /**
     * #1. 세금계산서 목록 조회 (API-BIZ06-03-040)
     * @Method : selectTaxBillList
     * @Date : 2021. 12. 21.
     * @author : jhbaek@kyobobook.com
     * @description : 세금계산서 목록 조회
     * @return null
     */
    @ApiOperation(value = "세금계산서 목록 조회", notes = "세금계산서 목록을 조호횐다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = TaxbillMaster.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                + "TaxbillMaster" 
                + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @GetMapping("/api/v1/my/tax-bill")
    public ResponseMessage selectTaxBillList(@RequestBody TaxbillMaster taxbillMaster) {
        log.debug("RestMyTaxBillController :: 세금계산서 목록 조회\" + TaxbillMaster");
        //return ResponseMessage.builder().build().setExample(TaxbillMaster.class); 
        return new ResponseMessage().setExample(taxbillMaster.getClass(), 3);
        //return ResponseMessage.builder().build().setExampleByMultiField(TaxbillMaster.class, 2);
    }


    /**
     * @Method : addTaxBill
     * @Date : 2021. 12. 23.
     * @author : jhbaek@kyobobook.com
     * @description : 세금계산서 신청
     * @param
     * @return null
     */
    @ApiOperation(value = "세금 계산서 신청", notes = "세금 계산서를 신청한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = TaxbillMaster.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                + "TaxbillMaster" 
                + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @PostMapping("/api/v1/my/tax-bill")
    public ResponseMessage registTaxBill(@RequestBody TaxbillMaster taxbillMaster) {
        log.debug("RestMyTaxBillController :: 세금계산서 신청\" + TaxbillMaster");
        return ResponseMessage.builder().build().setExample(TaxbillMaster.class); 
    }


    /**
     * @Method : selectLoadBusiessInformation
     * @Date : 2021. 12. 23.
     * @author : jhbaek@kyobobook.com
     * @description : 사업자 정보 불러오기
     * @return null
     */
    @ApiOperation(value = "사업자정보 불러오기", notes = "사업자정보를 불러온다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = BusinessInfoMaster.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                + "BusinessInfoMaster" 
                + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @GetMapping("/api/v1/my/tax-bill/business-license")
   
    public ResponseMessage selectLoadBusiessInformation(@RequestBody BusinessInfoMaster businessInfoMaster) {

        log.debug("================사업자 정보 불러오기");
        log.debug("RestMyTaxBillController :: 사업자정보 불러오기\" + BusinessInfoMaster");
        return ResponseMessage.builder().build().setExample(BusinessInfoMaster.class);         

    }


    /**
     * @Method : addBusinessInformation
     * @Date : 2021. 12. 23.
     * @author : jhbaek@kyobobook.com
     * @description : 사업자정보 등록
     * @param
     * @return null
     */
    @ApiOperation(value = "사업자정보 등록", notes = "사업자정보를 등록한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = BusinessInfoMaster.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                + "BusinessInfoMaster" 
                + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PostMapping("/api/v1/my/tax-bill/business-license")
    public ResponseMessage registBusinessInformation(@RequestBody BusinessInfoMaster businessInfoMaster) {
        log.debug("RestMyTaxBillController :: 사업자정보 등록\" + BusinessInfoMaster");
        return ResponseMessage.builder().build().setExample(BusinessInfoMaster.class);
    }
    

    /**
     * @Method : updateBusinessInformation
     * @Date : 2021. 12. 23.
     * @author : jhbaek@kyobobook.com
     * @description : 사업자정보 수정
     * @param
     * @return null
     */
    @ApiOperation(value = "사업자정보 수정", notes = "사업자정보를 수정한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = BusinessInfoMaster.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                + "BusinessInfoMaster" 
                + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PutMapping("/api/v1/my/tax-bill/business-license")
    public ResponseMessage updateBusinessInformation(@RequestBody BusinessInfoMaster businessInfoMaster) {
        log.debug("RestMyTaxBillController :: 사업자정보 수정\" + BusinessInfoMaster");
        return ResponseMessage.builder().build().setExample(BusinessInfoMaster.class);
    }    

    /**
     * @Method : deleteBusinessInformation
     * @Date : 2022. 01. 04.
     * @author : jhbaek@kyobobook.com
     * @description : 사업자정보 삭제
     * @param
     * @return null
     */
    @ApiOperation(value = "사업자정보 삭제", notes = "사업자정보를 삭제한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = BusinessInfoMaster.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                + "BusinessInfoMaster" 
                + Constants.ApiResponse.MESSAGE_200_POSTFIX),        
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @ApiImplicitParam(name = "mmbrNum", value = "회원번호", required = true, dataType = "string",
    paramType = "path", defaultValue = "11999165878")
    @DeleteMapping("/api/v1/my/tax-bill/business-license")
    public ResponseMessage deleteBusinessInfomation() {
        log.debug("RestMyTaxBillController :: 사업자정보 삭제\" + BusinessInfoMaster");
        return ResponseMessage.builder().build().setExample(BusinessInfoMaster.class);
    }  
    
    
    /**
     * @Method : deleteTaxBill
     * @Date : 2021. 12. 23.
     * @author : jhbaek@kyobobook.com
     * @description : 세금계산서 신청 취소
     * @param
     * @return null
     */
    @ApiOperation(value = "세금계산서 신청 취소", notes = "세금계산서 신청을 취소한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                + "OBJECT_NAME" 
                + Constants.ApiResponse.MESSAGE_200_POSTFIX),        
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @ApiImplicitParam(name = "taxInvoiceAppNumber", value = "세금계산서신청번호", required = true, dataType = "string",
    paramType = "path", defaultValue = "111111")
    @DeleteMapping("/api/v1/my/tax-bill")
    public ResponseMessage deleteTaxBill() {

        log.debug("세금계산서 신청 취소");

        return null;
    }      


}
