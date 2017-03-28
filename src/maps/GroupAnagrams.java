package maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	public static void main(String[] args) {
		String[] arr = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> result = new ArrayList<List<String>>();
		GroupAnagrams gp = new GroupAnagrams();
		result = gp.getAnagrams(arr);
		for(List<String> i: result){
			System.out.println(i);
		}
	}
	public List<List<String>> getAnagrams(String[] strs){
		List<List<String>> result = new ArrayList<List<String>>();
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		Arrays.sort(strs);
		
		for(int i=0; i<strs.length; i++){
			char[] strChar = strs[i].toCharArray();
			Arrays.sort(strChar);
			String str = new String(strChar);
			if(map.containsKey(str)){
				map.get(str).add(strs[i]);
			} else {
				List<String> list = new ArrayList<String>();
				list.add(strs[i]);
				map.put(str, list);
			}
		}
		
		for(List<String> val: map.values()){
			result.add(val);
		}
		return result;
	}
}
