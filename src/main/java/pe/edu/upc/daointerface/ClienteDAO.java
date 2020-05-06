package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Cliente;

public interface ClienteDAO {
	
	public void insert(Cliente c);
	public List<Cliente> listar();
	public void delete(int idCliente);
	public List<Cliente> findByNameCliente(Cliente c);
	public void modificar(Cliente c);

}
