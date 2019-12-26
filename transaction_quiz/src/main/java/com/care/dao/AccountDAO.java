package com.care.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.support.TransactionTemplate;

import com.care.dto.AccountDTO;
import com.care.template.Constant;

public class AccountDAO {

	private JdbcTemplate template;
	private TransactionTemplate transactionTemplate;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	public AccountDAO() {
		setTemplate(Constant.template);
	}

	public Map<String, AccountDTO> checkAccount(int num) {
		String sql_user = "select * from balance where num="+num;
		String sql_system = "select * from sysaccount where num="+num;
		
		System.out.println(num);

		Map<String, AccountDTO> map = new HashMap<String, AccountDTO>();
		AccountDTO userAccount = null;
		AccountDTO sysAccount = null;

		try {
			userAccount = template.queryForObject(sql_user, new BeanPropertyRowMapper<AccountDTO>(AccountDTO.class));
		} catch (Exception e) {	e.printStackTrace(); 
		System.out.println("error");}
		try {
			sysAccount = template.queryForObject(sql_system, new BeanPropertyRowMapper<AccountDTO>(AccountDTO.class));
		} catch(Exception e) { e.printStackTrace(); 
		System.out.println("error");}
		map.put("user", userAccount);
		map.put("sys", sysAccount);
		return map;
	}
}
