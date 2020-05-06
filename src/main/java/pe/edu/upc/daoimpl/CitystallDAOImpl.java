package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.CitystallDAO;
import pe.edu.upc.entity.Citystall;

public class CitystallDAOImpl implements CitystallDAO, Serializable {
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "FinalLifeway")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Citystall st) {
		try {
			em.persist(st);
		} catch (Exception e) {
			System.out.println("Error al insertar registro de sucursal");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Citystall> listar() {
		List<Citystall> lista = new ArrayList<Citystall>();
		try {
			Query q = em.createQuery("select i from Citystall i");
			lista = (List<Citystall>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar los datos de sucursal");
		}
		return lista;
	}

	@Override
	public void delete(int idCitystall) {
		Citystall c = new Citystall();
		try {
			c = em.getReference(Citystall.class, idCitystall);
			em.remove(c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void modificar(Citystall c) {
		try {
			em.merge(c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
