package dynamicProgramming;

import java.util.Set;

public class WordBreak {
	public static void main(String[] args) {
		
	}
	
	public boolean wordBreak(String s, Set<String> dict){
		if(s == null || s.isEmpty()) return true;
		
		boolean[] dp = new boolean[s.length() + 1];
		dp[0] = true;
		
		for(int i=0; i<s.length(); i++){
			if(!dp[i])
				continue;
			for(String word: dict){
				int len = word.length();
				int end = i+len;
				if(end > s.length()) continue;
				if(dp[end]) continue;
				if(s.substring(i, end).equals(word)){
					dp[end] = true;
				}
			}
		}
		return dp[s.length()];
	}
}
