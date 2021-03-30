package com.liuscoding.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaApplication7002
 * @Description TODO
 * @Author zhangjianwei
 * @Date 2020/8/24 16:12
 * @Version 1.0
 **/
@SpringBootApplication
//表示自己是Eureka服务端
@EnableEurekaServer
public class EurekaApplication7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication7002.class,args);
    }
}
