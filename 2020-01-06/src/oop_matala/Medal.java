package oop_matala;

public class Medal {
	private int position;
	private String date;

	public Medal(int position, String date) {
		super();
		this.position = position;
		this.date = date;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Medal [position=" + position + ", date=" + date + "]";
	}

}
