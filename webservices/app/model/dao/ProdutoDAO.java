package model.dao;

import java.util.LinkedList;
import java.util.List;
import model.vo.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;



public class ProdutoDAO  extends BaseDAO<Produto>{

	 EntityManager entityManager;

	 public ProdutoDAO(){
	 	super(Produto.class);
	 }

	
	 
	 public Produto findProduto(Long id) throws Exception {
	           return entityManager.find(Produto.class, id);
	  }
	 
	 public List<Produto> cloneProduto(List<Produto> books) throws Exception {
		 List<Produto> temp = new LinkedList<Produto>();
		 
		 for(Produto b: books) {
			 Produto b1 = this.findProduto(b.getId());
			temp.add(b1);
		 }
		 return temp;
	 }
	 
	    public void addProduto(Produto book) throws Exception {
	        entityManager.merge(book);
	    }

	    public void deleteProduto(Produto book) throws Exception {
	        entityManager.remove(book);
	    }

	    
	    public List<Produto> getProdutos() throws Exception {
	    	System.out.print(entityManager == null);
            CriteriaQuery<Produto> cq = entityManager.getCriteriaBuilder().createQuery(Produto.class);
            cq.select(cq.from(Produto.class));
            return entityManager.createQuery(cq).getResultList();
	    }
	    
	    
	    

}	
