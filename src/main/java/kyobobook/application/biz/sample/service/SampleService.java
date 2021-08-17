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
import kyobobook.application.biz.sample.port.out.SampleGrpcPort;
import kyobobook.application.biz.sample.port.out.SamplePersistencePort;
import kyobobook.application.domain.sample.Sample;

/**
 * @Project     : common-prototype-api
 * @FileName    : SampleService.java
 * @Date        : 2021. 8. 12.
 * @author      : smlee1@kyobobook.com
 * @description : Sample로 작성된 Service class 이다.
 *                Master와 Slave 데이터 베이스에 데이터 처리를 한다.
 */
@Service
public class SampleService implements SamplePort {
    
    @Autowired
    @Qualifier("sampleMasterRepository")
    SamplePersistencePort sampleMasterPort;
    
    @Autowired
    @Qualifier("sampleSlaveRepository")
    SamplePersistencePort sampleSlavePort;
    
    @Autowired
    @Qualifier("grpcSampleService")
    SampleGrpcPort sampleGrpcPort;
    
    @Override
    public List<Sample> selectMasterSample() {
        return sampleMasterPort.selectSample();
    }

    @Override
    public Sample getMasterSample(int seq) {
        return sampleMasterPort.getSample(seq);
    }

    @Override
    public int insertMasterSample(Sample sample) {
        return sampleMasterPort.insertSample(sample);
    }

    @Override
    public int updateMasterSample(Sample sample) {
        return sampleMasterPort.updateSample(sample);
    }

    @Override
    public int deleteMasterSample(int seq) {
        return sampleMasterPort.deleteSample(seq);
    }

    @Override
    public List<Sample> selectSlaveSample() {
        return sampleSlavePort.selectSample();
    }

    @Override
    public Sample getSlaveSample(int seq) {
        return sampleSlavePort.getSample(seq);
    }

    @Override
    public void insertSlaveSample(Sample sample) throws Exception {
        sampleSlavePort.insertSample(sample);
    }

    @Override
    public void updateSlaveSample(Sample sample) {
        sampleSlavePort.updateSample(sample);
    }

    @Override
    public void deleteSlaveSample(int seq) {
        sampleSlavePort.deleteSample(seq);
    }

    @Override
    public List<Sample> selectSubSample() {
        List<Sample> sampleList = sampleGrpcPort.selectGrpcSample();
        return sampleList;
    }

    @Override
    public Sample getSubSample(int seq) {
        return sampleGrpcPort.getGprcSample(seq);
    }

    @Override
    public void insertSubSample(Sample sample) throws Exception {
        sampleGrpcPort.insertGrpSample(sample);
    }

    @Override
    public void updateSubSample(Sample sample) {
        sampleGrpcPort.updateGrpSample(sample);
    }

    @Override
    public void deleteSubSample(int seq) {
        sampleGrpcPort.deleteGrpSample(seq);
    }
}
