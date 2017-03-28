package arrays;

import java.util.HashSet;
import java.util.Set;

public class PalindromePermutation {
	public static void main(String[] args) {
		PalindromePermutation pm = new PalindromePermutation();
		String s = "code";
		System.out.println("Result: "+pm.canPermutePalin(s));
	}
	
	public boolean canPermutePalin(String s){
		Set<Character> set = new HashSet<Character>();
		
		for(int i=0; i<s.length(); i++){
			Character curr = s.charAt(i);
			if(set.contains(curr)){
				set.remove(curr);
			} else {
				set.add(curr);
			}
		}
		return set.size() <= 1;
	}
}
