package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 简单的SpringBoot应用
 * @Description: TODO
 * @author Cloop
 *
 * @date 2017年9月28日 上午10:10:51
 */

@RestController
@EnableAutoConfiguration
public class Example {

	@RequestMapping("/")
	String home() {
		return "Welcome to PMS example!";
	}
	
	@RequestMapping("/other")
	String devTooles() {
		return "Test the dev tools!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);
	}
}
