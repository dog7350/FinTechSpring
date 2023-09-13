package com.care.root.service;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.care.root.dto.FileDTO;
import com.care.root.mybatis.FileMapper;

@Service
public class FileServiceImpl implements FileService {
	@Autowired FileMapper mapper;
	
	public void fileProcess(String id, String name, MultipartFile file) {
		FileDTO dto = new FileDTO();
		dto.setId(id);
		dto.setName(name);
		
		if (file.getSize() != 0) { // !file.isEmpty()
			SimpleDateFormat fo = new SimpleDateFormat("yyyyMMddHHmmss-");
			String sysFileName = fo.format(new Date());
			sysFileName += file.getOriginalFilename();
			
			File saveFile = new File(IMAGE_REPO + "/" + sysFileName);
			
			try {
				file.transferTo(saveFile);
				dto.setImgName(sysFileName);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			dto.setImgName("nan");
		}
		
		try {
			mapper.saveData(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<FileDTO> getData() {
		List<FileDTO> list = null;
		try {
			list = mapper.getData();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public void delete(String file, String id) {
		try {
			int result = mapper.delete(id);
			if (result == 1) {
				File d = new File(IMAGE_REPO + "/" + file);
				
				System.out.println("d Exists : " + d.exists());
				if (d.exists()) d.delete();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public FileDTO getContent(String id, String file) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("file", file);
		
		File d = new File(IMAGE_REPO + "/" + file);
		d.delete();
		
		return mapper.getContent(map);
	}
	
	public void fileModify(String id, String name, String wid, MultipartFile file) {
		FileDTO dto = new FileDTO();
		dto.setId(id);
		dto.setName(name);
		
		if (file.getSize() != 0) { // !file.isEmpty()
			SimpleDateFormat fo = new SimpleDateFormat("yyyyMMddHHmmss-");
			String sysFileName = fo.format(new Date());
			sysFileName += file.getOriginalFilename();
			
			File saveFile = new File(IMAGE_REPO + "/" + sysFileName);
			
			try {
				file.transferTo(saveFile);
				dto.setImgName(sysFileName);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			dto.setImgName("nan");
		}
		
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("dto", dto);
			map.put("wid", wid);
			mapper.modifyData(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
