package com.care.di03;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.care.di02.STBean;

public class Main {
	public static void main(String[] args) {
		String path = "classpath:applicationDB.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		DBClass db = ctx.getBean("db", DBClass.class);
		
		System.out.println(db.getId());
		System.out.println(db.getPwd() + "\n\n=====================\n");
		
		DBClass db1 = ctx.getBean("db1", DBClass.class);
		
		System.out.println(db1.getId());
		System.out.println(db1.getPwd());
	}
}
