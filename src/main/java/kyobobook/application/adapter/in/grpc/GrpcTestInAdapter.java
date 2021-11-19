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
package kyobobook.application.adapter.in.grpc;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.MessageSourceAccessor;
import kyobobook.application.adapter.out.persistence.test.entity.TestEntity;
import kyobobook.application.biz.test.port.in.TestPort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.config.interceptor.ExceptionGrpcInterceptor;
import kyobobook.grpc.test.TestGrpc.TestImplBase;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * @Project     : common-order-api
 * @FileName    : GrpcTestAdapter.java
 * @Date        : 2021. 11. 4.
 * @author      : kimsehoon@kyobobook.com
 * @description : 데이터 수신 어댑터
 */
@Slf4j
@GrpcService(interceptors = ExceptionGrpcInterceptor.class)
public class GrpcTestInAdapter extends TestImplBase {

    @Autowired
    private TestPort testService;

    @Autowired
    private MessageSourceAccessor messageSource;

    @Override
    public void selectData(com.google.protobuf.Empty request,
            io.grpc.stub.StreamObserver<kyobobook.grpc.test.TestResponse> responseObserver) {

        log.debug("gRPC 다건선택으로 들어옴..");

        ResponseMessage responseMessage = this.testService.selectMultipleData();

        @SuppressWarnings("unchecked")
        List<TestEntity> dataList = (List<TestEntity>) responseMessage.getData();
        dataList.stream().forEach(data -> {
            responseObserver.onNext(kyobobook.grpc.test.TestResponse.newBuilder().setOrdrId(data.getOrdrId()).build());
        });

        responseObserver.onCompleted();

    }

    @Override
    public void getData(kyobobook.grpc.test.TestRequest request,
            io.grpc.stub.StreamObserver<kyobobook.grpc.test.TestResponse> responseObserver) {
        log.debug("gRPC 단건선택으로 들어옴..");

        ResponseMessage responseMessage = this.testService.selectNonMultipleData(request.getOrdrId());

        TestEntity data = (TestEntity) responseMessage.getData();
        responseObserver.onNext(kyobobook.grpc.test.TestResponse.newBuilder().setOrdrId(data.getOrdrId()).build());

        responseObserver.onCompleted();

    }

}
