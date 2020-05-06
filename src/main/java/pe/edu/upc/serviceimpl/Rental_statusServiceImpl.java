package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import pe.edu.upc.daointerface.Rental_statusDAO;
import pe.edu.upc.entity.Rental_status;
import pe.edu.upc.serviceinterface.IRental_status;

public class Rental_statusServiceImpl implements Serializable, IRental_status {

	private static final long serialVersionUID = 1L;
	private Rental_statusDAO RSD;

	@Override
	public List<Rental_status> listar() {
		return RSD.listar();
	}

}
