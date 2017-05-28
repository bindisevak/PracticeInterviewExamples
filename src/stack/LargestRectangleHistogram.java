package stack;

import java.util.Stack;

public class LargestRectangleHistogram {
	public static void main(String[] args) {
		LargestRectangleHistogram lr = new LargestRectangleHistogram();
		int[] nums = {2,1,5,6,2,3};
		System.out.println("Area: "+lr.getLargestArea(nums));
	}
	
	public int getLargestArea(int[] height){
		if(height == null || height.length == 0){
			return 0;
		}
		
		Stack<Integer> stack = new Stack<Integer>();
        int max = 0;
        for (int i = 0; i <= height.length; i++) {
            int curt = (i == height.length) ? -1 : height[i];
            while (!stack.isEmpty() && curt <= height[stack.peek()]) {
            	System.out.println(stack.peek());
            	int h = height[stack.pop()];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(max, h * w);
            }
            stack.push(i);
            //System.out.println(stack.peek());
        }
        
        return max;
	}
}
