package com.brave.service;

import com.brave.repository.JobTestRepository;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by junzhang on 2017/7/9.
 */
@Service
public class JobTestService {
    @Autowired
    JobTestRepository jobTestRepository;

    public Result<Record> queryJobInfo(String location){
        return jobTestRepository.selectTabJobRecord(location);
    }

}
