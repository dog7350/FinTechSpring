package com.care.di04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SubClass {
	public void print() {
		String path = "classpath:applicationCAR.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		Car car = ctx.getBean("car", Car.class);
		
		System.out.println("Sub Start...");
		
		car.speed();
		System.out.println("==================");
	}
}
