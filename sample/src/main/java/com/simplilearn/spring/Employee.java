package com.simplilearn.spring;

import java.util.Iterator;
import java.util.List;

public class Employee {
	
	
private int id;
private String name;
private List< Address> adress;

public Employee() {
	System.out.println("Defined Constructor");
}
public Employee(int id, String name, List<Address> adress) {
	super();
	this.id = id;
	this.name = name;
	this.adress = adress;
}

public void Empinfo() {
	
	System.out.println("Emp name" + name);
	System.out.println("Emp id" + id);
	System.out.println("Emp Adress" + adress);
	Iterator<Address> itr = adress.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
	
}

}
