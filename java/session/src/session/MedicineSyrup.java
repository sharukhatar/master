package session;

public class MedicineSyrup extends Medicine{

	public MedicineSyrup(float price, Date expDate) {
		super(price, expDate);
	}

	@Override
	public void displayLabel() {
		getDetails();
		System.out.println("To be store in dry cool place");
	}

	
}
