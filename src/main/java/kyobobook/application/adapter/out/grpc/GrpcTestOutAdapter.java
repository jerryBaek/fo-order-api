/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com      2021. 8. 17.
 *
 ****************************************************/
package kyobobook.application.adapter.out.grpc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import kyobobook.application.adapter.out.persistence.test.entity.TestEntity;
import kyobobook.application.biz.test.port.out.TestOutPort;
import kyobobook.exception.BizRuntimeException;
import kyobobook.grpc.test.TestGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;

/**
 * @Project     : fo-order-api
 * @FileName    : GrpcTestOutAdapter.java
 * @Date        : 2021. 11. 4.
 * @author      : kimsehoon@kyobobook.com
 * @description :
 */
@Service("grpcTestOutAdapter")
public class GrpcTestOutAdapter implements TestOutPort {

    @GrpcClient("common-order-api")
    private TestGrpc.TestBlockingStub testStub;

    @Override
    public List<TestEntity> selectData() throws BizRuntimeException {
        Iterator<kyobobook.grpc.test.TestResponse> data = this.testStub.selectData(null);
        List<TestEntity> convertedData = new ArrayList<TestEntity>();

        data.forEachRemaining(x -> {
            convertedData.add(TestEntity.builder().ordrId(x.getOrdrId()).build());
        });

        return convertedData;
    }

    @Override
    public TestEntity getData(String seq) throws BizRuntimeException {
        kyobobook.grpc.test.TestResponse data = this.testStub
                .getData(kyobobook.grpc.test.TestRequest.newBuilder().setOrdrId(seq).build());

        return TestEntity.builder().ordrId(data.getOrdrId()).build();
    }

}
