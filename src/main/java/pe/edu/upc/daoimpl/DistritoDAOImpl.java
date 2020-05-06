package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.DistritoDAO;
import pe.edu.upc.entity.Distrito;

public class DistritoDAOImpl implements DistritoDAO, Serializable {

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "FinalLifeway")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Distrito dis) {
		try {
			em.persist(dis);
		} catch (Exception e) {
			System.out.println("Error al insertar registro de Distrito");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Distrito> listar() {
		List<Distrito> lista = new ArrayList<Distrito>();
		try {
			Query q = em.createQuery("select i from Distrito i");
			lista = (List<Distrito>) q.getResultList();
		} catch (

		Exception e) {
			System.out.println("Error al listar los datos de Distrito");
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int idDistrito) {
		Distrito d = new Distrito();
		try {
			d = em.getReference(Distrito.class, idDistrito);
			em.remove(d);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Transactional
	@Override
	public void modificar(Distrito d) {
		try {
			em.merge(d);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
