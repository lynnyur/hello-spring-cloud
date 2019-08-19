package com.lynnyur.hello.spring.cloud.web.admin.feign.service;

import com.lynnyur.hello.spring.cloud.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hello-spring-cloud-service-admin", fallback = AdminServiceHystrix.class)
public interface AdminService {

    @GetMapping("hi")
    public String sayHi(@RequestParam(value = "message") String message);
}
