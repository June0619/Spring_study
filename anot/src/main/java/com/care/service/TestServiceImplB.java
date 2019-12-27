package com.care.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.dao.TestDAO;

@Service
public class TestServiceImplB implements TestService{
	
	@Autowired
	TestDAO dao;
	public void execute() {
		dao.test02();
	}
}
