/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * sykim@kyobobook.com      2021. 9. 1.
 *
 ****************************************************/
package kyobobook.application.adapter.out.grpc;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import io.grpc.netty.shaded.io.netty.util.internal.StringUtil;
import kyobobook.application.biz.product.port.out.ProductGrpcPort;
import kyobobook.application.domain.product.Product;
import kyobobook.exception.BizRuntimeException;
import kyobobook.grpc.product.ProductFieldEntry;
import kyobobook.grpc.product.ProductGrpc;
import kyobobook.grpc.product.ProductRequest;
import kyobobook.grpc.product.ProductResponse;
import kyobobook.grpc.sample.ResponseResult;
import net.devh.boot.grpc.client.inject.GrpcClient;

/**
 * @Project     : common-prototype-api
 * @FileName    : GrpcProductAdapter.java
 * @Date        : 2021. 9. 1.
 * @author      : sykim@kyobobook.com
 * @description :
 */
@Service("grpcProductAdapter")
public class GrpcProductAdapter implements ProductGrpcPort {
    
    @GrpcClient("common-prototype-sub-api")
    private ProductGrpc.ProductBlockingStub productStub;

    @Override
    public Product getProductDetail(String cmdt_id) throws BizRuntimeException {
        
        ProductResponse response = 
                this.productStub.getProductDetail(ProductRequest.newBuilder().setCmdtId(cmdt_id).build());
        ProductFieldEntry fieldEntry = response.getResult();
        
        ResponseResult responseResult = response.getResponseResult(); 
        if(responseResult.getResultCode() != HttpStatus.OK.value()) {
            throw new BizRuntimeException(responseResult.getResultCode(), responseResult.getResultMessage());
        }
        
        Product product = Product.builder()
                .cmdt_id(fieldEntry.getCmdtId())
                .bkrv_cntt(fieldEntry.getBkrvCntt())
                .ctnt_cntt(fieldEntry.getCtntCntt())
                .build();
        
        return product;
    }

    @Override
    public void insertProductDetail(Product product) throws BizRuntimeException {
        
        if (!StringUtil.isNullOrEmpty(product.getBkrv_cntt())) {
            
            ResponseResult responseResultBkrv = this.productStub.insertProductBkrv(ProductRequest.newBuilder()
                    .setCmdtId(product.getCmdt_id())
                    .setBkrvCntt(product.getBkrv_cntt())
                    .setCtntCntt("")
                    .build());
            
            if(responseResultBkrv.getResultCode() != HttpStatus.OK.value()) {
                throw new BizRuntimeException(responseResultBkrv.getResultCode(), responseResultBkrv.getResultMessage());
            }
        }
        
        if (!StringUtil.isNullOrEmpty(product.getCtnt_cntt())) {
            
            ResponseResult responseResultCtnt = this.productStub.insertProductCtnt(ProductRequest.newBuilder()
                    .setCmdtId(product.getCmdt_id())
                    .setCtntCntt(product.getCtnt_cntt())
                    .build());
            
            if(responseResultCtnt.getResultCode() != HttpStatus.OK.value()) {
                throw new BizRuntimeException(responseResultCtnt.getResultCode(), responseResultCtnt.getResultMessage());
            }
        }
        
    }

    @Override
    public void updateProductDetail(Product product) throws BizRuntimeException {
        
        ResponseResult responseResult = this.productStub.updateProductDetail(ProductRequest.newBuilder()
                .setCmdtId(product.getCmdt_id())
                .setBkrvCntt(StringUtil.isNullOrEmpty(product.getBkrv_cntt())? StringUtil.EMPTY_STRING : product.getBkrv_cntt())
                .setCtntCntt(StringUtil.isNullOrEmpty(product.getCtnt_cntt())? StringUtil.EMPTY_STRING : product.getCtnt_cntt())
                .build());
        
        if(responseResult.getResultCode() != HttpStatus.OK.value()) {
            throw new BizRuntimeException(responseResult.getResultCode(), responseResult.getResultMessage());
        }
    }

    @Override
    public void deleteProductDetail(String cmdt_id) throws BizRuntimeException {
        
        ResponseResult responseResult = this.productStub.deleteProductDetail(ProductRequest.newBuilder().setCmdtId(cmdt_id).build());
        
        if(responseResult.getResultCode() != HttpStatus.OK.value()) {
            throw new BizRuntimeException(responseResult.getResultCode(), responseResult.getResultMessage());
        }
    }

}
