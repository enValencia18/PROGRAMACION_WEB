package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Bike;

public interface IBike {

	public void insert(Bike bik);
	public List<Bike>listar();
	public void delete(int idBike);
	public void modificar(Bike b);
}
