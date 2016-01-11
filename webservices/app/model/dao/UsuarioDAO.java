package model.dao;

import java.util.List;

import model.vo.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import com.avaje.ebean.Ebean;


public class UsuarioDAO extends BaseDAO<Usuario>{
	
	
    public UsuarioDAO(){
        super(Usuario.class);
    }

    public Usuario findUsuario(String email) throws Exception {
        return Ebean.find(Usuario.class, email);  
    }

}
