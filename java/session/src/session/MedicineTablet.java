package session;

public class MedicineTablet extends Medicine{

	public MedicineTablet(float price, Date expDate) {
		super(price, expDate);
	}

	@Override
	public void displayLabel() {
		getDetails();
		System.out.println("Take tablets on doctors prescribtion only");
	}

	
}
