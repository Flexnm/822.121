package couponProject3.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

import couponProject3.exceptions.InvalidLoginExcepction;
import couponProject3.facades.AdminFacade;
import couponProject3.facades.ClientFacade;
import couponProject3.facades.CompanyFacade;
import couponProject3.facades.CustomerFacade;

@Service
public class LoginManager {
	
	@Autowired
	private ConfigurableApplicationContext ctx; 
	
	public ClientFacade ClientLogin(String email, String password, ClientType client)
			throws InvalidLoginExcepction, NullPointerException {

		switch (client) {

		case Adminisrtator:
			AdminFacade adminFacade = ctx.getBean(AdminFacade.class);
			if (adminFacade.login(email, password));
				return adminFacade;

		case Company:
			CompanyFacade compFacade = ctx.getBean(CompanyFacade.class);
			if (compFacade.login(email, password));
				return compFacade;

		case Customer:
			CustomerFacade custFacade = ctx.getBean(CustomerFacade.class);
			if (custFacade.login(email, password));
				return custFacade;

		default:
			throw new InvalidLoginExcepction();
		}
	}
}
