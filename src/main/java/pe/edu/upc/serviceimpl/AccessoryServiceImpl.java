package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.daointerface.AccessoryDAO;
import pe.edu.upc.entity.Accessory;
import pe.edu.upc.serviceinterface.IAccessory;

@Named
@RequestScoped
public class AccessoryServiceImpl implements Serializable, IAccessory {

	private static final long serialVersionUID = 1L;
	private AccessoryDAO AD;

	@Override
	public void insert(Accessory acc) {
		try {
			AD.insert(acc);
		} catch (Exception e) {
			System.out.println("Error en el service al insertar un accesorio");
		}
		// TODO Auto-generated method stub

	}

	@Override
	public List<Accessory> listar() {
		// TODO Auto-generated method stub
		return AD.listar();
	}

	@Override
	public void delete(int idAccessory) {
		// TODO Auto-generated method stub
		AD.delete(idAccessory);
	}

	@Override
	public void modificar(Accessory a) {
		AD.modificar(a);

	}

}
