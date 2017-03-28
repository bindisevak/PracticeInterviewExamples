package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static void main(String[] args) {
		ThreeSum ts = new ThreeSum();
		int[] arr = {-1,0,1,2,-1,-4};
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list = ts.get3Sum(arr);
		for(List<Integer> i: list){
			System.out.println("List: "+i);
		}
	}
	
	public List<List<Integer>> get3Sum(int[] nums){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		if(nums == null || nums.length<3){
			return result;
		}
		Arrays.sort(nums);
		
		for(int i=0; i<nums.length-2; i++){
			if(i==0 || nums[i] > nums[i-1]){
				int j = i+1;
				int k = nums.length-1;
				
				while(j<k){
					if(nums[i]+nums[j]+nums[k] == 0){
						List<Integer>ls = new ArrayList<Integer>();
						ls.add(nums[i]);
						ls.add(nums[j]);
						ls.add(nums[k]);
						result.add(ls);
						j++;
						k--;
						
						while(j<k && nums[j] == nums[j-1])
							j++;
						while(j<k && nums[k] == nums[k+1])
							k--;
					}
					
					else if(nums[i]+nums[j]+nums[k]<0){
						j++;
					} else {
						k--;
					}
				}
			}
		}	
		return result;
	}

}
