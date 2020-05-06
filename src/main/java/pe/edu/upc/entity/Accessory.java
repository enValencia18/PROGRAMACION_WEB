package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Accessory")
public class Accessory implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAccessory;

	@Column(name = "NAccessory", nullable = false, length = 15)
	private String NAccessory;

	@Column(name = "MPrecio_Accessory", nullable = false, length = 15)
	private int MPrecio_Accessory;

	public Accessory() {
		super();
	}

	public Accessory(int idAccessory, String nAccessory, int mPrecio_Accessory) {
		super();
		this.idAccessory = idAccessory;
		NAccessory = nAccessory;
		MPrecio_Accessory = mPrecio_Accessory;
	}

	public int getIdAccessory() {
		return idAccessory;
	}

	public void setIdAccessory(int idAccessory) {
		this.idAccessory = idAccessory;
	}

	public String getNAccessory() {
		return NAccessory;
	}

	public void setNAccessory(String nAccessory) {
		NAccessory = nAccessory;
	}

}
