package model.vo;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the Book database table.
 * 
 */
@Entity


public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;


    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nome;
	
	private float preco;

	@Lob 
	@Column(name="DECRICAO", length=5000)
	private String descricao;

	private String foto;
	
	private String arquivo;
	
	
	public Produto() {
	}

    public Long getId() {
		return this.id;
	}
    

	public void setId(Long id) {
		this.id = id;
	}

	
	
	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Produto(String nome, float preco, String descricao,
			String foto, String arquivo) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.foto = foto;
	}

	
	
}