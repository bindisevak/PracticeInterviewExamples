package dynamicProgramming;

public class ClimbingStairs {
	public static void main(String[] args) {
		System.out.println("Result: "+getClimbResult(4));
		System.out.println("Result: "+getTripleClimbResult(4));
	}
	
	public static int getClimbResult(int n){
		int[] num = new int[n+1];
		
		if(n==0 || n==1)
			return 1;
		num[0] = 1;
		num[1] = 1;
		
		for(int i=2; i<n+1; i++){
			num[i] = num[i-1] + num[i-2];
		}
		System.out.println(num.length);
		return num[n];
	}
	
	public static int getTripleClimbResult(int n){
		
		if(n<0){
			return 0;
		}
		else if(n==0 || n==1){
			return 1;
		}
		else {
			return getTripleClimbResult(n-1) + getTripleClimbResult(n-2) + getTripleClimbResult(n-3);
		}
		
	}
}
