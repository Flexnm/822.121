package beans;

import java.sql.Date;

public class Coupon {
	private int couponId;
	private String title;
	private Date startDate, endDate;
	private int amount;
	private CategoryType category;
	
	
	public Coupon(String title, Date startDate, Date endDate, int amount, CategoryType category) {
		super();
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
		this.category = category;
	}


	public Coupon(int couponId, String title, Date startDate, Date endDate, int amount, CategoryType category) {
		super();
		this.couponId = couponId;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
		this.category = category;
	}
	
	

	

}
