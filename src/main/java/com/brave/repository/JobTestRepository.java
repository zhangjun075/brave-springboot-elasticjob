package com.brave.repository;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static org.jooq.util.repos.Tables.TAB_JOB_TEST;

/**
 * Created by junzhang on 2017/7/9.
 */
@Repository
public class JobTestRepository {
    @Autowired
    DSLContext dslContext;

    public Result<Record> selectTabJobRecord(String location){
        return dslContext.select().from(TAB_JOB_TEST).where(TAB_JOB_TEST.LOCATION.eq(location)).fetch();
    }

}
