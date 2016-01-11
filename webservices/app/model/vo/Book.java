package model.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {

	@Id
	public String id;
	public String author;
	public String collection;
	public String other;
	public String title;
	public String reader;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCollection() {
		return collection;
	}
	public void setCollection(String collection) {
		this.collection = collection;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReader() {
		return reader;
	}
	public void setReader(String reader) {
		this.reader = reader;
	}


	
}
