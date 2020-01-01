package errors2;

public class TestStudent {

	public static void main(String[] args) {
		
		try {
			Student s1 = new Student("aa", 100);
			
			s1.setAge(40);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
 		

	}

}
