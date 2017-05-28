package strings;

import java.util.HashMap;

public class NumToRoman {
	public static void main(String[] args) {
		NumToRoman nr = new NumToRoman();
		int num = 5;
		String ans = nr.inttoRoman(num);
		System.out.println("Ans: "+ans);
	}
	
	public String inttoRoman(int num){
		String str = "";
		 String [] symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		 int [] value = {1000,900,500,400, 100, 90,  50, 40,  10, 9,   5,  4,   1};
		 
		 for(int i=0; num!=0; i++){
			 while(num >= value[i]){
				 num = num - value[i];
				 str = str+symbol[i];
			 }
		 }
		 return str;
	}
	
	public int romanToInt(String s) {
	    if (s == null || s.length()==0) {
                return 0;
	    }
	    HashMap<Character, Integer> m = new HashMap<Character, Integer>();
	    m.put('I', 1);
	    m.put('V', 5);
	    m.put('X', 10);
	    m.put('L', 50);
	    m.put('C', 100);
	    m.put('D', 500);
	    m.put('M', 1000);

	    int length = s.length();
	    int result = m.get(s.charAt(length - 1));
	    for (int i = length - 2; i >= 0; i--) {
	        if (m.get(s.charAt(i + 1)) <= m.get(s.charAt(i))) {
	            result += m.get(s.charAt(i));
	        } else {
	            result -= m.get(s.charAt(i));
	        }
	    }
	    return result;
	}
}
