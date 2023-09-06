package com.care.get_post;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/my")
public class MyController {
	public MyController() {
		System.out.println("积己磊 角青~");
	}
	
	@RequestMapping("/index")
	public String index() {
		return "get_post/index";
	}
	
	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public String result(HttpServletRequest req, HttpServletResponse res, Model model) {
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		
		System.out.println("傈价 规侥 : " + req.getMethod());
		System.out.println("NAME : " + name);
		System.out.println("AGE : " + age);
		
		model.addAttribute("method", req.getMethod());
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		
		return "get_post/result";
	}
	
	@PostMapping("/result")
	public String resultPost(@RequestParam String name, @RequestParam("age") int a, Model model) {
		System.out.println("傈价 规侥 : " + "POST");
		System.out.println("NAME : " + name);
		System.out.println("AGE : " + a);
		
		model.addAttribute("method", "POST");
		model.addAttribute("name", name);
		model.addAttribute("age", a);
		
		return "get_post/result";
	}
	
	@PostMapping("dto")
	public String dto(MyDTO dto, Model model) {
		System.out.println(dto.getName());
		System.out.println(dto.getAge());
		System.out.println(dto.getAddr());
		
		model.addAttribute("dto", dto);
		
		return "get_post/dto";
	}
}
