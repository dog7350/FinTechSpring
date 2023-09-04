package com.care.quiz;

public class Operation {
	public int operation(int num1, int num2, String op) {
		int result = 0;
		
		switch(op.charAt(0)) {
			case '+' : result = num1 + num2; break;
			case '-' : result = num1 - num2; break;
			case '*' : result = num1 * num2; break;
			case '/' : result = num1 / num2; break;
			case '%' : result = num1 % num2; break;
		}
		
		return result;
	}
}
