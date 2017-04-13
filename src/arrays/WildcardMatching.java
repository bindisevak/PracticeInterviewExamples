package arrays;

public class WildcardMatching {
	public static void main(String[] args) {
		String s = "aabb";
		String p = "*abc";
		WildcardMatching wm = new WildcardMatching();
		System.out.println(wm.isMatch(s, p));
	}
	
	public boolean isMatch(String s, String p){
		int i = 0;
		int j = 0;
		int startIndex = -1;
		int iIndex = -1;
		
		while(i<s.length()){ 
			if(j < p.length() && (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))){
				++i;
				++j;
			} else if(j < p.length() && p.charAt(j) == '*') {
				startIndex = j;
				iIndex = i;
				j++;
			} else if(startIndex != -1){
				j = startIndex + 1;
				i = iIndex + 1;
				iIndex++;
			} else {
				return false;
			}
			System.out.println("i:"+i);
			System.out.println("j:"+j);
		}
		while(j<p.length() && p.charAt(j) == '*'){
			++j;
		}
		return j == p.length();
	}
}
