package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Product;

public interface IProduct {
 
	public void insert(Product pro);
	public List<Product>listar();
	public void delete(int idProduct);
	public void modificar(Product p);
}
