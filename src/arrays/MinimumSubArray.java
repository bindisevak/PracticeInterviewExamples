package arrays;

public class MinimumSubArray {
	public static void main(String[] args) {
		MinimumSubArray arr = new MinimumSubArray();
		int[] nums = {2,3,1,2,4,3};
		int sum = 7;
		System.out.println("Result length: "+arr.getMinArrayLength(sum, nums));
	}
	
	public int getMinArrayLength(int sum, int[] nums){
		int minLen = Integer.MAX_VALUE;
		int currSum = 0;
		int start = 0;
		int end = 0;
		
		while(start < nums.length){
			if(currSum < sum && end < nums.length){
				currSum += nums[end];
				end++;
			}
			else if(currSum >= sum){
				minLen = Math.min(minLen, end-start);
				currSum -= nums[start];
				start++;
			}
			else{
				break;
			}
		}
		return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
	}
}
