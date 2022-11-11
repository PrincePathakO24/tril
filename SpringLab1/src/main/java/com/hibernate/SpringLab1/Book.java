package com.hibernate.SpringLab1;

public class Book 
{
	private String b_id;
	private String b_name;
	private String price;
	
	
	//constructor with field
	public Book(String b_id, String b_name, String price) 
	{
		super();
		this.b_id = b_id;
		this.b_name = b_name;
		this.price = price;
	}
	
	//constructor from Super Class 
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getB_id() {
		return b_id;
	}

	public void setB_id(String b_id) {
		this.b_id = b_id;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [b_id=" + b_id + ", b_name=" + b_name + ", price=" + price + "]";
	}
	
	
	
}
