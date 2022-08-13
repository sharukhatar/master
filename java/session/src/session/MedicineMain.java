package session;

public class MedicineMain {

	public static void main(String[] args) {

		Medicine m1 = new MedicineTablet(50.0f, new Date(2,5,2026));
		m1.displayLabel();
		
		Medicine m2 = new MedicineSyrup(100.0f, new Date(24,8,2024));
		m2.displayLabel();
		
		Medicine m3 = new MedicineOintment(90.0f, new Date(26,7,2027));
		m3.displayLabel();
	}

}
