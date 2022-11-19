package com.SpringHibernateLab1.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.SpringHibernateLab1.dao.BookDao;
import com.SpringHibernateLab1.entity.BookEntity;

public class BookImp implements BookDao {
	private HibernateTemplate ht;

	@Transactional
	// To insert record of Book
	public int insertBookEntity(BookEntity bk) {
		ht.save(bk);
		return 1;
	}

	@Transactional
	// To update record of Book
	public int updateBookEntity(BookEntity bk) {
		ht.update(bk);
		return 1;
	}

	@Transactional
	// To Delete record of Book
	public int deleteBookEntity(BookEntity bk) {
		ht.delete(bk);
		return 1;
	}

	// To get specific record
	public BookEntity getBookEntity(int id) {

		BookEntity bk = ht.get(BookEntity.class, id);
		return bk;
	}

	// To get all records
	public List<BookEntity> getAllBookEntitys() {
		List<BookEntity> bkList = ht.loadAll(BookEntity.class);
		return bkList;
	}

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

}
