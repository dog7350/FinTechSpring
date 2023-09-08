package com.care.root.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import com.care.root.dto.MemberDTO;

public interface MemberService {

	public int loginChk(String id, String pw, HttpSession se);
	
	public MemberDTO getOneUser(String id);
	
	public ArrayList<MemberDTO> getUser();
	
	public void register(MemberDTO dto);
	
	public void modify(MemberDTO dto);
	
	public void exit(String id);
	
}
