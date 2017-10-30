package stack;

import java.util.Stack;

public class SortStackRecursion {
	public static void main(String[] args) {
		
	}
	
	static void sortStack(Stack<Integer> s){
		if(!s.isEmpty()){
			int x = s.pop();
			sortStack(s);
			sortedInsert(s,x);
		}
	}

	static void sortedInsert(Stack<Integer> s, int x) {
		if(s.isEmpty() || x>s.peek()){
			s.push(x);
		}
		else {
			int tmp = s.pop();
			sortedInsert(s,x);
			s.push(tmp);
		}
		
	}
}
