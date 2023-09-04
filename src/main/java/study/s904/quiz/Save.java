package com.care.quiz;

public class Save {
	private int num1, num2, result;
	private String op;
	private Print pc;
	private Operation oc;
	
	public void operation() { result = oc.operation(num1, num2, op); }
	public void print() { pc.printFunc(num1, op, num2, result); }
	
	public int getNum1() { return num1; }
	public void setNum1(int num1) { this.num1 = num1; }
	public int getNum2() { return num2; }
	public void setNum2(int num2) { this.num2 = num2; }
	public int getResult() { return result; }
	public void setResult(int result) { this.result = result; }
	public String getOp() { return op; }
	public void setOp(String op) { this.op = op; }
	public Print getPc() { return pc; }
	public void setPc(Print pc) { this.pc = pc; }
	public Operation getOc() { return oc; }
	public void setOc(Operation oc) { this.oc = oc; }
}
