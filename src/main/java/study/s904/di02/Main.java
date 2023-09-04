package com.care.di02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// classpath : resources 폴더를 지칭하는 문법
		// src/main/resources/applicationST.xml
		String path = "classpath:applicationST.xml";
		
		// path의 파일을 실행하고 해당 bean 값을 IoC 컨테이너에 등록
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		STBean stb = ctx.getBean("stb", STBean.class);
		// stb.setName("홍길동");
		// stb.setAge(20);
		
		stb.namePrint();
		stb.agePrint();
	}
}
