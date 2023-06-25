package org.lanqiao.servlet;

public class Student {
	private String name;
	private int age;
	private int sno;
	
	public Student() {
		
	}
	
	public Student(String name, int age, int sno) {
		this.age = age;
		this.name = name;
		this.sno = sno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	
}
