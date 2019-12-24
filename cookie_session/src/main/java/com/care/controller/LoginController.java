package com.care.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String loginGet()
	{
		return "login/login";
	}
	@RequestMapping(value="chkUser", method=RequestMethod.POST)
	public String chkUser(HttpServletRequest request)
	{
		String id="1", pwd="1", name="zs";
		String reqid = request.getParameter("id");
		String reqpwd = request.getParameter("pwd");
		HttpSession session = null;
		if(id.equals(reqid) && pwd.equals(reqpwd))
		{
			session = request.getSession();
			session.setAttribute("loginUser", name);
			return "login/main";
		}
		return "redirect:login";
	}
	@RequestMapping("logout")
	public String logout(HttpServletRequest request)
	{
		request.getSession().invalidate();
		return "login/logout";
	}
	
}