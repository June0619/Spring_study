package com.care.controller;

public class MainClass {
	public static void main(String[] args) {
		
		Student student = new Student();
		STBean stBean = new STBean();
		stBean.setSt(student);
		
		
		String name = "ȫ�浿";
		int age = 222;
		
		stBean.setName(name);
		stBean.setAge(age);
		
		
		stBean.getSt().namePrint(stBean.getName());
		stBean.getSt().agePrint(stBean.getAge());
		
	}
}



