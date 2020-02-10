package beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "planes")
public class Plane {
	
	@Id // PK!
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AI, IDENTITY means each table has its own numbering (default is a numbering system shared for all tables)
	private int id;
	@Column(nullable = false)
	private String manufacturer;
	@Column(nullable = false)
	private String model;
	@Column
	private int numOfSeats;
	@Column
	private boolean hasMultimedia;
	@Column
	private double topSpeed;
	@OneToMany(mappedBy = "plane", fetch = FetchType.EAGER)
	private List<Pilot> pilots;
	
	
	public Plane() {
		// used by Hibernate. DO NOT FORGET TO ADD
	}


	public Plane(String manufacturer, String model, int numOfSeats, boolean hasMultimedia, double topSpeed) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.numOfSeats = numOfSeats;
		this.hasMultimedia = hasMultimedia;
		this.topSpeed = topSpeed;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getNumOfSeats() {
		return numOfSeats;
	}


	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}


	public boolean isHasMultimedia() {
		return hasMultimedia;
	}


	public void setHasMultimedia(boolean hasMultimedia) {
		this.hasMultimedia = hasMultimedia;
	}


	public double getTopSpeed() {
		return topSpeed;
	}


	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}


	public int getId() {
		return id;
	}


	public List<Pilot> getPilots() {
		return pilots;
	}


	@Override
	public String toString() {
		return "Plane [id=" + id + ", manufacturer=" + manufacturer + ", model=" + model + ", numOfSeats=" + numOfSeats
				+ ", hasMultimedia=" + hasMultimedia + ", topSpeed=" + topSpeed  + "]";
	}


	
	
	
	
}
