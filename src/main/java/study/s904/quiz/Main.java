package com.care.quiz;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String path = "classpath:application_quiz.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		Save save = ctx.getBean("save", Save.class);
		
		save.operation();
		save.print();
	}
}
