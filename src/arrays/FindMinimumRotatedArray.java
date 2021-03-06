package arrays;

public class FindMinimumRotatedArray {
	public static void main(String[] args) {
		int[] arr = {4,5,6,7,0,1,2};
		System.out.println("Minimum: "+findMin1(arr,0,6));
	}
	
	public static int findMin(int[] nums){
		if(nums == null || nums.length == 0)
			return -1;
		
		if(nums.length == 1)
			return nums[0];
		
		int left = 0;
		int right = nums.length-1;
		
		if(nums[left]<nums[right])
			return nums[left];
		
		while(left<=right){
			if(right-left == 1){
				return nums[right];
			}
			int m = left + (right-left)/2;
			if(nums[m] > nums[right])
				left = m;
			else
				right = m;
		}
		return nums[left];
	}
	
	
	public static int findMin1(int[] num, int left, int right) {
		if (left == right)
			return num[left];
		if ((right - left) == 1)
			return Math.min(num[left], num[right]);
	 
		int middle = left + (right - left) / 2;
	 
		// not rotated
		if (num[left] < num[right]) {
			return num[left];
	 
		// go right side
		} else if (num[middle] > num[left]) {
			return findMin1(num, middle, right);
	 
		// go left side
		} else {
			return findMin1(num, left, middle);
		}
	}
}
