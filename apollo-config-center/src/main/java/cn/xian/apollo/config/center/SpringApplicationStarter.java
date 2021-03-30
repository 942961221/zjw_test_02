package cn.xian.apollo.config.center;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName SpringApplicationStarter
 * @Description TODO
 * @Author zhangjianwei
 * @Date 2021/1/5 19:46
 * @Version 1.0
 **/
@SpringBootApplication(scanBasePackages = "cn.xian.apollo")
@EnableApolloConfig
public class SpringApplicationStarter {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationStarter.class, args);
    }
}
