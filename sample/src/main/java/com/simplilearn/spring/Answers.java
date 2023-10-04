package com.simplilearn.spring;

import java.util.Date;

public class Answers {

	
	private int id;
	private String answer;
	private Date postedDate;
	
	
	public Answers() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Answers(int id, String answer, Date postedDate) {
		super();
		this.id = id;
		this.answer = answer;
		this.postedDate = postedDate;
	}


	@Override
	public String toString() {
		return "Answers [id=" + id + ", answer=" + answer + ", postedDate=" + postedDate + "]";
	}
	
	
	
	
}
