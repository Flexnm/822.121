package beans;

public class Company {
	private int companyId;
	private String name;
	private String password;
	private String email;

		
	public Company(String name, String password, String email) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public Company(int companyId, String name, String password, String email) {
		super();
		this.companyId = companyId;
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCompanyId() {
		return companyId;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", name=" + name + ", password=" + password + ", email=" + email
				+ "]";
	}

	
}
