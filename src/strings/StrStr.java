package strings;

public class StrStr {
	public static void main(String[] args) {
		StrStr st = new StrStr();
		String haystack = "bnjabc";
		String needle = "abc";
		int result = st.getStrStr(haystack, needle);
		int result1 = st.getStrStr1(haystack, needle);
		System.out.println("Result: "+result1);
	}
	
	public int getStrStr(String haystack, String needle){
		for(int i=0;;i++){
			for(int j=0;;j++){
				if(j == needle.length())
					return i;
				if(i+j == haystack.length())
					return -1;
				if(needle.charAt(j) != haystack.charAt(i+j))
					break;
			}
		}
	}
	
	public int getStrStr1(String haystack, String needle){
		if(haystack == null || needle == null)
			return -1;
		if(haystack.length() == 0 || needle.length() == 0)
			return 0;
		return haystack.indexOf(needle);
	}
}
