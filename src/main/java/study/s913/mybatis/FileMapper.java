package com.care.root.mybatis;

import java.util.List;
import java.util.Map;

import com.care.root.dto.FileDTO;

public interface FileMapper {
	public void saveData(FileDTO dto);
	
	public List<FileDTO> getData();
	
	public int delete(String id);
	
	public FileDTO getContent(Map<String, Object> map);
	
	public void modifyData(Map<String, Object> map);
}
