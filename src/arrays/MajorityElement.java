 package arrays;

import java.util.Arrays;

public class MajorityElement {
	public static void main(String[] args) {
		MajorityElement me = new MajorityElement();
		int[] nums = {1,2,2,2,3,4,4};
		System.out.println("Majority element: "+me.majorityElement(nums));
		System.out.println("Majority element: "+me.getMajority(nums));
	}
	public int getMajority(int[] nums){
		int result = 0;
		int count = 0;
		int max = 0;
		int j = 0;
		
		for(int i=0; i<nums.length; i++){
			if(count == 0){
				result = nums[i];
				count = 1;
			} else if(result == nums[i]){
				count++;
				if(max < count){
					max = count;
					j = i;
				}
			} else {
				count--;
			}
		}
		return nums[j];
	}
	
	public int majorityElement(int[] num) {
		if (num.length == 1) {
			return num[0];
		}
	 
		Arrays.sort(num);
		return num[num.length / 2];
	}
}
