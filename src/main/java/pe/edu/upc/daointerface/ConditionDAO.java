package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Condition;

public interface ConditionDAO {

	public void insert(Condition con);
	public List<Condition> listar();
	public void delete(int idCondition);
	public void modificar(Condition c);
}
