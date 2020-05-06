package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Rental_Status")
public class Rental_status implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRental_Status;

	@ManyToOne
	@JoinColumn(name = "idRental", nullable = false)
	private Rental rental;

	@ManyToOne
	@JoinColumn(name = "idStatus", nullable = false)
	private Status status;

	public Rental_status() {
		super();
	}

	public Rental_status(int idRental_Status, Rental rental, Status status) {
		super();
		this.idRental_Status = idRental_Status;
		this.rental = rental;
		this.status = status;
	}

	public int getIdRental_Status() {
		return idRental_Status;
	}

	public void setIdRental_Status(int idRental_Status) {
		this.idRental_Status = idRental_Status;
	}

	public Rental getRental() {
		return rental;
	}

	public void setRental(Rental rental) {
		this.rental = rental;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
