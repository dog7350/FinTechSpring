package com.care.di04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String path = "classpath:applicationCAR.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		// Controller01.class or Controller02.class => Car.class
		Car car = ctx.getBean("car", Car.class);
		
		System.out.println("Main Start...");
		
		car.speed();
		System.out.println("==================");
		
		SubClass sc = new SubClass();
		sc.print();
	}
}
