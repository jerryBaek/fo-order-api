/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com           2021. 9. 6.   First Draft.
 *
 ****************************************************/
package kyobobook.application.adapter.out.rest.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import kyobobook.application.biz.sample.port.out.SampleOutPort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.sample.Sample;
import kyobobook.exception.BizRuntimeException;
import kyobobook.utils.RestTemplateUtil;

/**
 * @Project     : common-prototype-api
 * @FileName    : RestSampleAdapter.java
 * @Date        : 2021. 9. 6.
 * @author      : smlee1@kyobobook.com
 * @description : Rest Api 를 사용해서 common-prototype-sub-api 와 통신한다.
 *                gRPC 대용으로 활용하기 위한 샘픔, port 는 동일한 포트를 사용한다.
 */
@Service("restSampleAdapter")
public class RestSampleAdapter implements SampleOutPort{
    
    /**
     * common-prototype-sub-api 호출 url
     */
    @Value("${resource.common-prototype-sub-api.url}")
    String subApiUrl;
    
    private final RestTemplateUtil restTemplateUtil;
    
    public RestSampleAdapter(RestTemplateUtil restTemplateUtil) {
        this.restTemplateUtil = restTemplateUtil;
    }

    /**
     * @Method      : errorCheck
     * @Date        : 2021. 9. 8.
     * @author      : smlee1@kyobobook.com
     * @description : response 의 에러 여부 체크 
     * @param responseMessage
     * @throws BizException
     */
    private void errorCheck(ResponseMessage responseMessage) throws BizRuntimeException {
        if(responseMessage.getStatusCode() != HttpStatus.OK.value()) {
            // 오류가 발생한 상태
            throw new BizRuntimeException(responseMessage.getStatusCode(), responseMessage.getDetailMessage());
        }
    }
    
    @Override
    public List<?> selectGrpcSample() throws BizRuntimeException {
        String url = subApiUrl + "/rest-sample/samples";
        HttpHeaders httpHeaders = new HttpHeaders();
        ResponseEntity<?> responseEntity = restTemplateUtil.send(url, HttpMethod.GET, httpHeaders, null, ResponseMessage.class);
        
        ResponseMessage responseMessage = (ResponseMessage) responseEntity.getBody();
        this.errorCheck(responseMessage);
        
        return (List<?>) responseMessage.getData();
    }

    @Override
    public Sample getGprcSample(int seq) throws BizRuntimeException {
        String url = subApiUrl + "/rest-sample/sample/" + seq;
        HttpHeaders httpHeaders = new HttpHeaders();
        ResponseEntity<?> responseEntity = restTemplateUtil.send(url, HttpMethod.GET, httpHeaders, null, ResponseMessage.class);

        ResponseMessage responseMessage = (ResponseMessage) responseEntity.getBody();
        this.errorCheck(responseMessage);
        
        return responseMessage.getConvertFromMapToData(Sample.class);
    }

    @Override
    public String insertGrpSample(Sample sample) throws BizRuntimeException {
        String url = subApiUrl + "/rest-sample/sample";
        HttpHeaders httpHeaders = new HttpHeaders();
        ResponseEntity<?> responseEntity = restTemplateUtil.send(url, HttpMethod.POST, httpHeaders, sample, ResponseMessage.class);
        
        ResponseMessage responseMessage = (ResponseMessage) responseEntity.getBody();
        this.errorCheck(responseMessage);
        
        return responseMessage.getResultMessage();
    }

    @Override
    public String updateGrpSample(Sample sample) throws BizRuntimeException {
        String url = subApiUrl + "/rest-sample/sample";
        HttpHeaders httpHeaders = new HttpHeaders();
        ResponseEntity<?> responseEntity = restTemplateUtil.send(url, HttpMethod.PUT, httpHeaders, sample, ResponseMessage.class);
        
        ResponseMessage responseMessage = (ResponseMessage) responseEntity.getBody();
        this.errorCheck(responseMessage);
        
        return responseMessage.getResultMessage();
    }

    @Override
    public String deleteGrpSample(int seq) throws BizRuntimeException {
        String url = subApiUrl + "/rest-sample/sample/" + seq;
        HttpHeaders httpHeaders = new HttpHeaders();
        ResponseEntity<?> responseEntity = restTemplateUtil.send(url, HttpMethod.DELETE, httpHeaders, null, ResponseMessage.class);
        
        ResponseMessage responseMessage = (ResponseMessage) responseEntity.getBody();
        this.errorCheck(responseMessage);
        
        return responseMessage.getResultMessage();
    }
}