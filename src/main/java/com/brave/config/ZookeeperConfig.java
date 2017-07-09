package com.brave.config;

import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by junzhang on 2017/7/9.
 */
@Configuration
public class ZookeeperConfig {

    @Bean
    ZookeeperConfiguration zookeeperConfiguration(@Value("${regCenter.serverList}") final String serverList,@Value("${regCenter.namespace}") final String namespace){
        return new ZookeeperConfiguration(serverList,namespace);
    }
}
