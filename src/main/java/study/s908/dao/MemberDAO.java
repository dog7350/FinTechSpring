package com.care.root.dao;

import java.util.ArrayList;

import com.care.root.dto.MemberDTO;

public interface MemberDAO {
	public MemberDTO getOneUser(String id);
	
	public ArrayList<MemberDTO> getUser();
	
	public void register(MemberDTO dto);
	
	public void modify(MemberDTO dto);
	
	public void exit(String id);
}
