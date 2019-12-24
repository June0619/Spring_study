package com.care.controller02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.member.Member;

@Controller
@RequestMapping("/member03")
public class MyController 
{
	@RequestMapping("index")
	public String index() {
		return "member03/index";
	}
	@RequestMapping("result")
	public String memberResult(Member member, Model model)
	{
		System.out.println("이름 : " + member.getName());
		System.out.println("나이 : " + member.getAge());
		model.addAttribute("member", member);
		return "member03/result";
	}
}
