package errors2;

public class Student {
	private String name;
	private int age;

	// ctor
	public Student(String name, int age) throws InvalidAgeException {
		super();
		this.name = name;
		setAge(age);
	}

	// getters/setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws InvalidAgeException{
		if(age >= 18 && age <= 70) {
			this.age = age;
		} else {
			throw new InvalidAgeException();
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	

}
