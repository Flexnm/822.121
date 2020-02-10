package beans;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity // map to a DB table using Hibernate
@Table(name = "pilots")
public class Pilot {

	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AI
	private int id;
	@Column
	private String name;
	@Column
	private int experience;
	@Column
	private Date birthDate;
	@Column
	private double salary;
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_pilots_planes")) // if we want to name the foreign key
	private Plane plane;

	public Pilot() {
	}

	public Pilot(String name, int experience, Date birthDate, double salary, Plane plane) {
		super();
		this.name = name;
		this.experience = experience;
		this.birthDate = birthDate;
		this.salary = salary;
		this.plane = plane;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public Plane getPlane() {
		return plane;
	}

	public void setPlane(Plane plane) {
		this.plane = plane;
	}

	@Override
	public String toString() {
		return "Pilot [id=" + id + ", name=" + name + ", experience=" + experience + ", birthDate=" + birthDate
				+ ", salary=" + salary + ", plane=" + plane + "]";
	}

}
