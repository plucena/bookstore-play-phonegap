package model.dao;

import java.util.List;
import com.avaje.ebean.Ebean;
import model.vo.Book;

public class BookDAO extends BaseDAO<Book> {
	
	public BookDAO() {
		super(Book.class);
	}

	public List<Book> selectByReader(String reader) throws Exception {
			return Ebean.find(Book.class).where().like("reader", reader).findList();
	}
	
	public Book findById(String id) {
		return Ebean.find(Book.class, id);  
	}
}