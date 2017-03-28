package strings;

public class ShortestPalindrome {
	public static void main(String[] args) {
		System.out.println("Result: "+getPalindrome("aacecaaa"));
	}
	
	public static String getPalindrome(String s){
		int i=0; 
		int j=s.length()-1;
		
		while(j>=0){
			if(s.charAt(i) == s.charAt(j)){
				i++;
				//System.out.println(i);
			}
			j--;
		}
		if(i == s.length())
			return s;
		//System.out.println(i);
		String suffix = s.substring(i);
		String prefix = new StringBuilder(suffix).reverse().toString();
		String mid = getPalindrome(s.substring(0, i));
		return prefix+mid+suffix;
	}
}
