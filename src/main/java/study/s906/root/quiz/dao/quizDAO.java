package com.care.root.quiz.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.care.root.quiz.dto.quizDTO;

@Repository
public class quizDAO {
	private ArrayList<quizDTO> db;
	public quizDAO() { db = new ArrayList<quizDTO>(); }
	
	public ArrayList<quizDTO> getDB() { return db; }
	
	public int addDB(quizDTO dto) {
		db.add(dto);
		
		return 1;
	}
}
