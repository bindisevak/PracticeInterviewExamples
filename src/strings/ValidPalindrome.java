package strings;

import java.util.Stack;

public class ValidPalindrome {
	public static void main(String[] args) {
		ValidPalindrome vp = new ValidPalindrome();
		String s = "Red rum, sir, is murder";
		System.out.println("Result: "+vp.isPalin(s));
	}
	
	public boolean isPalin(String s){
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		System.out.println(s);
		int len = s.length();
		if(len<2){
			return true;
		}
		
		Stack<Character> stack = new Stack<Character>();
		
		int index = 0;
		while(index<len/2){
			stack.push(s.charAt(index));
			index++;
		}
		if(len % 2 == 1){
			index++;
		}
		while(index < len){
			if(stack.empty())
				return false;
			
			char tmp = stack.pop();
			if(s.charAt(index) != tmp)
				return false;
			else
				index++;
		}
		return true;
	}
}
