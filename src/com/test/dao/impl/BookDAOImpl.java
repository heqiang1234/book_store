package com.test.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.bean.Book;
import com.test.dao.BookDAO;

public class BookDAOImpl extends HibernateDaoSupport implements BookDAO {
	
	 
	 private SessionFactory sessionFactory;
		public void saveBook(Book book) {
			// TODO Auto-generated method stub
			this.getHibernateTemplate().save(book);
		}

		@SuppressWarnings("unchecked")
		public List<Book> findAllBooks() {
			// TODO Auto-generated method stub
			String hql = "from Book book order by book.id desc";
			return (List<Book>) this.getHibernateTemplate().find(hql);
		}

		
		public void removeBook(Book book) {
			// TODO Auto-generated method stub
			this.getHibernateTemplate().delete(book);
		}
		

		  
		public void updateBook(Book book) {
			// TODO Auto-generated method stub
			this.getHibernateTemplate().update(book);
		}

		
		public Book findBookById(Integer id) {
			// TODO Auto-generated method stub
			Book book = (Book) this.getHibernateTemplate().get(Book.class, id);

			return book;
		}

	

}
