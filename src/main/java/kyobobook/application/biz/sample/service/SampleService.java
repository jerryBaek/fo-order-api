/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com           2021. 8. 12.  First Draft.
 *
 ****************************************************/
package kyobobook.application.biz.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kyobobook.application.biz.sample.port.in.SamplePort;
import kyobobook.application.biz.sample.port.out.SampleGrpcOutPort;
import kyobobook.application.biz.sample.port.out.SamplePersistencePort;
import kyobobook.application.domain.sample.Sample;

/**
 * @Project     : common-prototype-api
 * @FileName    : SampleService.java
 * @Date        : 2021. 8. 12.
 * @author      : smlee1@kyobobook.com
 * @description : Sample로 작성된 Service class 이다.
 *                Writer와 Reader 데이터 베이스에 데이터 처리를 한다.
 */
@Service
public class SampleService implements SamplePort {
    
    @Autowired
    @Qualifier("sampleWriterRepository")
    SamplePersistencePort sampleWriterPort;
    
    @Autowired
    @Qualifier("sampleReaderRepository")
    SamplePersistencePort sampleReaderPort;
    
    @Autowired
    @Qualifier("grpcSampleAdapter")
    SampleGrpcOutPort sampleGrpcOutPort;
    
    @Override
    public List<Sample> selectMasterSample() {
        return sampleWriterPort.selectSample();
    }

    @Override
    public Sample getMasterSample(int seq) {
        return sampleWriterPort.getSample(seq);
    }

    @Override
    public int insertMasterSample(Sample sample) {
        return sampleWriterPort.insertSample(sample);
    }

    @Override
    public int updateMasterSample(Sample sample) {
        return sampleWriterPort.updateSample(sample);
    }

    @Override
    public int deleteMasterSample(int seq) {
        return sampleWriterPort.deleteSample(seq);
    }

    @Override
    public List<Sample> selectSlaveSample() {
        return sampleReaderPort.selectSample();
    }

    @Override
    public Sample getSlaveSample(int seq) {
        return sampleReaderPort.getSample(seq);
    }

    @Override
    public void insertSlaveSample(Sample sample) throws Exception {
        sampleReaderPort.insertSample(sample);
    }

    @Override
    public void updateSlaveSample(Sample sample) {
        sampleReaderPort.updateSample(sample);
    }

    @Override
    public void deleteSlaveSample(int seq) {
        sampleReaderPort.deleteSample(seq);
    }

    @Override
    public List<Sample> selectSubSample() {
        List<Sample> sampleList = sampleGrpcOutPort.selectGrpcSample();
        return sampleList;
    }

    @Override
    public Sample getSubSample(int seq) {
        return sampleGrpcOutPort.getGprcSample(seq);
    }

    @Override
    public void insertSubSample(Sample sample) throws Exception {
        sampleGrpcOutPort.insertGrpSample(sample);
    }

    @Override
    public void updateSubSample(Sample sample) {
        sampleGrpcOutPort.updateGrpSample(sample);
    }

    @Override
    public void deleteSubSample(int seq) {
        sampleGrpcOutPort.deleteGrpSample(seq);
    }
}
