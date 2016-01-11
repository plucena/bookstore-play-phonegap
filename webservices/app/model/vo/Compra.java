package model.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;

@Entity
@NamedQuery(name="Compra.findById", query="SELECT p FROM Purchase p")

public class Compra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COMPRA_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String status="Aguardando Pagamento";
	private Date data;
	private String usaurio;
	private float total;
	
		
	
	public float getTotal() {
		for(Produto p: this.produtos)
			total += p.getPreco();
		return total;
	}

	public void setTotal(float total) {
		total = total;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	
	@ManyToMany(fetch=FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinTable
	 (
	      name="COMPRA_PRODUTOS",
	      joinColumns={ @JoinColumn(name="COMPRA_ID", referencedColumnName="COMPRA_ID") }
	  )
	List<Produto> produtos = new LinkedList<Produto>();
    
    
    public void addProduct(Produto b) {
    	this.produtos.add(b);
    }
    
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> books) {
		this.produtos = books;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public Compra(){
		this.data = new Date();
	}
	
	
	
	public String getUsuario() {
		return usaurio;
	}
	
	public void setUsuario(String user) {
		this.usaurio = user;
	}
	
	
}
