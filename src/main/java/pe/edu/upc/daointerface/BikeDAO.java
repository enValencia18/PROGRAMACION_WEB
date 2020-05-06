package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Bike;

public interface BikeDAO {

	public void insert(Bike bik);
	public List<Bike> listar();
	public void delete(int idBike);
	public void modificar(Bike b);
}
