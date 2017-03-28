package greedyAlgorithms;

public class JumpGame {
	public static void main(String[] args) {
		
	}
	
	public boolean canJump(int[] A){
		if(A.length <=1 )
			return true;
		
		int max = A[0];
		for(int i=0; i<A.length; i++){
			if(max <= i && A[i] == 0)
				return false;
			if(i+A[i] > max){
				max = i + A[i];
			}
			if(max > A.length-1)
				return true;
		}
		return false;
	}
	
	public int canJump1(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
	 
		int lastReach = 0;
		int reach = 0;
		int step = 0;
	 
		for (int i = 0; i <= reach && i < nums.length; i++) {
			//when last jump can not read current i, increase the step by 1
			if (i > lastReach) {
				step++;
				lastReach = reach;
			}
			//update the maximal jump 
			reach = Math.max(reach, nums[i] + i);
		}
	 
		if (reach < nums.length - 1)
			return 0;
	 
		return step;
	}
}
