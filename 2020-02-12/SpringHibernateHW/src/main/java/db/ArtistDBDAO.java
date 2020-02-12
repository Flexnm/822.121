package db;

import java.util.List;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import beans.Artist;

@Component
@Transactional
public class ArtistDBDAO {
	@Autowired
	private SessionFactory localSessionFactory;
	
	public void addArtist(Artist artist) {
		localSessionFactory.getCurrentSession().save(artist);
	}
	
	public void updateArtist(Artist artist) {
		localSessionFactory.getCurrentSession().update(artist);
	}
	
	public void deleteArtist(int id) {
		localSessionFactory.getCurrentSession().delete(getOneArtist(id));
	}

	public Artist getOneArtist(int id) {
		return localSessionFactory.getCurrentSession().get(Artist.class, id);
	}
		
	public List<Artist> getAllArtists(){
		TypedQuery<Artist> query =  
				localSessionFactory.getCurrentSession().createQuery("from Artist", Artist.class);
		return query.getResultList();
	}
	
}
