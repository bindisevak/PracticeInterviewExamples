package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	public static void main(String[] args) {
		FourSum fs = new FourSum();
		int[] nums = {1, 0, -1, 0, -2, 2};
		int target = 0;
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list = fs.get4Sum(nums, target);
		for(List<Integer> i: list){
			System.out.println("List: "+i);
		}
	}
	
	public List<List<Integer>> get4Sum(int[] nums, int target){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		if(nums == null || nums.length<3){
			return result;
		}
		Arrays.sort(nums);
		
		for(int i=0; i<nums.length-3; i++){
			if(i!=0 && nums[i] == nums[i-1])
				continue;
			for(int j=i+1; j<nums.length-2; j++){
				if(j!=i+1 && nums[j] == nums[j-1])
					continue;
				int k = j+1;
				int l = nums.length-1;
				
				while(k<l){
					if(nums[i]+nums[j]+nums[k]+nums[l] < target){
						k++;
					} else if(nums[i]+nums[j]+nums[k]+nums[l] > target){
						l--;
					} else{	
						List<Integer>ls = new ArrayList<Integer>();
						ls.add(nums[i]);
						ls.add(nums[j]);
						ls.add(nums[k]);
						ls.add(nums[l]);
						result.add(ls);
						k++;
						l--;
						
						while(k<l && nums[l] == nums[l+1])
							l--;
						while(k<l && nums[k] == nums[k-1])
							k++;
					}
					
					
				}
				
			}
		}	
		return result;
	}

}
