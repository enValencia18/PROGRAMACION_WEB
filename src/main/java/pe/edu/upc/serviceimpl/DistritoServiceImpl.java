package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.DistritoDAO;
import pe.edu.upc.entity.Distrito;
import pe.edu.upc.serviceinterface.IDistrito;

@Named
@RequestScoped
public class DistritoServiceImpl implements Serializable, IDistrito{
	
	private static final long serialVersionUID = 1L;
	@Inject
	private DistritoDAO DD;

	@Override
	public void insert(Distrito type) {
		try {
			DD.insert(type);
		} catch (Exception e) {
			System.out.println("Error en el service al insertar el distrito");
		}
	}

	@Override
	public List<Distrito> listar() {
		// TODO Auto-generated method stub
		return DD.listar();
	}

	@Override
	public void delete(int idDistrito) {
		DD.delete(idDistrito);
		
	}

	@Override
	public void modificar(Distrito d) {
		DD.modificar(d);
		
	}

}
