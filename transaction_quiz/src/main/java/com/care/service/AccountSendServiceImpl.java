package com.care.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.care.dao.AccountDAO;
@Service
public class AccountSendServiceImpl implements AccountService{
	@Autowired
	AccountDAO accountDAO;
//	public AccountSendServiceImpl() {
//		String path = "classpath:applicationJDBC.xml";
//		GenericXmlApplicationContext ctx 
//				= new GenericXmlApplicationContext(path);
//		dao = ctx.getBean("dao", AccountDAO.class);
//	}
	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = 
				(HttpServletRequest)map.get("request");
		int send_num = Integer.parseInt(request.getParameter("send_num"));
		int money = Integer.parseInt(request.getParameter("money"));
		int to_num = Integer.parseInt(request.getParameter("to_num"));
		accountDAO.send(send_num, to_num, money);
	}
}