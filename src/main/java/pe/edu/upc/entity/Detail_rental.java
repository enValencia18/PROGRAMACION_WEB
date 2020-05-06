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
@Table(name = "Detail_rental")
public class Detail_rental implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetail_rental;

	@ManyToOne
	@JoinColumn(name = "idProduct", nullable = false)
	private Product product;

	@ManyToOne
	@JoinColumn(name = "idRental", nullable = false)
	private Rental rental;

	public Detail_rental() {
		super();
	}

	public Detail_rental(int idDetail_rental, Product product, Rental rental) {
		super();
		this.idDetail_rental = idDetail_rental;
		this.product = product;
		this.rental = rental;
	}

	public int getIdDetail_rental() {
		return idDetail_rental;
	}

	public void setIdDetail_rental(int idDetail_rental) {
		this.idDetail_rental = idDetail_rental;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Rental getRental() {
		return rental;
	}

	public void setRental(Rental rental) {
		this.rental = rental;
	}

}
