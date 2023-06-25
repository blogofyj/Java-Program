package org.student.entity;

public class Student {
	
	private int sno;
	private String name;
	private Address address;
	
	
	public Student() {
	}


	public Student(int sno, String name, Address address) {
		this.sno = sno;
		this.name = name;
		this.address = address;
	}


	public int getSno() {
		return sno;
	}


	public void setSno(int sno) {
		this.sno = sno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}
	
	
}
