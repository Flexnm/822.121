package shapes;import org.w3c.dom.css.Rect;

public class Test {

	public static void main(String[] args) {
		//Shape s = new Shape();
		
		Rectangle re = new Rectangle(1, 2, "Black", 100, 40);
		System.out.println("Rectagle area: " + re.calcArea());
		System.out.println("Rectangle width: " + re.getWidth());

		System.out.println("********************");
		Circle ci = new Circle(2, 2, "Pink", 5.6);
		System.out.println("Circle area: " + ci.calcArea());
		
//		System.out.println("********************");
//		Rectangle sr = new Rectangle(3, 3, "Black", 200, 50);
//		System.out.println("Rectagle2 area: " + sr.calcArea());
//		System.out.println("Rectangle2 width: " + ((Rectangle)sr).getWidth());
		
		System.out.println("********************");
		Shape[] shapes = new Shape[3];
		shapes[2] = new Rectangle(1, 1, "Magenta", 10, 10);
		shapes[1] = new Circle(2, 2, "Green", 30);
		shapes[0] = new Circle(2, 3, "Blue", 12.5);
		
		for (int i = 0; i < shapes.length; i++) {
			if(shapes[i] instanceof Rectangle) {
				System.out.println("Rectangle width is: " + ((Rectangle)shapes[i]).getWidth());
			} else if(shapes[i] instanceof Circle) {
				System.out.println("Circle radius: " + ((Circle)shapes[i]).getRadius());
			}
			System.out.println( shapes[i].calcArea() );
		}
		
	}
	
	
	
	
	
	
	
	
	
	

}
