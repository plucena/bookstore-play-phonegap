package model.vo;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import model.dao.ProdutoDAO;

@NamedQuery(name="Carrinho.findById", query="SELECT c FROM Carrinho AS c WHERE c.email LIKE :email")

@Entity
public class Carrinho implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "user_fk")
	private String email;
	private float total;
	
	
	
	public float getTotal() {
		float total=0;
		for(Produto p: this.produtos)
			total += p.getPreco();
		
		return total;
	}


	public void setTotal(float total) {
		this.total = total;
	}

	@ManyToMany(fetch=FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinTable
	 (
	      name="CARRINHO_PRODUTO",
	      joinColumns={ @JoinColumn(name="Email", referencedColumnName="Email") }
	  )
	List<Produto> produtos = new LinkedList<Produto>();

	public Carrinho() {}
	
	
	public Carrinho(String userEmail){
		this.email = userEmail;
	}

	public void addProduto(Produto b) throws Exception{
		
		this.produtos.add(b);
	}
	
	public void removeProduto(Produto b) throws Exception{
		List<Produto> produtoslimpos = new LinkedList<Produto>();
	    for(Produto p: this.produtos)
	    	if(!p.getId().equals(b.getId()))
	    		produtoslimpos.add(p);
	    
	    this.produtos = produtoslimpos;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String userEmail) {
		this.email = userEmail;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	

}
