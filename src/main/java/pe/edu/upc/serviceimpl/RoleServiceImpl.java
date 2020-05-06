package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.daointerface.RoleDAO;
import pe.edu.upc.entity.Role;
import pe.edu.upc.serviceinterface.IRole;

@Named
@RequestScoped
public class RoleServiceImpl implements Serializable, IRole{

	private static final long serialVersionUID = 1L;
	private RoleDAO RD;
	@Override
	public void insert(Role rol) {
		try {
			RD.insert(rol);
		} catch (Exception e) {
			System.out.println("Error en el service al insertar un Rol");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Role> listar() {
		// TODO Auto-generated method stub
		return RD.listar();
	}

	@Override
	public void delete(int idRole) {
		RD.delete(idRole);
		
	}

	@Override
	public void modificar(Role r) {
		RD.modificar(r);
		
	}

}
