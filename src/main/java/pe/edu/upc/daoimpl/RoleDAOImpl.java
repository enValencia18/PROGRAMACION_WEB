package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.RoleDAO;
import pe.edu.upc.entity.Role;

public class RoleDAOImpl implements RoleDAO, Serializable {

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "FinalLifeway")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Role ro) {
		try {
			em.persist(ro);
		} catch (Exception e) {
			System.out.println("Error al insertar registro de rol");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Role> listar() {
		List<Role> lista = new ArrayList<Role>();
		try {
			Query q = em.createQuery("select i from role i");
			lista = (List<Role>) q.getResultList();
		} catch (

		Exception e) {
			System.out.println("Error al listar los datos de rol");
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int idRole) {
		Role r = new Role();
		try {
			r = em.getReference(Role.class, idRole);
			em.remove(r);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Transactional
	@Override
	public void modificar(Role r) {
		try {
			em.merge(r);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
