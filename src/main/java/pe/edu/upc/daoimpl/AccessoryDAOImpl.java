package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.AccessoryDAO;
import pe.edu.upc.entity.Accessory;

public class AccessoryDAOImpl implements AccessoryDAO, Serializable {

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "FinalLifeway")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Accessory acc) {
		try {
			em.persist(acc);
		} catch (Exception e) {
			System.out.println("Error al insertar registro de Accesorios");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Accessory> listar() {
		List<Accessory> lista = new ArrayList<Accessory>();
		try {
			Query q = em.createQuery("select i from Accessory i");
			lista = (List<Accessory>) q.getResultList();
		} catch (

		Exception e) {
			System.out.println("Error al listar los datos de Accesorios");
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int idAccessory) {
		Accessory a = new Accessory();
		try {
			a = em.getReference(Accessory.class, idAccessory);
			em.remove(a);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void modificar(Accessory a) {
		try {
			em.merge(a);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
