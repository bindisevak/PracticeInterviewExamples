package bitManipulation;

public class SumIntegers {
	public static void main(String[] args) {
		
	}
	
	public int getSum(int a, int b){
		while(b != 0){
			int c = a&b;
			a = a^b;
			b = c<<1;
		}
		return a;
	}
}
