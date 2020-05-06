package pe.edu.upc.serviceinterface;

import java.util.List;
import pe.edu.upc.entity.Distrito;

public interface IDistrito {

	public void insert(Distrito dis);
	public List<Distrito>listar();
	public void delete(int idDistrito);
	public void modificar(Distrito d);
}
