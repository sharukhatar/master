package session;

public abstract class Medicine {

	private float price;
	private Date expDate;
	
	public Medicine(float price, Date expDate) {
		this.price = price;
		this.expDate = expDate;
	}

	public void getDetails() {
		System.out.println("Price : "+this.price+" Expiry Date : "+this.expDate);
	}
	
	public abstract void displayLabel();

}
