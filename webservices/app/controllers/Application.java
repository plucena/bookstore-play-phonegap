package controllers;

import java.util.List;

import model.dao.BookDAO;
import model.vo.Book;
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
        return ok("saved");
    }    
    
    public static Result saveBook() throws Exception {
    	System.out.println("BOOK:" + request().body());
    	JsonNode json  =  request().body().asJson();
    	Book b =  JsonObjectParser.Deserialize(json, Book.class);
    	new BookDAO().create(b);
		return ok("saved");
    } 	
    
    
    public static Result newBook() throws Exception {
    	return ok("ok");
    	//return ok();
    }
    
}
