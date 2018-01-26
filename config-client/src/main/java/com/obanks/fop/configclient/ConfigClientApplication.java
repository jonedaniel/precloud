package com.obanks.fop.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    //此处使用 Placeholder从远程配置中心读取
    @Value("${version}")
    String version;
    @Value("${remark}")
    String remark;
    @RequestMapping(value = "/hi")
    public String hi(){
        return version+" "+remark;
    }
}