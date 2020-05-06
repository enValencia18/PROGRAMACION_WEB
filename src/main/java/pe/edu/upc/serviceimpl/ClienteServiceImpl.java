package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.ClienteDAO;
import pe.edu.upc.entity.Cliente;
import pe.edu.upc.serviceinterface.ICliente;

@Named
@RequestScoped
public class ClienteServiceImpl implements Serializable, ICliente {
	
	private static final long serialVersionUID = 1L;
	@Inject
	private ClienteDAO CD;

	@Transactional
	@Override
	public void insert(Cliente cli) {
		CD.insert(cli);	
		}
		// TODO Auto-generated method stub

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return CD.listar();
	}

	@Override
	public void delete(int idCliente) {
		CD.delete(idCliente);

	}
	
	@Override
	public List<Cliente> findByNameCliente(Cliente c){
		// TODO Auto-generated method stub
		return CD.findByNameCliente(c);
	}
	

	@Override
	public void modificar(Cliente c) {
		CD.modificar(c);

	}
}
