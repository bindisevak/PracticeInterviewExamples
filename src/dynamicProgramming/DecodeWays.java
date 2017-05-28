package dynamicProgramming;

public class DecodeWays {
	public static void main(String[] args) {
		System.out.println("Result: "+numDecodings("29"));
		System.out.println("Result: "+numDecodings("129"));
		System.out.println("Result: "+numDecodings("22"));
		System.out.println("Result: "+numDecodings("122"));
	}
	
	public static int numDecodings(String s){
		if(s==null || s.length()==0 || s.charAt(0)=='0')
			return 0;
		if(s.length()==1)
			return 1;
		
		int[] dp = new int[s.length()];
		dp[0] = 1;
		if(Integer.parseInt(s.substring(0, 2))>26){
			if(s.charAt(1) != '0')
				dp[1] = 1;
			else
				dp[1] = 1;
		}else{
			if(s.charAt(1) != '0')
				dp[1] = 2;
			else
				dp[1] = 1;
		}
		for(int i=2; i<s.length(); i++){
			if(s.charAt(i) != '0'){
				dp[i] = dp[i] + dp[i-1];
			}
			int val = Integer.parseInt(s.substring(i-1, i+1));
			System.out.println(val);
			if(val<=26 && val>=10){
				dp[i] = dp[i] + dp[i-2];
			}
		}
		return dp[s.length()-1];
	}
}
