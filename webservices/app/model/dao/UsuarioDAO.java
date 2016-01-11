package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import entity.Produto;
import entity.Usuario;

@Stateless
public class UsuarioDAO {
	
	@PersistenceContext(unitName = "livraria")
    private EntityManager entityManager;

    public void addUsuario(Usuario user) throws Exception {
        entityManager.merge(user);
    }

    public void deleteUsario(Usuario user) throws Exception {
        entityManager.remove(user);
    }

    public List<Usuario> getUsuarios() throws Exception {

        CriteriaQuery<Usuario> cq = entityManager.getCriteriaBuilder().createQuery(Usuario.class);
        cq.select(cq.from(Usuario.class));
        return entityManager.createQuery(cq).getResultList();
    }


}
