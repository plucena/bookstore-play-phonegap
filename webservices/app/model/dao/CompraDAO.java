package model.dao;

import java.util.LinkedList;
import java.util.List;
import model.vo.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.TypedQuery;

    

public class CompraDAO extends BaseDAO<Compra> {

    private EntityManager entityManager;

    public CompraDAO(){
        super(Compra.class);
    }

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
