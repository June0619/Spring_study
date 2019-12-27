package com.care.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.care.dto.AccountDTO;
import com.care.template.Constant;

@Repository
public class AccountDAO {
	
	@Autowired
	private JdbcTemplate template;
	@Autowired
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
		setTransactionTemplate(Constant.transactionTemplate);
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
	
	public void deposit(int num, int deposit)
	{
		final String sql_user = "update balance set totmoney = totmoney +"+deposit 
				+" where num = " + num;
		final String sql_sys = "update sysaccount set money = money +"+deposit 
				+" where num = " + num;
		try
		{
			transactionTemplate.execute(new TransactionCallbackWithoutResult() {
				@Override
				protected void doInTransactionWithoutResult(TransactionStatus status) {
					template.update(sql_user);
					template.update(sql_sys);
				}
			});
		}
		catch(Exception e) { e.printStackTrace(); }
	}
	
	public void send(int send_num, int to_num, int money)
	{
		final String sql_send = "update balance set totmoney = totmoney - "+money+
				"where num = "+send_num;
		final String sql_receive = "update balance set totmoney = totmoney + "+money+
				"where num = "+to_num;
		final String sql_sysSend = "update sysaccount set money = money - "+money+
				"where num = "+send_num;
		final String sql_sysReceive = "update sysaccount set money = money + "+money+
				"where num = "+to_num;
		try
		{
			transactionTemplate.execute(new TransactionCallbackWithoutResult() {
				@Override
				protected void doInTransactionWithoutResult(TransactionStatus status) {
					template.update(sql_send);
					template.update(sql_receive);
					template.update(sql_sysSend);
					template.update(sql_sysReceive);
				}
			});
		}
		catch(Exception e) { e.printStackTrace(); }
	}
}
