package strings;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] str = {"foo", "foobar", "foobarhello"};
		System.out.println("Result: "+getLCP(str));
	}
	
	public static String getLCP(String[] str){
		if(str == null || str.length == 0){
			return "";
		}
		String result = "";
		int idx = 0;
		
		while(true){
			char thisLetter = 0;
			for(String word: str){
				if(idx == word.length())
					return result;
				if(thisLetter == 0)
					thisLetter = word.charAt(idx);
				if(thisLetter != word.charAt(idx))
					return result;
				System.out.println(word);
			}
			System.out.println(thisLetter);
			result = result + thisLetter;
			idx++;
		}
	}
}
