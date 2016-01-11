package controllers;

import java.util.List;

import model.dao.BookDAO;
import model.dao.EditoraDAO;
import model.vo.Book;
import model.vo.Editora;
import views.html.book;
import views.html.booknew;

import com.fasterxml.jackson.databind.JsonNode;

import play.mvc.*;

public class Application extends Controller {

    public static Result getBooks() throws Exception {
    	JsonNode response = JsonObjectParser.Serialize(new BookDAO().selectAll());
    	System.out.println(response);
        return ok(response);
    }

    public static Result getBook(String id) throws Exception {
    	JsonNode response = JsonObjectParser.Serialize(new BookDAO().findById(id));
    	System.out.println(response);
        return ok(response);
    }
    
    
    public static Result deleteBook(String id) throws Exception {
    	System.out.println("DELETE " + id);
    	Book b =  new BookDAO().findById(id);
    	new BookDAO().delete(b);
    	return play.mvc.Results.redirect("BookList");
    }    
    
    public static Result saveBook() throws Exception {
    	System.out.println("BOOK:" + request().body());
    	JsonNode json  =  request().body().asJson();
    	Book b =  JsonObjectParser.Deserialize(json, Book.class);
    	new BookDAO().create(b);
		return ok("saved");
    } 	
    
    public static Result showBooks() throws Exception {
    	List<Book> books  = new BookDAO().selectAll();
    	return ok(book.render(books));
    }
    
    public static Result newBook() throws Exception {
    	return ok(booknew.render());
    	//return ok();
    }
    
    public static Result getEditoras() throws Exception {
    	JsonNode response = JsonObjectParser.Serialize(new EditoraDAO().selectAll());
    	System.out.println(response);
        return ok(response);
    }
    
    public static Result saveEditora() throws Exception {
    	System.out.println("Editora:" + request().body());
    	JsonNode json  =  request().body().asJson();
    	Editora e =  JsonObjectParser.Deserialize(json, Editora.class);
    	new EditoraDAO().create(e);
		return ok("saved");
    }
    
    
}
