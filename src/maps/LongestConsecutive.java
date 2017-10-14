package maps;

import java.util.HashSet;

public class LongestConsecutive {
	public static void main(String[] args) {
		
	}
	
	public static int getSequence(int[] nums){
		if(nums.length == 0){
			return 0;
		}
		HashSet<Integer> set = new HashSet<Integer>();
		int max = 1;
		
		for(int e: nums){
			set.add(e);
		}
		for(int e: nums){
			int count = 1;
			int left = e-1;
			int right = e+1;
			
			while(set.contains(left)){
				count++;
				set.remove(left);
				left--;
			}
			while(set.contains(right)){
				count++;
				set.remove(right);
				right++;
			}
			max = Math.max(count, max);
		}
		return max;
	}
}
