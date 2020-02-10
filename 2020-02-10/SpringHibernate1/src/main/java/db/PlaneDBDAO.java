package db;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import beans.Plane;

@Component
@Transactional
public class PlaneDBDAO {

	@Autowired
	private SessionFactory getLocalSessionFactory;
	
	public void addPlane(Plane plane) {
		getLocalSessionFactory.getCurrentSession().save(plane);
	}

	public void updatePlane(Plane plane) {
		getLocalSessionFactory.getCurrentSession().update(plane);
	}
	
	public void deletePlane(int id) {
		getLocalSessionFactory.getCurrentSession().delete(getOnePlane(id));
	}
	
	public Plane getOnePlane(int id) {
		return getLocalSessionFactory.getCurrentSession().get(Plane.class, id);
	}
	
	public List<Plane> getAllPlanes(){
		TypedQuery<Plane> query = getLocalSessionFactory.getCurrentSession().createQuery("from Plane", Plane.class);
		return query.getResultList();
	}
	
}











