package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.ConditionDAO;
import pe.edu.upc.entity.Condition;

public class ConditionDAOImpl implements ConditionDAO, Serializable {

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "FinalLifeway")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Condition con) {
		try {
			em.persist(con);
		} catch (Exception e) {
			System.out.println("Error al insertar registro de Estado");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Condition> listar() {
		List<Condition> lista = new ArrayList<Condition>();
		try {
			Query q = em.createQuery("select i from Condition i");
			lista = (List<Condition>) q.getResultList();
		} catch (

		Exception e) {
			System.out.println("Error al listar los datos de Estado");
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int idCondition) {
		Condition c = new Condition();
		try {
			c = em.getReference(Condition.class, idCondition);
			em.remove(c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Transactional
	@Override
	public void modificar(Condition c) {
		try {
			em.merge(c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
