package session;

public class MedicineOintment extends Medicine{

	public MedicineOintment(float price, Date expDate) {
		super(price, expDate);
	}

	@Override
	public void displayLabel() {
		getDetails();
		System.out.println("for external use only");
	}

}
