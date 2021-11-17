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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import kyobobook.application.adapter.out.persistence.test.entity.TestEntity;
import kyobobook.application.biz.test.port.in.TestPort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.config.interceptor.ExceptionGrpcInterceptor;
import kyobobook.grpc.test.TestGrpc.TestImplBase;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * @Project     : common-order-api
 * @FileName    : GrpcTestAdapter.java
 * @Date        : 2021. 11. 4.
 * @author      : kimsehoon@kyobobook.com
 * @description : 데이터 수신 어댑터
 */
@GrpcService(interceptors = ExceptionGrpcInterceptor.class)
public class GrpcTestInAdapter extends TestImplBase {

    private static final Logger logger = LoggerFactory.getLogger(GrpcTestInAdapter.class);

    @Autowired
    private TestPort testService;

//    private final MessageSourceAccessor messageSource;

//    public GrpcTestAdapter(SamplePort samplePort, MessageSourceAccessor messageSource) {
//	    this.testPort = testPort;
//        this.messageSource = messageSource;
//    }

    @Override
    public void selectData(com.google.protobuf.Empty request,
            io.grpc.stub.StreamObserver<kyobobook.grpc.test.TestResponse> responseObserver) {
//        io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSelectDataMethod(), responseObserver);

        logger.debug("gRPC 다건선택으로 들어옴..");

        // kyobobook.application.adapter.out.persistence.test.entity.TestEntity
        ResponseMessage responseMessage = this.testService.selectMultipleData();

        @SuppressWarnings("unchecked")
        // 목록 조회로 data 는 List<Sample> 타입만 들어와야 한다.
        List<TestEntity> dataList = (List<TestEntity>) responseMessage.getData();
        dataList.stream().forEach(data -> {
            responseObserver.onNext(kyobobook.grpc.test.TestResponse.newBuilder().setOrdrId(data.getOrdrId()).build());
        });

        responseObserver.onCompleted();

    }

    @Override
    public void getData(kyobobook.grpc.test.TestRequest request,
            io.grpc.stub.StreamObserver<kyobobook.grpc.test.TestResponse> responseObserver) {
        logger.debug("gRPC 단건선택으로 들어옴..");

        ResponseMessage responseMessage = this.testService.selectNonMultipleData(request.getOrdrId());

        // 목록 조회로 data 는 List<Sample> 타입만 들어와야 한다.
        TestEntity data = (TestEntity) responseMessage.getData();
        responseObserver.onNext(kyobobook.grpc.test.TestResponse.newBuilder().setOrdrId(data.getOrdrId()).build());

        responseObserver.onCompleted();

    }

}
