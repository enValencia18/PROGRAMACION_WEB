package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Distrito")

public class Distrito implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDistrito;

	@Column(name = "NDistrito", nullable = false, length = 15)
	private String NDistrito;



	public Distrito() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Distrito(int idDistrito, String NDistrito) {
		super();
		this.idDistrito = idDistrito;
		this.NDistrito = NDistrito;
	}

	public int getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}

	public String getNDistrito() {
		return NDistrito;
	}

	public void setNDistrito(String nDistrito) {
		NDistrito = nDistrito;
	}
	
}
