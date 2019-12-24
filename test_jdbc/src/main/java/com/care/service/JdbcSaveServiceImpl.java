package com.care.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.care.jdbc_dao.JdbcDAO;

public class JdbcSaveServiceImpl implements JdbcService {

	@Override
	public void execute(Model model) {
		// Request 객체를 model에 담아 사용 가능(Map자료형으로 받아옴)
		Map<String, Object> map = model.asMap();
		HttpServletRequest request =
				(HttpServletRequest)map.get("request");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		JdbcDAO dao = new JdbcDAO();
		dao.save(id, name);
	}
}
