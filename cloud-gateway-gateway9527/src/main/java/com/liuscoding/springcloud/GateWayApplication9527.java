package com.liuscoding.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName GateWayApplication9527
 * @Description TODO
 * @Author zhangjianwei
 * @Date 2021/1/4 15:00
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class GateWayApplication9527 {
    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication9527.class, args);
    }
}
