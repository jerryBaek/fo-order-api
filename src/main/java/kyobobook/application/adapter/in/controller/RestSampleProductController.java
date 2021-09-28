/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * sykim@kyobobook.com      2021. 8. 27.
 *
 ****************************************************/
package kyobobook.application.adapter.in.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kyobobook.application.biz.common.port.in.CustomEventLogPort;
import kyobobook.application.biz.product.port.in.ProductPort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.product.Product;

/**
 * @Project     : common-prototype-api
 * @FileName    : RestSampleProductController.java
 * @Date        : 2021. 8. 31.
 * @author      : sykim@kyobobook.com
 * @description : TEC01-32 Service Mesh 연동 구성 : Rest Api Controller
 */
@Api(tags = "{RestSampleProductController}")
@RestController
@RequestMapping("/product")
public class RestSampleProductController {
    
    private static final Logger logger = LoggerFactory.getLogger(RestSampleProductController.class);
    
    private final ProductPort productPort;
    
    private final CustomEventLogPort customEventLogPort;
    
    public RestSampleProductController(ProductPort productPort
            , CustomEventLogPort customEventLogPort) {
        
        this.productPort = productPort;
        this.customEventLogPort = customEventLogPort;
    }
    
    /**
     * @Method      : selectProducts
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 목록을 조회한다.
     * @param cache   - Cache Option
     * @return
     */
    @ApiOperation(value="상품 목록 조회"
            , notes="<b style='color: red;'>상품 목록</b>을 조회 합니다.")
    @GetMapping(value = {"/products", "/{cache}/products"})
    public ResponseMessage selectProducts(
            @PathVariable Optional<String> cache) {

        customEventLogPort.insertEventLog("[상품 목록 조회] :: use cache :: [" + cache.isPresent() + "]");
        
        return productPort.selectProducts(cache.isPresent());
    }

    /**
     * @Method      : getProduct
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 상세 정보를 조회한다.
     * @param cache   - Cache Option
     * @param cmdt_id - 상품 ID
     * @return
     */
    @ApiOperation("상품 상세 조회")
    @GetMapping(value = {"/products/{cmdt_id}", "/{cache}/products/{cmdt_id}"})
    public ResponseMessage getProduct(
            @PathVariable Optional<String> cache,
            @PathVariable String cmdt_id) {
        
        customEventLogPort.insertEventLog("[상품 상세 조회] :: use cache :: [" + cache.isPresent() + "] :: cmdt_id :: " + cmdt_id );
        return productPort.getProduct(cache.isPresent(), cmdt_id);
    }

    /**
     * @Method      : insertProduct
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 정보를 등록한다.
     * @param cache   - Cache Option
     * @param dbtype  - DB Type (READER/WRITER) : 오류 상황 발생용
     * @param product - 상품 정보
     * @return
     * @throws Exception
     */
    @ApiOperation("상품 등록")
    @PostMapping(value = {"/products", "/{cache}/products", "/products/{dbtype}"})
    public ResponseMessage insertProduct(
            @PathVariable Optional<String> cache,
            @PathVariable Optional<String> dbtype,
            @RequestBody Product product) throws Exception {
        
        customEventLogPort.insertEventLog("[상품 등록] :: use cache :: [" + cache.isPresent() + "] :: product :: [" + product.toString() + "]");
        logger.debug("### insertProduct :: product :: {}", product.toString());

        return productPort.insertProduct(cache.isPresent(), dbtype.isPresent(), product);
    }

    /**
     * @Method      : updateProduct
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 정보를 변경한다.
     * @param cache   - Cache Option
     * @param product - 상품 정보
     * @return
     */
    @ApiOperation("상품 수정")
    @PutMapping(value = {"/products", "/{cache}/products"})
    public ResponseMessage updateProduct(
            @PathVariable Optional<String> cache,
            @RequestBody Product product) {
        
        customEventLogPort.insertEventLog("[상품 수정] :: use cache :: [" + cache.isPresent() + "] :: product :: [" + product.toString() + "]");
        
        logger.debug("### updateProduct :: product :: {}", product.toString());

        return productPort.updateProduct(cache.isPresent(), product);
    }

    /**
     * @Method      : deleteProduct
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 상품 정보를 삭제한다. 
     * @param cache   - Cache Option
     * @param cmdt_id - 상품 ID
     * @return
     */
    @ApiOperation("상품 삭제")
    @DeleteMapping(value = {"/products/{cmdt_id}", "/{cache}/products/{cmdt_id}"})
    public ResponseMessage deleteProduct(
            @PathVariable Optional<String> cache,
            @PathVariable String cmdt_id) {
        
        customEventLogPort.insertEventLog("[상품 삭제] :: use cache :: [" + cache.isPresent() + "] :: cmdt_id :: [" + cmdt_id + "]");
        
        logger.debug("### deleteProduct :: cmdt_id :: {}", cmdt_id);
        
        return productPort.deleteProduct(cache.isPresent(), cmdt_id);
    }
    
    /**
     * @Method      : selectAuthors
     * @Date        : 2021. 8. 31.
     * @author      : sykim@kyobobook.com
     * @description : 저자 목록을 조회한다.
     * @return
     */
    @ApiOperation("저자 조회")
    @GetMapping(value = "/authors")
    public ResponseMessage selectAuthors() {
        
        return productPort.selectAuthors();
    }
}
