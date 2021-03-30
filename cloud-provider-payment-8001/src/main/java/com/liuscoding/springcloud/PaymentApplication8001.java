package com.liuscoding.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @ClassName PaymentApplication8001
 * @Description TODO
 * @Author zhangjianwei
 * @Date 2020/8/18 20:23
 * @Version 1.0
 **/
@SpringBootApplication
//表示自己是Eureka客户端
@EnableEurekaClient
@EnableScheduling
//能够让注册中心能够发现，扫描到改服务
@EnableDiscoveryClient
public class PaymentApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8001.class,args);
    }
}
