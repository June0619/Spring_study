package com.care.controller03;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RedirectController {
	
	@RequestMapping("index")
	public String index() {
		return "redirect01/index";
	}
	@RequestMapping("result")
	public String resultRedirect(HttpServletRequest request,
			RedirectAttributes rs) {
		String id = request.getParameter("id");
		System.out.println("id : "+id);
		if(id.equals("abc")) {
			return "redirect:rsOK?id="+id;
			//return "redirect01/rsOK";
		}
		rs.addFlashAttribute("msg","아이디가 틀렸습니다");
		return "redirect:rsNO";
		//return "redirect01/rsNO";
	}
	@RequestMapping("rsOK")
	public String resultOK(Model model,
							HttpServletRequest request) {
		//db에 접근해서 데이터를 가져오는 코드
		//해당 데이터를 model에 저장해서 view로 보여주는 값
		System.out.println("request id : "+request.getParameter("id"));
		return "redirect01/rsOK";
	}
	@RequestMapping("rsNO")
	public String resultNO(Model model,RedirectAttributes rs,
			HttpServletRequest request) {
		System.out.println(rs.getFlashAttributes().get("msg"));
		System.out.println("rs : "+request.getAttribute("msg"));
		return "redirect01/rsNO";
	}
}
