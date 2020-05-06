package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Accessory;

public interface IAccessory {

	public void insert(Accessory acc);
	public List<Accessory>listar();
	public void delete(int idAccessory);
	public void modificar(Accessory a);
}