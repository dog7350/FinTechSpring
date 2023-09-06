package com.care.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("red")
public class LoginController {
	public LoginController() {
		System.out.println("LoginController");
	}
	
	@GetMapping("index")
	public String index() {
		return "test/index";
	}
	
	@PostMapping("login_chk")
	public String loginChk(@RequestParam String id, @RequestParam String pwd, RedirectAttributes ra) {
		System.out.println("ID : " + id);
		System.out.println("PW : " + pwd);
		
		String DBId = "1", DBPwd = "1";
		if (id.equals(DBId) && pwd.equals(DBPwd)) {
			// return "redirect:main";
			// return "redirect:main01?id=" + id;
			
			// ra.addAttribute("id", id); // 다음 Redirect까지 '값'을 전송
			// return "redirect:main02";
			
			TestDTO dto = new TestDTO();
			dto.setId("aaa");
			dto.setPwd("111");
			dto.setName("홍길동");
			ra.addFlashAttribute(dto); // '객체'를 전달
			return "redirect:main03";
		}
		
		return "redirect:/red/index";
	}
	
	@GetMapping("main03")
	public String main03(TestDTO dto) {
		System.out.println("=== 로그인 성공!!! ==> " + dto);
		return null;
	}
	@GetMapping("main02")
	public String main02(@RequestParam String id) {
		System.out.println("=== 로그인 성공!!! ==> " + id);
		return null;
	}
	@GetMapping("main01")
	public String main01(@RequestParam String id) {
		System.out.println("=== 로그인 성공!!! ==> " + id);
		return null;
	}
	@GetMapping("main")
	public String main() {
		System.out.println("=== 로그인 성공!!! ===");
		return null;
	}
}
