package arrays;

public class MajorityElement {
	public static void main(String[] args) {
		MajorityElement me = new MajorityElement();
		int[] nums = {1,2,2,3,4,4,4};
		System.out.println("Majority element: "+me.getMajority(nums));
	}
	public int getMajority(int[] nums){
		int result = 0;
		int count = 0;
		
		for(int i=0; i<nums.length; i++){
			if(count == 0){
				result = nums[i];
				count = 1;
			} else if(result == nums[i]){
				count++;
			} else {
				count--;
			}
		}
		return result;
	}
}
