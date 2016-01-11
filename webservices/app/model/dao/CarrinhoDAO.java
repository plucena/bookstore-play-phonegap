package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import model.vo.*;



public class CarrinhoDAO extends BaseDAO<Carrinho> {

	 private EntityManager entityManager;

	  public CarrinhoDAO(){
	  	  super(Carrinho.class);
	  }

	   public Carrinho find(String user){
		   return null;
	   }
	 
	    public void saveCarrinho(Carrinho c) throws Exception {
	    	try {
	            //entityManager.getTransaction().begin();
	    		entityManager.merge(c);
	    		//entityManager.getTransaction().commit();
	    	}
	    	catch(Exception e){
	    		e.printStackTrace();
	    	}
	    }
	    
	    public void saveForceCarrinho(Carrinho c) throws Exception {
	    	try {
	            //entityManager.getTransaction().begin();
	    		entityManager.persist(c);
	    		//entityManager.getTransaction().commit();
	    	}
	    	catch(Exception e){
	    		e.printStackTrace();
	    	}
	    }


	    public Carrinho recuperaCarrinho(String email) throws Exception {
	        try {
	    	 javax.persistence.TypedQuery<Carrinho> query = entityManager.createQuery(
	    		        "SELECT c FROM Carrinho c WHERE c.email = :email", Carrinho.class);
	    		    return query.setParameter("email", email).getSingleResult();
	        }
	        catch(Exception e) {}
	        return new Carrinho(email);
	    	
	    }

   
	
}
