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

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "artists") // Optional: to change the name of the table
@Component // just for Liav :) (component for Spring)
@Scope("prototype")
public class Artist {

	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String country;
	@OneToMany(mappedBy = "artist", fetch = FetchType.EAGER) // mappedBy is the name of the variable in Album class
	private List<Album> albums;

	public Artist() {
		// TODO Auto-generated constructor stub
	}

	public Artist(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getId() {
		return id;
	}

	/*  get all artist albums! We can now add to it, delete from it, get one album...   */
	public List<Album> getAlbums() {
		return albums;
	}

	@Override
	public String toString() {
		return "Artist [id=" + id + ", name=" + name + ", country=" + country + "]";
	}

}
