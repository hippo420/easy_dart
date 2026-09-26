package com.easydart;

import com.easydart.client.DartHttpClient;
import com.easydart.service.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DartProperties.class)
public class EasyDartAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public DartHttpClient dartHttpClient(DartProperties props) {
        return new DartHttpClient(props);
    }

    @Bean
    @ConditionalOnMissingBean
    public DartClient dartClient(DartHttpClient httpClient) {
        return new DartClient(httpClient);
    }
}
