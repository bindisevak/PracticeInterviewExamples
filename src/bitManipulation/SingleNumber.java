package bitManipulation;

public class SingleNumber {
	public static void main(String[] args) {
		SingleNumber sn = new SingleNumber();
		int[] A = {1,1,2,3,3};
		System.out.println("Result: "+sn.singleNumber(A));
	}
	
	public int singleNumber(int[] A){
		int x = 0;
		for(int a: A){
			x = x^a;
			System.out.println(x);
		}
		return x;
	}
}
