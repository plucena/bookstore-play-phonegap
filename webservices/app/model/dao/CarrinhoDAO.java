package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import com.avaje.ebean.Ebean;

import model.vo.*;



public class CarrinhoDAO extends BaseDAO<Carrinho> {

	 private EntityManager entityManager;

	  public CarrinhoDAO(){
	  	  super(Carrinho.class);
	  }

	   public Carrinho find(String user){
		   return null;
	   }
	 
	   public Carrinho findCarrinho(String email) throws Exception {
	        return Ebean.find(Carrinho.class, email);  
	    }

   
	
}
