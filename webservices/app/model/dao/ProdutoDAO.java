package model.dao;

import java.util.LinkedList;
import java.util.List;

import model.vo.*;
import com.avaje.ebean.Ebean;



public class ProdutoDAO  extends BaseDAO<Produto>{


	 public ProdutoDAO(){
	 	super(Produto.class);
	 }

	
	 
	 public Produto findProduto(Long id) throws Exception {
	           return Ebean.find(Produto.class, id);  
	  }
	 
	 public List<Produto> cloneProduto(List<Produto> books) throws Exception {
		 List<Produto> temp = new LinkedList<Produto>();
		 
		 for(Produto b: books) {
			 Produto b1 = this.findProduto(b.getId());
			temp.add(b1);
		 }
		 return temp;
	 }
	 
		    
	    

}	
