package db;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import beans.Album;

@Component
@Transactional
public class AlbumDBDAO {
	@Autowired
	private SessionFactory localSessionFactory;
	
	public void addAlbum(Album album) {
		localSessionFactory.getCurrentSession().save(album);
	}
	
	public void updateAlbum(Album album) {
		localSessionFactory.getCurrentSession().update(album);
	}
	
	public void deleteAlbum(int id) {
		localSessionFactory.getCurrentSession().delete(getOneAlbum(id));
	}

	public Album getOneAlbum(int id) {
		return localSessionFactory.getCurrentSession().get(Album.class, id);
	}
		
	public List<Album> getAllAlbums(){
		TypedQuery<Album> query =  
				localSessionFactory.getCurrentSession().createQuery("from Album", Album.class);
		return query.getResultList();
	}
	
	
	public List<Album> getAlbumsByYear(int year){
		// the query uses HQL - java syntax inside 
		TypedQuery<Album> query =  
				localSessionFactory.getCurrentSession()
				.createQuery("select a from Album a where a.year=:y", Album.class);
		query.setParameter("y", year);
		return query.getResultList();
	}
	
	
	public List<Album> getAlbumsBetweenYears(int startYear, int endYear){
		// the query uses HQL - java syntax inside 
		TypedQuery<Album> query =  
				localSessionFactory.getCurrentSession()
				.createQuery("select a from Album a where a.year between :start and :end", Album.class);
		query.setParameter("start", startYear);
		query.setParameter("end", endYear);
		return query.getResultList();
	}
	
	
	public List<Album> getAlbumsByTitle(String title){
		// the query uses HQL - java syntax inside 
		TypedQuery<Album> query =  
				localSessionFactory.getCurrentSession()
				.createQuery("select bla from Album bla where bla.title like '%" + title + "%'", Album.class);
		//query.setParameter("title", title);
		return query.getResultList();
	}
	
	
	
}
