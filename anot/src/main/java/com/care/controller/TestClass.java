package com.care.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

//@Controller
//@Repository -> ��������� �ǹ� // ���� DAO��ü�� ���
//@Service -> ���� ��ü�� ���� ���
@Component 
public class TestClass {

	public TestClass()
	{
		System.out.println("TestClass ������");
	}
	public void print()
	{
		System.out.println("Test Print() Method.");
	}
	
}
