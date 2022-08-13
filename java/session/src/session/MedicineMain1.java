package session;

public class MedicineMain1 {

	public static void main(String[] args) {
		Medicine m1 = new MedicineTablet(100f, new Date(12,5,2016));
		Medicine m2 = new MedicineSyrup(45f, new Date(26,4,2022));
		Medicine m3 = new MedicineOintment(168f, new Date(11,11,2021));
		
		Medicine medArr[] = new Medicine[3];
		medArr[0] = m1;
		medArr[1] = m2;
		medArr[2] = m3;
		
		for(Medicine m : medArr) {
			//m.getDetails();
			m.displayLabel();
			System.out.println("-------------------------------------------------");
		}
	}
}
