package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Citystall;

public interface ICitystall {

	public void insert(Citystall cs);
	public List<Citystall>listar();
	public void delete(int idCitystall);
	public void modificar(Citystall c);
}
