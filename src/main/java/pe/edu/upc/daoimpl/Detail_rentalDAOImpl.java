package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.edu.upc.daointerface.Detail_rentalDAO;
import pe.edu.upc.entity.Detail_rental;

public class Detail_rentalDAOImpl implements Detail_rentalDAO, Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "FinalLifeway")
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Detail_rental> listar() {
		List<Detail_rental> lista = new ArrayList<Detail_rental>();
		try {
			Query q = em.createQuery("select i from Detail_rental i");
			lista = (List<Detail_rental>) q.getResultList();
		} catch (

		Exception e) {
			System.out.println("Error al listar los datos de Detalle de renta");
		}
		return lista;
	}

}
