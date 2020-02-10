import java.sql.Date;
import java.util.Calendar;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Pilot;
import beans.Plane;
import config.SpringConfig;
import db.PilotDBDAO;
import db.PlaneDBDAO;

public class Program {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(SpringConfig.class)){
			
			PlaneDBDAO planeDB = ctx.getBean(PlaneDBDAO.class);
			PilotDBDAO pilotDB = ctx.getBean(PilotDBDAO.class);
			
			/*
			Calendar cal = Calendar.getInstance();
			cal.set(1990, Calendar.JULY, 24);
			pilotDB.addPilot(new Pilot("Noam Gal", 7, new Date(cal.getTimeInMillis()), 35000, planeDB.getOnePlane(1)));
			
			cal.set(1985, Calendar.JANUARY, 1);
			pilotDB.addPilot(new Pilot("Yossi Cohen", 30, new Date(cal.getTimeInMillis()), 135000, planeDB.getOnePlane(1)));
			*/
			
			
			for (Pilot pi : pilotDB.getAllPilots()) {
				System.out.println(pi);
			}
			
			System.out.println("Pilot id2: " + pilotDB.getOnePilot(2));
			
			
			
			// INSERT
//			planeDB.addPlane(new Plane("Boeing", "777", 458, true, 3400.9));
//			planeDB.addPlane(new Plane("Airbus", "A380", 125, true, 1458.9));
			
			// GET ALL
			//System.out.println(planeDB.getAllPlanes());
			for (Plane p : planeDB.getAllPlanes()) {
				System.out.println(p.getModel() + " pilots: " + p.getPilots() );
			}
			
			// DELETE
//			planeDB.deletePlane(2);
			
			// UPDATE
//			Plane plane = planeDB.getOnePlane(3);
//			plane.setNumOfSeats(225);
//			plane.setTopSpeed(3333);
//			planeDB.updatePlane(plane);
			
			// GET ONE
//			System.out.println("Plane with id 3: " + planeDB.getOnePlane(3));
			
		}

	}

}
