package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Role")

public class Role implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRole;

	@Column(name = "NRole", nullable = false, length = 15)
	private String NRole;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(int idRole, String nRole) {
		super();
		this.idRole = idRole;
		this.NRole = nRole;
	}

	public int getIdRole() {
		return idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getNRole() {
		return NRole;
	}

	public void setNRole(String nRole) {
		NRole = nRole;
	}	
	
}
