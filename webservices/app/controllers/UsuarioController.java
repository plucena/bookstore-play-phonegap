package controllers;

import java.util.List;

import model.dao.*;
import model.vo.*;
import com.fasterxml.jackson.databind.JsonNode;

import play.mvc.*;

public class UsuarioController extends Application {

    public static Result getUsuarios() throws Exception {
    	JsonNode response = JsonObjectParser.Serialize(new UsuarioDAO().selectAll());
    	System.out.println(response);
        return ok(response);
    }

    public static Result getUsuario(String email) throws Exception {
    	JsonNode response = JsonObjectParser.Serialize(new UsuarioDAO().findUsuario(email));
    	System.out.println(response);
        return ok(response);
    }
    
    
    public static Result saveUsuario() throws Exception {
    	System.out.println("USUARIO:" + request().body());
    	JsonNode json  =  request().body().asJson();
    	Usuario u =  JsonObjectParser.Deserialize(json, Usuario.class);
    	new UsuarioDAO().create(u);
		return ok("saved");
    } 	
    
    
   
    
}
