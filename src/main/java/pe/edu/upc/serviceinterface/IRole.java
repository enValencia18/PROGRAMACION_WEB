package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Role;

public interface IRole {

	public void insert(Role rol);
	public List<Role>listar();
	public void delete(int idRole);
	public void modificar(Role r);
}
