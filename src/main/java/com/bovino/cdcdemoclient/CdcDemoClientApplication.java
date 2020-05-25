package com.bovino.cdcdemoclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CdcDemoClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CdcDemoClientApplication.class, args);
	}

}
