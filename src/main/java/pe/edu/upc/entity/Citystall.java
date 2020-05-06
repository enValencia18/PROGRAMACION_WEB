package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Citystall")

public class Citystall implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCitystall;

	@Column(name = "Phone_Citysatll", nullable = false, length = 9)
	private int Phone_Citysatll;

	@Column(name = "TDireccion_Citysatll", nullable = false, length = 50)
	private String TDireccion_Citysatll;

	public Citystall() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Citystall(int idCitystall, int phone_Citysatll, String tDireccion_Citysatll) {
		super();
		this.idCitystall = idCitystall;
		this.Phone_Citysatll = phone_Citysatll;
		this.TDireccion_Citysatll = tDireccion_Citysatll;
	}

	public int getIdCitystall() {
		return idCitystall;
	}

	public void setIdCitystall(int idCitystall) {
		this.idCitystall = idCitystall;
	}

	public int getPhone_Citysatll() {
		return Phone_Citysatll;
	}

	public void setPhone_Citysatll(int phone_Citysatll) {
		Phone_Citysatll = phone_Citysatll;
	}

	public String getTDireccion_Citysatll() {
		return TDireccion_Citysatll;
	}

	public void setTDireccion_Citysatll(String tDireccion_Citysatll) {
		TDireccion_Citysatll = tDireccion_Citysatll;
	}
}
