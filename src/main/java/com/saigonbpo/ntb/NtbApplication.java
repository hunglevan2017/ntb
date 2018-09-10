package com.saigonbpo.ntb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:config.properties")
@ImportResource({ "classpath*:spring-config.xml"})
@PropertySource("classpath:jdbc.properties")
public class NtbApplication {

	public static void main(String[] args) {
		SpringApplication.run(NtbApplication.class, args);
	}
}
