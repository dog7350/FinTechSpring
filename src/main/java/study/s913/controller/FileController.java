package com.care.root.controller;

import java.io.File;
import java.io.FileInputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.care.root.service.FileService;

@Controller
@RequestMapping("file")
public class FileController {
	@Autowired FileService fs;
	
	@GetMapping("form")
	public String form() { return "file/uploadForm"; }
	
	@GetMapping("views")
	public String views(Model model) {
		model.addAttribute("list", fs.getData());
		return "file/result";
	}
	
	@PostMapping("upload1")
	public String upload1(@RequestParam String id, @RequestParam String name, @RequestParam MultipartFile file) {
		System.out.println("ID : " + id);
		System.out.println("NAME : " + name);
		System.out.println("FILE : " + file.getOriginalFilename());
		
		fs.fileProcess(id, name, file);
		
		return "redirect:form";
	}

	@PostMapping("upload2")
	public String upload2(MultipartHttpServletRequest mt) {
		System.out.println("MT ID : " + mt.getParameter("id"));
		System.out.println("MT NAME : " + mt.getParameter("name"));
		MultipartFile file = mt.getFile("file");
		System.out.println("MT FILE : " + file.getOriginalFilename());

		return "redirect:form";
	}
	
	@GetMapping("download")
	public void download(@RequestParam String file, HttpServletResponse res) throws Exception {
		res.addHeader("Content-disposition", "attachment; fileName=" + file);
		File f = new File(FileService.IMAGE_REPO + "/" + file);
		FileInputStream in = new FileInputStream(f);
		FileCopyUtils.copy(in, res.getOutputStream());
		in.close();
	}
	
	@GetMapping("delete")
	public String delete(@RequestParam String file, @RequestParam String id) {
		fs.delete(file, id);
		
		return "redirect:views";
	}
	
	@GetMapping("modify_view")
	public String modify_view(@RequestParam String file, @RequestParam String id, Model model) {
		model.addAttribute("wid", id);
		model.addAttribute("content", fs.getContent(id, file));
		
		return "file/modify_view";
	}
	
	@PostMapping("modify")
	public String modify(@RequestParam String id, @RequestParam String name, @RequestParam String wid, MultipartFile file) {
		fs.fileModify(id, name, wid, file);
		
		return "redirect:views";
	}
}
