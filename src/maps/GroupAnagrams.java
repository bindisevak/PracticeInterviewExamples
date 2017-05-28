package maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class GroupAnagrams {
	public static void main(String[] args) {
		String[] arr = {"eat","eat","tea","tan","ate","nat","bat"};
		String[] result;// = new ArrayList<List<String>>();
		GroupAnagrams gp = new GroupAnagrams();
		//String[] arr1 = gp.getAnagrams(arr);
		result = gp.getAnagrams(arr);
		for(String i: result){
			System.out.println(i);
		}
	}
	public String[] getAnagrams(String[] strs){
		List<List<String>> result = new ArrayList<List<String>>();
		HashMap<String, List<String>> helper = new HashMap<String, List<String>>();
		 HashSet<String> set = new HashSet<String>();
		Arrays.sort(strs);
		
		for(int i=0; i<strs.length; i++){
			if(!set.contains(strs[i])){
		     	set.add(strs[i]);
				char[] strChar = strs[i].toCharArray();
				Arrays.sort(strChar);
				String str = new String(strChar);
				if(helper.containsKey(str)){
					helper.get(str).add(strs[i]);
				} else {
					List<String> curr = new ArrayList<String>();
					curr.add(strs[i]);
					helper.put(str, curr);
				}
			}
		}
		
		for(List<String> val: helper.values()){
			result.add(val);
		}
		 String[] strArray =  new String[result.size()];
	      	int index = 0; 
		 for(List<String> strArrayItr : result){
	       	String reference = "";
	 
	       	for(String ref:strArrayItr){
	       	reference+=ref+" ";
	       	}
	       	reference = reference.trim();
	       
	        strArray[index]=reference;
	        index=index+1;
	        
	       }
	
	       return strArray;
	}
	

}
