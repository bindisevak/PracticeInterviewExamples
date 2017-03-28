package strings;

public class LengthOfLastWord {
	public static void main(String[] args) {
		LengthOfLastWord ls = new LengthOfLastWord();
		String s = "Hello World hellop";
		System.out.println("Result: "+getLength(s));
		System.out.println("Result1: "+ls.getLength1(s));
	}
	
	public static int getLength(String s){
		if(s==null || s.length()==0){
			return 0;
		}
		
		char[] str = s.toCharArray();
		int count = 0;
		for(int i=str.length-1; i>=0; i--){
			if(str[i] >= 'a' && str[i] <= 'z' || str[i] >= 'A' && str[i] <= 'Z'){
				count++;
			}
			if(str[i] == ' '){
				if(count == 0)
					continue;
				else
					return count;
			}
		}
		return count;
	}
	
	public int getLength1(String s){
		if(s==null || s.length() == 0 || s.trim().isEmpty()){
			return 0;
		}
		String[] arr = s.split(" ");
		return arr[arr.length-1].length();
		
	}
}
