package stack;

import java.util.Stack;

public class BasicCalculator {
	public static void main(String[] args) {
		
	}
	
	public int calculate(String s){
		if(s == null || s.length() == 0)
			return 0;
		
		String delim = "[ ]+";
		s.replaceAll(delim, "");
		
		Stack<Integer> numStack = new Stack<Integer>();
		Stack<Character> opStack = new Stack<Character>();
		
		for(int i=0; i<s.length(); i++){
			char elem = s.charAt(i);
			if(Character.isDigit(elem)){
				int num = elem - '0';
				int j = i+1;
				
				while(j<s.length() && Character.isDigit(s.charAt(j))){
					num = num*10 + (s.charAt(j)-'0');
					j++;
				}
				numStack.push(num);
				i = j-1;
			} else { //operator
				if(opStack.isEmpty()){
					opStack.push(elem);
				} else if(elem == '*' || elem == '/'){
					char top = opStack.peek();
					if(top =='('){
						opStack.push(elem);
					}else if(top == '+' || top == '-'){
						opStack.push(elem);
					} else {
						compute(numStack, opStack);
						opStack.push(elem);
					}
				} else if(elem == '+' || elem == '-'){
					char top = opStack.peek();
					if(top =='('){
						opStack.push(elem);
					} else {
						compute(numStack, opStack);
						opStack.push(elem);
					}
				} else if(elem == '('){
					opStack.push(elem);
				} else if(elem == ')'){
					while(!opStack.isEmpty() && opStack.peek() != '('){
						compute(numStack, opStack);
					}
					opStack.pop();
				}
			}
		}
		while(!opStack.isEmpty()){
			compute(numStack, opStack);
		}
		return numStack.pop();
	}

	private void compute(Stack<Integer> numStack, Stack<Character> opStack) {
		if (numStack.size() < 2) {
            while (!opStack.isEmpty()) {
                opStack.pop();
            }
            return;
        }
         
        int num2 = numStack.pop();
        int num1 = numStack.pop();
         
        char op = opStack.pop();
        int ans = 0;
         
        switch(op) {
            case '+': ans = num1 + num2;
            break;
             
            case '-': ans = num1 - num2;
            break;
             
            case '*': ans = num1 * num2;
            break;
             
            case '/': ans = num1 / num2;
            break;
        }
         
        numStack.push(ans);
		
	}
}
