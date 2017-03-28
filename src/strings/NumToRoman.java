package strings;

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
}
