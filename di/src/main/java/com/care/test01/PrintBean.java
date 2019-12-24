package com.care.test01; //application_test01.xml
public class PrintBean {
	private String print;
	private PrintString ps;
	
	public void printString(String print) {
		ps.printString(print);
	}
	public void printString() {
		ps.printString(print);
	}
	
	public String getPrint() {
		return print;
	}
	public void setPrint(String print) {
		this.print = print;
	}
	public PrintString getPs() {
		return ps;
	}
	public void setPs(PrintString ps) {
		this.ps = ps;
	}
	
}

