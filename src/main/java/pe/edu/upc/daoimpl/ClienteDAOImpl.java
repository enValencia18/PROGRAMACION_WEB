package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.ClienteDAO;
import pe.edu.upc.entity.Cliente;


public class ClienteDAOImpl implements ClienteDAO, Serializable {

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "FinalLifeway")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Cliente c) {
		try {
			em.persist(c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
			
	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> listar() {
		List<Cliente> lista = new ArrayList<Cliente>();
		try {
			Query q = em.createQuery("select i from Cliente i");
			lista = (List<Cliente>) q.getResultList();
		} catch (

		Exception e) {
			System.out.println("Error al listar los datos de Cliente");
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int idCliente) {
		Cliente c = new Cliente();
		try {
			c = em.getReference(Cliente.class, idCliente);
			em.remove(c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> findByNameCliente(Cliente c) {
		List<Cliente> lista = new ArrayList<Cliente>();
		try {
			Query q = em.createQuery("from Cliente i where i.NCliente like ?1");
			q.setParameter(1, "%" + c.getNCliente() + "%");
			lista = (List<Cliente>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

	

	
	

	@Transactional
	@Override
	public void modificar(Cliente c) {
		try {
			em.merge(c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
