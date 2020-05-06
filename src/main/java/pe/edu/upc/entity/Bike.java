package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Bike")

public class Bike implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idBike;

	@Column(name = "NBike", nullable = false, length = 50)
	private String NBike;;

	@Column(name = "MPrecio_bike", nullable = false, length = 50)
	private int MPrecio_bike;

	private Date DateBike;

	@ManyToOne
	@JoinColumn(name = "idCondition", nullable = false)
	private Condition condition;

	public Bike() {
		super();
	}

	public Bike(int idBike, String nBike, int mPrecio_bike, Date dateBike, Condition condition) {
		super();
		this.idBike = idBike;
		this.NBike = nBike;
		this.MPrecio_bike = mPrecio_bike;
		this.DateBike = dateBike;
		this.condition = condition;
	}

	public int getIdBike() {
		return idBike;
	}

	public void setIdBike(int idBike) {
		this.idBike = idBike;
	}

	public String getNBike() {
		return NBike;
	}

	public void setNBike(String nBike) {
		NBike = nBike;
	}
	public int getMPrecio_bike() {
		return MPrecio_bike;
	}

	public void setMPrecio_bike(int mPrecio_bike) {
		MPrecio_bike = mPrecio_bike;
	}

	public Date getDateBike() {
		return DateBike;
	}

	public void setDateBike(Date dateBike) {
		DateBike = dateBike;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}
}
