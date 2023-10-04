package com.simplilearn.spring;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	
	private int id;
	private String name;
	private Map<Answers,User> answers;
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int id, String name, Map<Answers, User> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void display() {
		
		System.out.println("ID" +id);
		System.out.println("Name "+ name);
		System.out.println("Answers Info");
		Set<Entry<Answers,User>> entrySet = answers.entrySet();
		Iterator<Entry<Answers,User>> itr = entrySet.iterator();
		
		while(itr.hasNext()) {
			Entry<Answers,User> entry = itr.next();
			System.out.println("Answer: " + entry.getKey());
			System.out.println("Posted by: " + entry.getValue());
		}
		
	}
	
	
}
