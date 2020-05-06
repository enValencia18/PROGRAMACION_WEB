package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import pe.edu.upc.daointerface.Detail_rentalDAO;
import pe.edu.upc.entity.Detail_rental;
import pe.edu.upc.serviceinterface.IDetail_rental;

public class Detail_rentalImpl implements Serializable, IDetail_rental {

	private static final long serialVersionUID = 1L;
	private Detail_rentalDAO DRD;

	@Override
	public List<Detail_rental> listar() {
		return DRD.listar();
	}
	
}
