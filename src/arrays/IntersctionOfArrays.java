package arrays;

import java.util.HashSet;

public class IntersctionOfArrays {
	public static void main(String[] args) {
		
	}
	
	public int[] intersection(int[] nums1, int[] nums2){
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		for(int i: nums1){
			set1.add(i);
		}
		
		for(int i: nums2){
			if(set1.contains(i)){
				set2.add(i);
			}
		}
		int[] result = new int[set2.size()];
		int i = 0;
		for(int n: set2){
			result[i++] = n;
		}
		return result;
	}
}
