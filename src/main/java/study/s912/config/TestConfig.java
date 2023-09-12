package com.care.root.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
	@Bean
	public TestClass tc() { // Java Code로 Bean 생성
		TestClass test = new TestClass();
		test.setName("홍길동");
		return test;
	}
}
