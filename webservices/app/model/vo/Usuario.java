package model.vo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity()
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String email;
	private String senha;
	private String endereco;
	private String  telefone;
	
	public Usuario(){
		
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String password) {
		this.senha = password;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String address) {
		this.endereco = address;
	}


	public Usuario(String email, String senha, String endereco, String telefone) {
		super();
		this.email = email;
		this.senha = senha;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	
	

}
