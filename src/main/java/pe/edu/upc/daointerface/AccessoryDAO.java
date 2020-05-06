package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Accessory;

public interface AccessoryDAO {

	public void insert(Accessory acc);
	public List<Accessory> listar();
	public void delete(int idAccessory);
	public void modificar(Accessory a);
}
