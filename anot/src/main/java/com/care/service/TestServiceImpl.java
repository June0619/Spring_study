package com.care.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.care.dao.TestDAO;

@Service
public class TestServiceImpl implements TestService{
	
	@Autowired //context-config 내에 dao 객체 두개가 생성되어 있으므로 문제가 생김
	@Qualifier("testDAO")
	private TestDAO dao;
	
	@Override
	public void execute() {
//		dao = new TestDAO();
		dao.test();
	}
}
