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
package kyobobook.application.adapter.out.persistence.sample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kyobobook.application.adapter.out.persistence.sample.entity.SampleEntity;
import kyobobook.application.biz.sample.port.out.SamplePersistencePort;
import kyobobook.application.domain.sample.Sample;

/**
 * @Project     : common-prototype-api
 * @FileName    : SampleMasterAdapter.java
 * @Date        : 2021. 8. 12.
 * @author      : smlee1@kyobobook.com
 * @description : Service 에서 Database 를 접근하기위한 Adapter
 */
@Repository("sampleMasterRepository")
public class SampleMasterAdapter implements SamplePersistencePort {
    
    @Autowired
    SampleMasterMapper sampleMapper;

    @Override
    public List<Sample> selectSample() {
        List<Sample> sampleList = new ArrayList<Sample>();
        sampleMapper.selectSample().stream().forEach(entity -> {
            Sample sample = Sample.builder()
                    .seq(entity.getSeq())
                    .title(entity.getTitle())
                    .contents(entity.getContents())
                    .txt(entity.getTxt())
                    .build();
            sampleList.add(sample);
        });
        
        return sampleList;
    }

    @Override
    public Sample getSample(int seq) {
        SampleEntity sampleEntity = sampleMapper.getSample(seq);
        Sample sample = Sample.builder()
                            .seq(sampleEntity.getSeq())
                            .title(sampleEntity.getTitle())
                            .contents(sampleEntity.getContents())
                            .txt(sampleEntity.getTxt())
                            .build();
        return sample;
    }

    @Override
    public int insertSample(Sample sample) {
        SampleEntity sampleEntity = SampleEntity.builder()
                .title(sample.getTitle())
                .contents(sample.getContents())
                .build();

        return sampleMapper.insertSample(sampleEntity);
    }

    @Override
    public int updateSample(Sample sample) {
        return sampleMapper.updateSample(SampleEntity.builder()
                .seq(sample.getSeq())
                .title(sample.getTitle())
                .contents(sample.getContents())
                .build());
    }

    @Override
    public int deleteSample(int seq) {
        return sampleMapper.deleteSample(seq);
    }

}
