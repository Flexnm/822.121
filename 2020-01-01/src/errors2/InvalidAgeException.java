package errors2;

public class InvalidAgeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException() {
		super("Invalid age! Age must be between 18 and 70");
	}
	
	
}
