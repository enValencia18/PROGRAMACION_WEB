package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.BikeDAO;
import pe.edu.upc.entity.Bike;

public class BikeDAOImpl implements BikeDAO, Serializable {

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "FinalLifeway")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Bike bik) {
		try {
			em.persist(bik);
		} catch (Exception e) {
			System.out.println("Error al insertar registro de Bicicleta");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Bike> listar() {
		List<Bike> lista = new ArrayList<Bike>();
		try {
			Query q = em.createQuery("select i from Bike i");
			lista = (List<Bike>) q.getResultList();
		} catch (

		Exception e) {
			System.out.println("Error al listar los datos de Bicicleta");
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int idBike) {
		Bike b = new Bike();
		try {
			b = em.getReference(Bike.class, idBike);
			em.remove(b);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Transactional
	@Override
	public void modificar(Bike b) {
		try {
			em.merge(b);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
