package dynamicProgramming;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("leet");
		set.add("code");
		set.add("hell");
		String s = "leetcode";
		WordBreak wb = new WordBreak();
		boolean result = wb.wordBreak(s, set);
		System.out.println("Result: "+result);
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
