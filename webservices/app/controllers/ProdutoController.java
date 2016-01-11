package controllers;

import java.util.List;

import model.dao.ProdutoDAO;
import model.vo.Produto;
import com.fasterxml.jackson.databind.JsonNode;

import play.mvc.*;

public class ProdutoController extends Controller {

    public static Result getProdutos() throws Exception {
    	JsonNode response = JsonObjectParser.Serialize(new ProdutoDAO().selectAll());
    	System.out.println(response);
        return ok(response);
    }

    public static Result getProduto(Long id) throws Exception {
    	JsonNode response = JsonObjectParser.Serialize(new ProdutoDAO().findProduto(id));
    	System.out.println(response);
        return ok(response);
    }
    
    
    public static Result saveProduto() throws Exception {
    	System.out.println("PRODUTO:" + request().body());
    	JsonNode json  =  request().body().asJson();
    	Produto p =  JsonObjectParser.Deserialize(json, Produto.class);
    	new ProdutoDAO().create(p);
		return ok("saved");
    } 	
    
    
   
    
}
