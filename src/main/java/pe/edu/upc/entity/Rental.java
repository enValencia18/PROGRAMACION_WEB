package pe.edu.upc.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Rental")

public class Rental implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRental;
	
	private Date date_start;
	
	private Date date_end;
	
	@ManyToOne
	@JoinColumn(name = "idCliente", nullable = false)
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "idEmployee", nullable = false)
	private Employee employee;

	public Rental() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rental(int idRental, Date date_start, Date date_end, Cliente cliente, Employee employee) {
		super();
		this.idRental = idRental;
		this.date_start = date_start;
		this.date_end = date_end;
		this.cliente = cliente;
		this.employee = employee;
	}

	public int getIdRental() {
		return idRental;
	}

	public void setIdRental(int idRental) {
		this.idRental = idRental;
	}

	public Date getDate_start() {
		return date_start;
	}

	public void setDate_start(Date date_start) {
		this.date_start = date_start;
	}

	public Date getDate_end() {
		return date_end;
	}

	public void setDate_end(Date date_end) {
		this.date_end = date_end;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
