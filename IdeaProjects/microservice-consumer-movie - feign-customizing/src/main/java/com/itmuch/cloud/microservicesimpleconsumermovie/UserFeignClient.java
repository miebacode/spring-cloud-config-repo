package com.itmuch.cloud.microservicesimpleconsumermovie;

import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="microzervice-provider-user",configuration  =FeignConfiguration.class)
public interface  UserFeignClient {
    @RequestLine("GET/{id}")
    public  User findById(@Param("id") int id);
}
