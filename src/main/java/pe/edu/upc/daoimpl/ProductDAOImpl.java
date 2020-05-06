package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.ProductDAO;
import pe.edu.upc.entity.Product;

public class ProductDAOImpl implements ProductDAO, Serializable {

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "FinalLifeway")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Product pro) {
		try {
			em.persist(pro);
		} catch (Exception e) {
			System.out.println("Error al insertar registro de Producto");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> listar() {
		List<Product> lista = new ArrayList<Product>();
		try {
			Query q = em.createQuery("select i from Product i");
			lista = (List<Product>) q.getResultList();
		} catch (

		Exception e) {
			System.out.println("Error al listar los datos de Producto");
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int idProduct) {
		Product p = new Product();
		try {
			p = em.getReference(Product.class, idProduct);
			em.remove(p);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Transactional
	@Override
	public void modificar(Product p) {
		try {
			em.merge(p);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
