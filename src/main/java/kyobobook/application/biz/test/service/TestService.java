/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * kimsehoon@kyobobook.com      2021. 10. 27.
 *
 ****************************************************/
package kyobobook.application.biz.test.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import kyobobook.application.adapter.out.persistence.test.entity.TestEntity;
import kyobobook.application.biz.test.port.in.TestPort;
import kyobobook.application.biz.test.port.out.TestOutPort;
import kyobobook.application.biz.test.port.out.TestPersistencePort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.exception.BizRuntimeException;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project : fo-order-api
 * @FileName : CartService.java
 * @Date : 2021. 10. 27.
 * @author : kimsehoon@kyobobook.com
 * @description :
 */
@Slf4j
@Service
public class TestService implements TestPort {

    @Autowired
    @Qualifier("testReaderRepository")
    private TestPersistencePort testReaderPort;

    @Autowired
    @Qualifier("grpcTestOutAdapter")
    private TestOutPort testOutPort;

    @Autowired
    private MessageSourceAccessor messageSource;

    @Override
    public ResponseMessage selectMultipleData() throws BizRuntimeException {

        ResponseMessage responseMessage = null;

        try {
            List<TestEntity> returnData = this.testReaderPort.selectData();
            responseMessage = ResponseMessage.builder().data(returnData) // 조회
                    .statusCode(HttpStatus.OK.value()).resultMessage("common.process.complete").build();

        } catch (Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage selectNonMultipleData(String ordrId) {
        ResponseMessage responseMessage = null;

        try {
            responseMessage = ResponseMessage.builder().data(this.testReaderPort.getData(ordrId)) // 조회
                    .statusCode(HttpStatus.OK.value()).resultMessage("common.process.complete").build();

        } catch (Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage selectMultipleDataUsingRpc() {

        ResponseMessage responseMessage = null;

        try {
            List<TestEntity> returnData = this.testOutPort.selectData();
            responseMessage = ResponseMessage.builder().data(returnData) // 조회
                    .statusCode(HttpStatus.OK.value()).resultMessage("common.process.complete").build();

        } catch (Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        return responseMessage;

    }

    @Override
    public ResponseMessage selectNonMultipleDataUsingRpc(String ordrId) {

        ResponseMessage responseMessage = null;

        try {
            responseMessage = ResponseMessage.builder().data(this.testOutPort.getData(ordrId)) // 조회
                    .statusCode(HttpStatus.OK.value()).resultMessage("common.process.complete").build();

        } catch (Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        return responseMessage;

    }

}
