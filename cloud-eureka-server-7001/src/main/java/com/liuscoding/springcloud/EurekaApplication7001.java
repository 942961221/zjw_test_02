package com.liuscoding.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaApplication7001
 * @Description TODO
 * @Author zhangjianwei
 * @Date 2020/8/24 14:52
 * @Version 1.0
 **/
@SpringBootApplication
//表示自己是Eureka服务端
@EnableEurekaServer
public class EurekaApplication7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication7001.class,args);
    }
}
