package com.obanks.fop.fopent_client1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class FopentClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(FopentClient1Application.class, args);
	}

	@Value("${server.port}")
	String port;

    @RequestMapping(method = RequestMethod.GET, value = "/hi")
    public String home(@RequestParam String name) {
        return "hi"+name+" i am from port: "+port;
    }
}
