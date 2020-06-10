package couponProject3.web;




@RestController
public class AdminController extends ClientController{

	@Autowired
	private Map<String, Session> sessionMap;
	
	@GetMapping("/companies/{token}")
	public ResponseEntity<List<Company>> getAllCompanies(@PathVariable String token) {
		Session session = sessionMap.get(token);
		if(session != null){
			session.setLastLoginTime(System.currentTimeMillis());
			AdminFacade admin = (AdminFacade)session.getFacade();
			List<Company> companies = admin.getAllCompanies();
			return ResponseEntity.ok(companies);
		}else{
			return ResponseEntity.status(UNAUTHORIZED).body("Unauthorized login");
		}
	}
	
	
}
