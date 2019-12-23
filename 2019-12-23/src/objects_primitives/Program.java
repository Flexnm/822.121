package objects_primitives;

public class Program {

	public static void main(String[] args) {
		
//		int n1 = 10, n2 = 5;
//		System.out.println("n1=" + n1 + ", n2=" + n2);
//		swap(n1, n2);
//		System.out.println("n1=" + n1 + ", n2=" + n2);
		
		Person p1 = new Person("Nir", 42);
		System.out.println(p1.age);

		changePerson(p1);

		System.out.println(p1.age);

	}
	
	public static void changePerson(Person person) {
		person.age = 100;
	}
	
	public static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}

}
