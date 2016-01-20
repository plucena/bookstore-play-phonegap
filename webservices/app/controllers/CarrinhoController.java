package controllers;

import java.util.List;

import model.dao.*;
import model.vo.*;
import com.fasterxml.jackson.databind.JsonNode;

import play.mvc.*;

public class CarrinhoController extends Application {

    

    public static Result getCarrinho(String email) throws Exception {
    	JsonNode response = JsonObjectParser.Serialize(new CarrinhoDAO().findCarrinho(email));
    	System.out.println(response);
        return ok(response);
    }
    
    public static Result addCarrinho(String email, Long productid) throws Exception {
    	CarrinhoDAO cDAO = new CarrinhoDAO();
    	Carrinho c = cDAO.findCarrinho(email);
    	if(c==null){
    		c = new Carrinho();
    		c.setEmail(email);
    	}	
    	Produto p = new ProdutoDAO().findProduto(productid);
    	if(p!=null) {
    		c.addProduto(p);
    		cDAO.create(c);
    	}	
    	return ok("ok");
    }
    
    public static Result removeFromCart(String email, Long productid) throws Exception {
    	CarrinhoDAO cDAO = new CarrinhoDAO();
    	Carrinho c = cDAO.findCarrinho(email);
    	ProdutoDAO pDAO = new ProdutoDAO();
    	Produto p = pDAO.findProduto(productid);
    	if(p!=null) {
    		for(Produto prod: c.getProdutos())
    			if(prod.getId()==p.getId())
    				 c.removeProduto(prod);
    			
    		cDAO.create(c);
    	}	

        return ok("ok");
    }
    
   
    
}
