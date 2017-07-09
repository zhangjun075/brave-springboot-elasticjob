package com.brave.config;

import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by junzhang on 2017/7/9.
 */
@Configuration
public class ZkRegisterCenter {
    @Autowired ZookeeperConfiguration zookeeperConfiguration;

    @Bean(initMethod = "init") ZookeeperRegistryCenter zookeeperRegistryCenter(){
        return new ZookeeperRegistryCenter(zookeeperConfiguration);
    }
}
