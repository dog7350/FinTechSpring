package com.care.root;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cookie")
public class CookieController {
	@Autowired(required = false) // ��ϵ� Bean�� ������ Null������ ó��
	TestClass tc;
	
	@GetMapping("index")
	public String index(HttpServletResponse res) {
		System.out.println(tc);
		
		Cookie cookie = new Cookie("key", "value");
		cookie.setMaxAge(5);;
		res.addCookie(cookie);
		
		return "cookie/index";
	}
	
	@GetMapping("result")
	public void result (HttpServletRequest req) {
		Cookie[] arr = req.getCookies();
		for (Cookie c : arr) {
			System.out.println("name : " + c.getName());
			System.out.println("value : " + c.getValue() + "\n\n");
		}
	}
	
	@GetMapping("result02")
	public void result02 (@CookieValue(value = "key", required = false) Cookie cook) { // ��Ű ���� ������ NULL ó��
		System.out.println("Cook : " + cook);
		
		if (cook != null) {
			System.out.println(cook.getName());
			System.out.println(cook.getValue());
		}
	}
}
