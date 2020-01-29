package facades;

import db.CompanyDAO;
import db.CompanyDBDAO;
import db.CouponDBDAO;

public abstract class ClientFacade {
	protected CompanyDAO compDB = new CompanyDBDAO();
	protected CouponDBDAO coupDB = new CouponDBDAO();
	// customerDBDAO
	
	public abstract boolean login(String email, String password);
}
