package miscellaneous;

public class DivideNums {
	public static void main(String[] args) {
		System.out.println("Result: "+divide(20, 2));
	}
	
	public static int divide(int dividend, int divisor){
		long p = Math.abs((long)dividend);
		long q = Math.abs((long)divisor);
		
		int result = 0;
		while(p >= q){
			int counter = 0;
			while(p >= (q<<counter)){
				counter++;
			}
			System.out.println(counter);
			result += 1<<(counter - 1);
			System.out.println(result);
			p -= q<<(counter-1);
			System.out.println(p);
		}
		if(dividend == Integer.MIN_VALUE && divisor == -1)
			return Integer.MAX_VALUE;
		if((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0))
			return result;
		else
			return -result;

	}
}
