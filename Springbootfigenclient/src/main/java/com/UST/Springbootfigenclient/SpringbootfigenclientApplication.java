package com.UST.Springbootfigenclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbootfigenclientApplication
{
	public static void main(String[] args) {
		SpringApplication.run(SpringbootfigenclientApplication.class, args);

	}
}
