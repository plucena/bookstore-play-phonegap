package dao;

import java.util.LinkedList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.TypedQuery;

import entity.Carrinho;
import entity.Compra;

@Stateless
public class CompraDAO {

	@PersistenceContext(unitName = "livraria")
    private EntityManager entityManager;

    public void addCompra(Compra buy) throws Exception {
    	try {
    		entityManager.merge(buy);
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    }

    public void deleteCompra(Compra buy) throws Exception {
        entityManager.remove(buy);
    }

    public List<Compra> getCompras(String usaurio) throws Exception {
    try {	
    	javax.persistence.TypedQuery<Compra> query = entityManager.createQuery(
		        "SELECT c FROM Compra c WHERE c.usaurio = :usaurio", Compra.class);
		    return query.setParameter("usaurio", usaurio).getResultList();
    }
    catch(Exception e) {}
    	return new LinkedList<Compra>();
       
    }

    public Compra find(Long id) {
    	return entityManager.find(Compra.class, id);
    }
	
	
}
