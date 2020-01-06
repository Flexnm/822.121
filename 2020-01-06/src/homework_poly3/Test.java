package homework_poly3;

public class Test {

	public static void main(String[] args) {
		
		String[] colors = { "Green", "Red", "Magenta", "Blue", "Black", "Brown", "Purple" };
		Furniture[] furnitures = new Furniture[20];
		
		for (int i = 0; i < furnitures.length; i++) {
			int randChoice = (int)(Math.random()*3+1);
			
			int length = (int)(Math.random()*30+1);
			int width = (int)(Math.random()*30+1);
			int height = (int)(Math.random()*30+1);
			String color = colors[(int)(Math.random()*colors.length)];
			
			switch(randChoice) {
			case 1:
				// chair
				furnitures[i] = new Chair(length, width, height, 
						color, (int)(Math.random()*4+1));
				break;
				
			case 2:
				// table
				furnitures[i] = new Table(length, width, height, color,
						(int)(Math.random()*8+1));
				break;
				
			case 3:
				// bed				
				furnitures[i] = new Bed(length, width, height, color, 
						(int)(Math.random()*2) == 0 ? false : true);
				break;
			}
		}
		
		for (Furniture furn : furnitures) {
			System.out.println(furn);
			furn.draw();
			if(furn instanceof Chair) {
				System.out.println("*** " + ((Chair)furn).getNumOfLegs() + " ***");
			} else if(furn instanceof Table) {
				System.out.println("*** " + ((Table)furn).getNumOfSeats()+ " ***");
			} else {
				System.out.println("*** " + ((Bed)furn).isDoubleBed()+ " ***");
			}
		}

	}

}
