package com.simplilearn.springautowiring.bean;

public class Employee {

	private int id;
	private String name;
	private Department department;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public void display() {
		
		System.out.println("Id:" +id);
		System.out.println("Name: "+name);
		System.out.println("Employee Department Info" +department);
	}
	
}
