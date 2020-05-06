package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.daointerface.ConditionDAO;
import pe.edu.upc.entity.Condition;
import pe.edu.upc.serviceinterface.ICondition;

@Named
@RequestScoped
public class ConditionServiceImpl implements Serializable, ICondition {

	private static final long serialVersionUID = 1L;
	private ConditionDAO CD;

	@Override
	public void insert(Condition con) {
		try {
			CD.insert(con);
		} catch (Exception e) {
			System.out.println("Error en el service al insertar el estado");
		}
		// TODO Auto-generated method stub

	}

	@Override
	public List<Condition> listar() {
		// TODO Auto-generated method stub
		return CD.listar();
	}

	@Override
	public void delete(int idCondition) {
		CD.delete(idCondition);

	}

	@Override
	public void modificar(Condition c) {
		CD.modificar(c);

	}

}
