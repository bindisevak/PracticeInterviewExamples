package arrays;

public class IncreasingTriplet {
	public static void main(String[] args) {
		IncreasingTriplet it = new IncreasingTriplet();
		int[] nums = {1,2,3,4,5};
		System.out.println("Result: "+it.getSubsequence(nums));
	}
	
	public boolean getSubsequence(int[] nums){
		int x = Integer.MAX_VALUE;
		int y = Integer.MAX_VALUE;
		
		for(int i=0; i<nums.length; i++){
			int z = nums[i];
			if(x >= z)
				x = z;
			else if(y >= z)
				y = z;
			else
				return true;
		}
		return false;
	}
}
