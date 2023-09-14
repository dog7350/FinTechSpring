package com.care.root.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.care.root.dto.FileDTO;

public interface FileService {
	public String IMAGE_REPO = "D:\\Work\\Coding\\STS\\image_repot";
	
	public void fileProcess(String id, String name, MultipartFile file);
	
	public List<FileDTO> getData();
	
	public void delete(String file, String id);
	
	public FileDTO getContent(String id, String file);
	
	public void fileModify(String id, String name, String wid, MultipartFile file);
}
