package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Rental;

public interface IRental {

	public void insert(Rental ren);
	public List<Rental>listar();
	public void delete(int idRental);
	public void modificar(Rental r);
}
