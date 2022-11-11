package com.hibernate.SpringLab1;

import java.util.List;

public class Student 
{
	private String s_id;
	private String s_name;
	private List <Book> b_list;
	private Address address;
	
	//constructor with field
	public Student(String s_id, String s_name, List<Book> b_list, Address address) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.b_list = b_list;
		this.address = address;
	}
	
	//constructor from Super Class 
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getS_id() {
		return s_id;
	}
	public void setS_id(String s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public List<Book> getB_list() {
		return b_list;
	}
	public void setB_list(List<Book> b_list) {
		this.b_list = b_list;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", b_list=" + b_list + ", address=" + address + "]";
	}
	
	
	
	
	
}
