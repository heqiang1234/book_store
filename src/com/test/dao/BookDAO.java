package com.test.dao;
import java.util.List;

import com.test.bean.Book;

public interface BookDAO {
	

		public void saveBook(Book book);
		
		public List<Book> findAllBooks();
		
		public void removeBook(Book book);
		
		public void updateBook(Book book);
		
		public Book findBookById(Integer id);
		
		
}
