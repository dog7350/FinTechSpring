package com.care.root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	@Autowired
	private MemberService ms;
	
	public MemberController() {
		System.out.println("Controller");
	}
	
	@GetMapping("/index") // URL 경로
	public String index() {
		ms.test();
		return "index"; // JSP 경로
	}
	
	@GetMapping("/result")
	public String result(Model model) {
		model.addAttribute("member", ms.result());
		return "result";
	}
}
