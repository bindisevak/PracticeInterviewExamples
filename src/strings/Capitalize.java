package strings;

public class Capitalize {
	public static void main(String[] args) {
		 
	      String str1 = "this sentence needs to be capitalized";
	      char[] chars = str1.toCharArray();
	 
	      // all ways make first char a cap
	      chars[0] = Character.toUpperCase(chars[0]);
	 
	      // then capitalize if space on left.
	      for(int x=1; x<chars.length; x++) {
	         if(chars[x-1] == ' '){
	            chars[x] = Character.toUpperCase(chars[x]);
	         } 
	      }
	 
	      String str2 = new String(chars);
	 
	      System.out.println(str1);
	      System.out.println(str2);
	   }
}
