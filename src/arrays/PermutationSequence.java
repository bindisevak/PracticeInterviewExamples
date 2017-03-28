package arrays;

import java.util.ArrayList;

public class PermutationSequence {
	public static void main(String[] args) {
		PermutationSequence pms = new PermutationSequence();
		String result = pms.getPermutation(3, 2);
		System.out.println(result);
	}
	
	public String getPermutation(int n, int k) {
		 
		// initialize all numbers
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			numberList.add(i);
		}
 
		// change k to be index
		k--;
 
		// set factorial of n
		int mod = 1;
		for (int i = 1; i <= n; i++) {
			mod = mod * i;
		}
 
		String result = "";
		System.out.println("Initial Mod: "+mod);
		System.out.println("Initial K: "+k);
		// find sequence
		for (int i = 0; i < n; i++) {
			mod = mod / (n - i);
			System.out.println("Mod: "+mod);
			// find the right number(curIndex) of
			int curIndex = k / mod;
			System.out.println("Index: "+curIndex);
			// update k
			k = k % mod;
			System.out.println("k: "+k);
 
			// get number according to curIndex
			result += numberList.get(curIndex);
			System.out.println("result: "+result);
			// remove from list
			numberList.remove(curIndex);
		}
 
		return result.toString();
	}

}
