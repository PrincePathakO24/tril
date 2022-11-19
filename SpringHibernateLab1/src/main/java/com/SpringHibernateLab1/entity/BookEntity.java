package com.SpringHibernateLab1.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookEntity
{
	@Id
	private int book_id;
	private String book_name;
	private String Author;
	private int price;
	
	public BookEntity(int book_id, String book_name, String author, int price) 
	{
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		Author = author;
		this.price = price;
	}

	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookEntity [book_id=" + book_id + ", book_name=" + book_name + ", Author=" + Author + ", price=" + price
				+ "]";
	}
	
	
	
	
	
	
}
