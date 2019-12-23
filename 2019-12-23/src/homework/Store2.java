package homework;

public class Store2 {
	private Item[] items = new Item[10];
	
	public void addItem(Item item) {
		for (int i = 0; i < items.length; i++) {
			if(items[i] == null) {
				items[i] = item;
				break;
			}
		}
	}
	
	public void delteItem(int index) {
		if (index >= 0 && index < items.length) {
			items[index] = null;
		} else {
			System.out.println("Index is out of bounds!");
		}
	}
	
	public Item getItem(int index) {
		if (index >= 0 && index < items.length) {
			return items[index];
		} else {
			System.out.println("Index is out of bounds!");
			return null;
		}
	}

	public Item[] getItems() {
		return items;
	}
	
	
	
	
	
	
	
}
