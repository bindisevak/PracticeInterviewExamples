package strings;

import java.util.ArrayList;

public class Paths {
	public static void main(String[] args) {
		System.out.println("Path: "+simplifyPath("/a/./b/../../c/"));
	}
	
	public static String simplifyPath(String path){
		String result = "/";
		String[] stubs = path.split("/+");
		ArrayList<String> paths = new ArrayList<String>();
		for(String s: stubs){
			System.out.println(s);
			if(s.equals("..")){
				if(paths.size() > 0){
					paths.remove(paths.size() - 1);
				}
			} else if(!s.equals(".") && !s.equals("")){
				paths.add(s);
			}
		}
		for(String s: paths){
			result += s + "/";
		}
		if(result.length() > 1){
			result = result.substring(0, result.length()-1);
		}
		return result;
	}
}
