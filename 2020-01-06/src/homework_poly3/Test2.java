package homework_poly3;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		
		String[] colors = { "Green", "Red", "Magenta", "Blue", "Black", "Brown", "Purple" };
		ArrayList<Furniture> furnitures = new ArrayList<Furniture>();
		
		for (int i = 0; i < 20; i++) {
			int randChoice = (int)(Math.random()*3+1);
			
			int length = (int)(Math.random()*30+1);
			int width = (int)(Math.random()*30+1);
			int height = (int)(Math.random()*30+1);
			String color = colors[(int)(Math.random()*colors.length)];
			
			switch(randChoice) {
			case 1:
				// chair
				furnitures.add(new Chair(length, width, height, color, 
						(int)(Math.random()*4+1)));
				break;
			case 2:
				// table
				furnitures.add( new Table(length, width, height, color,
						(int)(Math.random()*8+1)));
				break;
				
			case 3:
				// bed				
				furnitures.add( new Bed(length, width, height, color, 
						(int)(Math.random()*2) == 0 ? false : true));
				break;
				
			}
		}
		
		for (int i = 0; i < furnitures.size(); i++) {
			System.out.println(furnitures.get(i));
			furnitures.get(i).draw();
		}
		
//		for (Furniture furn : furnitures) {
//			System.out.println(furn);
//			furn.draw();
//		}

	}

}
