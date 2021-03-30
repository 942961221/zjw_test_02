package com.liuscoding.springcloud;

import com.liuscoding.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @ClassName OrderApplication80
 * @Description TODO
 * @Author zhangjianwei
 * @Date 2020/8/24 13:53
 * @Version 1.0
 **/
@SpringBootApplication
//表示自己是Eureka客户端
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration= MySelfRule.class)
public class OrderApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication80.class,args);
    }
}
