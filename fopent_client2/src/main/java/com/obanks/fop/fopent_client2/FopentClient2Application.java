package com.obanks.fop.fopent_client2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication
public class FopentClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(FopentClient2Application.class, args);
	}

	@Value("${server.port}")
	String port;

	@RequestMapping(method = RequestMethod.GET,value = "/hi")
    public String selfIntro(@RequestParam String name) {
	    return "hi "+name+"i am port "+port;
    }
}
