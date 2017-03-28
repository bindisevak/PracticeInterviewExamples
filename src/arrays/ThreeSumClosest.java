package arrays;

import java.util.Arrays;

public class ThreeSumClosest {
	public static void main(String[] args) {
		ThreeSumClosest ts = new ThreeSumClosest();
		int[] arr = {-1,2,1,-4};
		int target = 1;
		int ans = ts.getClosest(arr, target);
		System.out.println("Ans: " +ans);
	}
	
	public int getClosest(int[] nums, int target){
		int min = Integer.MAX_VALUE;
		int result = 0;
		
		Arrays.sort(nums);
		
		for(int i=0; i<nums.length-2; i++){
			int j = i+1;
			int k = nums.length-1;
			
			while(j<k){
				int sum = nums[i] + nums[j] + nums[k];
				int diff = Math.abs(sum-target);
				
				if(diff == 0) return sum;
				if(diff<min){
					min = diff;
					result = sum;
				}
				if(sum<=target){
					j++;
				} else {
					k--;
				}
			}
		}
		return result;
	}
}
