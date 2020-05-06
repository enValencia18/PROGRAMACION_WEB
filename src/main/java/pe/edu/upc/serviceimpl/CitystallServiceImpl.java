package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.daointerface.CitystallDAO;
import pe.edu.upc.entity.Citystall;
import pe.edu.upc.serviceinterface.ICitystall;

@Named
@RequestScoped
public class CitystallServiceImpl implements Serializable, ICitystall {

	private static final long serialVersionUID = 1L;
	private CitystallDAO CD;

	@Override
	public void insert(Citystall cs) {
		try {
			CD.insert(cs);
		} catch (Exception e) {
			System.out.println("Error en el service al insertar una sucursal");
		}
		// TODO Auto-generated method stub

	}

	@Override
	public List<Citystall> listar() {
		// TODO Auto-generated method stub
		return CD.listar();
	}

	@Override
	public void delete(int idCitystall) {
		CD.delete(idCitystall);

	}

	@Override
	public void modificar(Citystall c) {
		CD.modificar(c);

	}

}
