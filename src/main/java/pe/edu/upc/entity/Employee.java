package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")

public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEmployee;

	@Column(name = "NEmployee", nullable = false, length = 50)
	private String NEmployee;

	@Column(name = "Phone_Employee", nullable = false, length = 9)
	private int Phone_Employee;
	
	@ManyToOne
	@JoinColumn(name = "idCitystall", nullable = false)
	private Citystall citystall;
	
	@ManyToOne
	@JoinColumn(name = "idRole", nullable = false)
	private Role role;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int idEmployee, String nEmployee, int phone_Employee, Citystall citystall, Role role) {
		super();
		this.idEmployee = idEmployee;
		this.NEmployee = nEmployee;
		this.Phone_Employee = phone_Employee;
		this.citystall = citystall;
		this.role = role;
	}

	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getNEmployee() {
		return NEmployee;
	}

	public void setNEmployee(String nEmployee) {
		NEmployee = nEmployee;
	}

	public int getPhone_Employee() {
		return Phone_Employee;
	}

	public void setPhone_Employee(int phone_Employee) {
		Phone_Employee = phone_Employee;
	}

	public Citystall getCitystall() {
		return citystall;
	}

	public void setCitystall(Citystall citystall) {
		this.citystall = citystall;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
