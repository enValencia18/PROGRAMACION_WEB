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
@Table(name = "Product")

public class Product implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProduct;
	
	@Column(name = "MMonto_Product", nullable = false, length = 15)
	private int MMonto_Product;
	
	@ManyToOne
	@JoinColumn(name = "idBike", nullable = false)
	private Bike bike;
	
	@ManyToOne
	@JoinColumn(name = "idAccessory", nullable = false)
	private Accessory idAccessory;

	public Product() {
		super();
	}
	
	public Product(int idProduct, int mMonto_Product, Bike bike, Accessory idAccessory) {
		super();
		this.idProduct = idProduct;
		this.MMonto_Product = mMonto_Product;
		this.bike = bike;
		this.idAccessory = idAccessory;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public int getMMonto_Product() {
		return MMonto_Product;
	}

	public void setMMonto_Product(int mMonto_Product) {
		MMonto_Product = mMonto_Product;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	public Accessory getIdAccessory() {
		return idAccessory;
	}

	public void setIdAccessory(Accessory idAccessory) {
		this.idAccessory = idAccessory;
	}
}
