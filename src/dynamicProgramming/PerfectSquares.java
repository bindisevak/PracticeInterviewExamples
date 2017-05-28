package dynamicProgramming;

import java.util.Arrays;

public class PerfectSquares {
	public static void main(String[] args) {
		PerfectSquares ps = new PerfectSquares();
		int result = ps.numSquares(12);
		System.out.println("Result: "+result);
	}
	
	public int numSquares(int n) {
	    int max = (int) Math.sqrt(n);
	 
	    int[] dp = new int[n+1];
	    Arrays.fill(dp, Integer.MAX_VALUE);
	 
	    for(int i=1; i<=n; i++){
	        for(int j=1; j<=max; j++){
	            if(i==j*j){
	                dp[i]=1;
	            }else if(i>j*j){
	                dp[i]=Math.min(dp[i], dp[i-j*j] + 1);
	            }
	        }
	    }
	 
	    return dp[n];
	}
}
