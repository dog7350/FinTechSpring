package com.care.di;

public class Main {
	public static void main(String[] args) {
		STBean stBean = new STBean();
		
		stBean.setName("ȫ�浿");
		stBean.setAge(20);
		stBean.setSt(new Student());
		
		stBean.agePrint();
		stBean.namePrint();
	}
}
