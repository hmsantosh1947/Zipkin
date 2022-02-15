package com.san.zipkin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ZipkinApplication {
	
	Logger log = LoggerFactory.getLogger(ZipkinApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ZipkinApplication.class, args);
	}
	
	@GetMapping(value = "/hello")
	public String helloWorld() {
		log.debug("Inside hello world");
		return "Hello World";
	}

}
