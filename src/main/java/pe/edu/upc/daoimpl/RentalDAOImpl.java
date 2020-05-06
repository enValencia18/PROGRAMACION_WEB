package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.RentalDAO;
import pe.edu.upc.entity.Rental;

public class RentalDAOImpl implements RentalDAO, Serializable {

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "FinalLifeway")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Rental ren) {
		try {
			em.persist(ren);
		} catch (Exception e) {
			System.out.println("Error al insertar registro de Alquiler");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Rental> listar() {
		List<Rental> lista = new ArrayList<Rental>();
		try {
			Query q = em.createQuery("select i from Rental i");
			lista = (List<Rental>) q.getResultList();
		} catch (

		Exception e) {
			System.out.println("Error al listar los datos de Alquiler");
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int idRental) {
		Rental r = new Rental();
		try {
			r = em.getReference(Rental.class, idRental);
			em.remove(r);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Transactional
	@Override
	public void modificar(Rental r) {
		try {
			em.merge(r);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
