package com.itmuch.cloud.microservicesimpleconsumermovie;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration{
    /**
     * 契约改为原生的feign的默认契约
     * @return默认的feign的契约
     */
    @Bean
    public Contract feignContract(){
        return new feign.Contract.Default();
    }
}
