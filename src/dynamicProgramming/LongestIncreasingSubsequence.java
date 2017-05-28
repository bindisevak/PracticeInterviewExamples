package dynamicProgramming;

import java.util.ArrayList;

public class LongestIncreasingSubsequence {
	public static void main(String[] args) {
		int[] nums = {1,4,2,3,5,6,7};
		LongestIncreasingSubsequence ls = new LongestIncreasingSubsequence();
		System.out.println("Result: "+ls.lengthOfLIS(nums));
		System.out.println("Result: "+ls.lengthOfLIS2(nums));
	}
	
	public int lengthOfLIS(int[] nums) {
	    if(nums==null || nums.length==0)
	        return 0;
	 
	    ArrayList<Integer> list = new ArrayList<Integer>(); 
	 
	    for(int num: nums){
	        if(list.size()==0 || num>list.get(list.size()-1)){
	            list.add(num);
	        }else{  // replace the element in the list which is the smallest but bigger than num
	            int i=0; 
	            int j=list.size()-1;
	 
	            while(i<j){
	                int mid = (i+j)/2;
	                if(list.get(mid) < num){
	                    i=mid+1;
	                }else{
	                    j=mid;
	                }
	            }
	 
	            list.set(j, num);
	        }
	    }
	    
	    return list.size();
	}
	/*
	 * 1
	 * 14
	 * 12
	 * 123
	 * 1235
	 * 12356
	 * 123567
	 */
	
	public int lengthOfLIS2(int[] nums) {
	    if(nums==null || nums.length==0)
	        return 0;
	 
	    int[] max = new int[nums.length];
	 
	    for(int i=0; i<nums.length; i++){
	        max[i]=1;
	        for(int j=0; j<i;j++){
	            if(nums[i]>nums[j]){
	                max[i]=Math.max(max[i], max[j]+1);
	            }
	        }
	    }
	 
	    int result = 0;
	    for(int i=0; i<max.length; i++){
	        if(max[i]>result)
	            result = max[i];
	    }
	    return result;
	}
}
