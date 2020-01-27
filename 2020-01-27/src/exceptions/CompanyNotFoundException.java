package exceptions;

public class CompanyNotFoundException extends Exception {
	
	private static final long serialVersionUID = 1;

	public CompanyNotFoundException() {
		super("Company not found!");
	}
}
