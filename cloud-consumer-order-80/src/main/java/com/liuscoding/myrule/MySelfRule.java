package com.liuscoding.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MySelfRule
 * @Description TODO
 * @Author zhangjianwei
 * @Date 2020/11/24 15:33
 * @Version 1.0
 **/
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule()
    {   //定义为随机
        return new RandomRule();
    }
}
