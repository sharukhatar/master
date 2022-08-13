package session;

public class PassingArg {

	public int add(int[] arr) {
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		
		return sum;
	}
	
	public int[] evenNos(int[] arr) {
		int count = 0;
		for(int i:arr) {
			if(i%2==0) {
				count++;
			}
		}
		
		int[] evenarr = new int[count];
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(i%2 == 0) {
				evenarr[j] = i;
				j++;
			}
		}
		
		return evenarr;
		
	}
	
	public static void main(String[] args) {
		PassingArg pa = new PassingArg();
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(pa.add(arr));
		System.out.println(pa.evenNos(arr));
	}
}
