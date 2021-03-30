package cn.xian.apollo.config.center.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ApiController
 * @Description TODO
 * @Author zhangjianwei
 * @Date 2021/1/5 19:53
 * @Version 1.0
 **/
@RestController
@RequestMapping("/apollo")
public class ApiController {
    @Value("${spring.datasource.aitrack.url}")
    String dataSourceUrl;
    @RequestMapping("/getUrl")
    public String getConfig(){
        return dataSourceUrl;
    }
}
