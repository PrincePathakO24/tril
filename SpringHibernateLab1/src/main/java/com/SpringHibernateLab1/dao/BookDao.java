package com.SpringHibernateLab1.dao;

import java.util.List;

import com.SpringHibernateLab1.entity.BookEntity;

public interface BookDao 
{

	public int insertBookEntity(BookEntity bk);

	public int updateBookEntity(BookEntity bk);

	public int deleteBookEntity(BookEntity bk);

	public BookEntity getBookEntity(int id);

	public List<BookEntity> getAllBookEntitys();
}
