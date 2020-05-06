package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.edu.upc.daointerface.Rental_statusDAO;
import pe.edu.upc.entity.Rental_status;

public class Rental_statusDAOImpl implements Rental_statusDAO, Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "FinalLifeway")
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Rental_status> listar() {
		List<Rental_status> lista = new ArrayList<Rental_status>();
		try {
			Query q = em.createQuery("select i from Rental_Status i");
			lista = (List<Rental_status>) q.getResultList();
		} catch (

		Exception e) {
			System.out.println("Error al listar los datos de estado de renta");
		}
		return lista;
	}

}
