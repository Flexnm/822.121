package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "albums")
public class Album {

	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AI numbering per table
	private int id;
	@Column
	private String title;
	@Column
	private int year;
	@ManyToOne
	private Artist artist;

	public Album() {
		// Hibernate!!!
	}

	public Album(String title, int year, Artist artist) {
		super();
		this.title = title;
		this.year = year;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public Artist getArtist() {
		return artist;
	}

	@Override
	public String toString() {
		return "Album [id=" + id + ", title=" + title + ", year=" + year + "]";
	}

}
