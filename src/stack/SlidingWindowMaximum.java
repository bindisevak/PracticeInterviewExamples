package stack;

import java.util.LinkedList;

public class SlidingWindowMaximum {
	public static void main(String[] args) {
		SlidingWindowMaximum sw = new SlidingWindowMaximum();
		int[] nums = {4,2,5,3,7,9};
		//int[] nums = {1,3,5,6,4,9,14,17,4,22,16,31,15};
		int k = 4;
		int[] result = sw.maxSlidingWindow(nums, k);
		for(int i: result){
			System.out.println(i);
		}
	}
	
	public int[] maxSlidingWindow(int[] nums, int k) {
	    if(nums==null||nums.length==0)
	        return new int[0];
	 
	    int[] result = new int[nums.length-k+1];
	 
	    LinkedList<Integer> deque = new LinkedList<Integer>();
	    for(int i=0; i<nums.length; i++){
//	        if(!deque.isEmpty()&&deque.peekFirst()==i-k) 
//	            deque.poll();
	 
	        while(!deque.isEmpty()&&nums[deque.peekLast()]<nums[i]){
	            deque.removeLast();
	        }    
	 
	        deque.offer(i);
	 
	        if(i+1>=k)
	            result[i+1-k]=nums[deque.peek()];
	    }
	 
	    return result;
	}
}
