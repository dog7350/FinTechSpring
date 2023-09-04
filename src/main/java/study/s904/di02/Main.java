package com.care.di02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// classpath : resources ������ ��Ī�ϴ� ����
		// src/main/resources/applicationST.xml
		String path = "classpath:applicationST.xml";
		
		// path�� ������ �����ϰ� �ش� bean ���� IoC �����̳ʿ� ���
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		STBean stb = ctx.getBean("stb", STBean.class);
		// stb.setName("ȫ�浿");
		// stb.setAge(20);
		
		stb.namePrint();
		stb.agePrint();
	}
}
