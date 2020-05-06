package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.StatusDAO;
import pe.edu.upc.entity.Status;

public class StatusDAOImpl implements StatusDAO, Serializable {

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "FinalLifeway")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Status st) {
		try {
			em.persist(st);
		} catch (Exception e) {
			System.out.println("Error al insertar registro de Status");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Status> listar() {
		List<Status> lista = new ArrayList<Status>();
		try {
			Query q = em.createQuery("select i from Status i");
			lista = (List<Status>) q.getResultList();
		} catch (

		Exception e) {
			System.out.println("Error al listar los datos de Status");
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int idStatus) {
		Status s = new Status();
		try {
			s = em.getReference(Status.class, idStatus);
			em.remove(s);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Transactional
	@Override
	public void modificar(Status s) {
		try {
			em.merge(s);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
