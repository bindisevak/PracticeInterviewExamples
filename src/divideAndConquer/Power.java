package divideAndConquer;

public class Power {
	public static void main(String[] args) {
		
	}
	
	public double pow(double x, int n){
		if(n<0)
			return 1/helper(x, -n);
		else
			return helper(x,n);
	}

	private double helper(double x, int n) {
		if(n==0)
			return 1;
		double v = helper(x, n/2);
		
		if(n%2 == 0)
			return v*v;
		else
			return v*v*x;
	}
}
