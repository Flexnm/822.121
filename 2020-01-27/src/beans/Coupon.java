package beans;

import java.sql.Date;

public class Coupon {
	private int couponId;
	private int companyId;
	private String title;
	private Date startDate, endDate;
	private int amount;
	private CategoryType category;

	public Coupon(int couponId, int companyId, String title, Date startDate, Date endDate, int amount,
			CategoryType category) {
		super();
		this.couponId = couponId;
		this.companyId = companyId;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
		this.category = category;
	}

	public Coupon(int companyId, String title, Date startDate, Date endDate, int amount, CategoryType category) {
		super();
		this.companyId = companyId;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
		this.category = category;
	}

	public int getCouponId() {
		return couponId;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public CategoryType getCategory() {
		return category;
	}

	public void setCategory(CategoryType category) {
		this.category = category;
	}

	
	
}
