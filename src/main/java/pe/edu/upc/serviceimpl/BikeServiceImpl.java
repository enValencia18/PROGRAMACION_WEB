package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.daointerface.BikeDAO;
import pe.edu.upc.entity.Bike;
import pe.edu.upc.serviceinterface.IBike;

@Named
@RequestScoped
public class BikeServiceImpl implements Serializable, IBike {

	private static final long serialVersionUID = 1L;
	private BikeDAO BD;

	@Override
	public void insert(Bike bik) {
		try {
			BD.insert(bik);
		} catch (Exception e) {
			System.out.println("Error en el service al insertar una bicicleta");
		}
		// TODO Auto-generated method stub

	}

	@Override
	public List<Bike> listar() {
		// TODO Auto-generated method stub
		return BD.listar();
	}

	@Override
	public void delete(int idBike) {
		BD.delete(idBike);

	}

	@Override
	public void modificar(Bike b) {
		BD.modificar(b);

	}

}
