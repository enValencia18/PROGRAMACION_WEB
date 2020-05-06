package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.daointerface.RentalDAO;
import pe.edu.upc.entity.Rental;
import pe.edu.upc.serviceinterface.IRental;

@Named
@RequestScoped
public class RentalServiceImpl implements Serializable, IRental{

	private static final long serialVersionUID = 1L;
	private RentalDAO RD;
	@Override
	public void insert(Rental ren) {
		try {
			RD.insert(ren);
		} catch (Exception e) {
			System.out.println("Error en el service al insertar una renta");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Rental> listar() {
		// TODO Auto-generated method stub
		return RD.listar();
	}

	@Override
	public void delete(int idRental) {
		RD.delete(idRental);
		
	}

	@Override
	public void modificar(Rental r) {
		RD.modificar(r);
		
	}

}
