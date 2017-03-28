package arrays;

public class KthLargest {
	public static void main(String[] args) {
		KthLargest kt = new KthLargest();
		int[] nums = {3,2,1,5,6,4};
		int k=2;
		System.out.println("Result: "+kt.findKthLargest(nums, k));
	}
	
	public int findKthLargest(int[] nums, int k){
		if(k < 1 || nums == null){
			return 0;
		}
		return getKth(nums.length-k+1, nums, 0, nums.length-1);
	}

	private int getKth(int k, int[] nums, int start, int end) {
		int pivot = nums[end];
		int left = start;
		int right = end;
		
		while(true){
			while(nums[left] < pivot && left<right){
				left++;
			}
			while(nums[right] >=pivot && right >left){
				right--;
			}
			if(left == right){
				break;
			}
			swap(nums, left, right);
		}
		swap(nums,left,right);
		
		if(k == left+1){
			return pivot;
		} else if(k < left+1){
			return getKth(k, nums, start, left-1);
		} else {
			return getKth(k, nums, left+1, end);
		}
	}

	private void swap(int[] nums, int left, int right) {
		int temp = nums[left];
		nums[left] = nums[right];
		nums[right] = temp;
		System.out.println("swap1: "+nums[left]);
		System.out.println("swap2: "+nums[right]);
		
	}
}
