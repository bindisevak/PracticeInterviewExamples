package stack;

import java.util.Stack;

public class LongestValidParantheses {
	public static void main(String[] args) {
		LongestValidParantheses lv = new LongestValidParantheses();
		String s = "((())))";
		System.out.println("Result length: "+lv.getLongest(s));
	}
	
	public int getLongest(String s){
		if(s == null || s.length() < 2){
			return 0;
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		int max = 0;
		int start = 0;
		
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) == '('){
				stack.push(i);
			} else {
				if(stack.isEmpty()){
					start = i+1;
				} else{
					stack.pop();
					if(stack.isEmpty())
						max = Math.max(max, i-start+1);
					else
						max = Math.max(max, i-stack.peek());
				}
			}
		}
		return max;
	}
}
