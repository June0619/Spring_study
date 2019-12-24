package com.care.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {
	
	@RequestMapping("cookie")
	public String myCookie(HttpServletResponse response,
			HttpServletRequest request, Model model,
	@CookieValue(value="ck", required=false) Cookie cook)
	{
		if(cook != null)
			model.addAttribute("cook", cook.getValue());
		System.out.println(cook);
		return "cookie";
	}
	@RequestMapping("popup")
	public String popup()
	{
		return "popup";
	}
	@RequestMapping("popup_off")
	public void popup_off(HttpServletResponse response)
	{
		Cookie cookie = new Cookie("ck", "true");
		cookie.setMaxAge(100);
		response.addCookie(cookie);
	}
	
	@RequestMapping("popup_close")
	public String popup_close()
	{
		return "popup_close";
	}
}
