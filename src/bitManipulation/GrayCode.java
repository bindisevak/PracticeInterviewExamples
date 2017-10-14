package bitManipulation;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
	public static void main(String[] args) {
		
	}
	
	 public List<Integer> getGrayCode(int n) {
	        List<Integer> result = new ArrayList<Integer>();
	         
	        if (n == 0) {
	            result.add(0);
	            return result;
	        }
	         
	        List<Integer> lastGray = getGrayCode(n - 1);
	        int addOnNum = 1 << (n - 1);
	         
	        result.addAll(lastGray);
	         
	        for (int i = lastGray.size() - 1; i >= 0; i--) {
	            result.add(lastGray.get(i) + addOnNum);
	        }
	         
	        return result;
	    }
}

//static List<Pair> solve(List<Pair> lunchMenuPairs, List<Pair> teamCuisinePreferencePairs){
//	List<Pair> result= new ArrayList<>();
//
//	Map<String, List<String>> lunchCategories = new HashMap<>();
//	
//	for(Pair pairItr: lunchMenuPairs){
//	    if(lunchCategories.containsKey(pairItr.getPairValue())){
//	        List<String> menuList = lunchCategories.get(pairItr.getPairValue());
//	        menuList.add(pairItr.getPairKey());
//	        lunchCategories.put(pairItr.getPairValue(), menuList);
//	    } else {
//	       List<String> menuList = new ArrayList<>();
//	        menuList.add(pairItr.getPairKey()); 
//	        lunchCategories.put(pairItr.getPairValue(), menuList);
//	    }
//	    
//	}
//	
//	for(Pair pairItr: teamCuisinePreferencePairs){
//	    if(pairItr.getPairValue().equalsIgnoreCase("*")){
//	       for(String cusine: lunchCategories.keySet()) {
//	           List<String> menuList = lunchCategories.get(cusine);
//	           for(String menu: menuList){
//	               Pair pairItem = new Pair(pairItr.getPairKey(), menu);
//	               result.add(pairItem);
//	           }
//	       }
//	    }
//	   else if(lunchCategories.containsKey(pairItr.getPairValue())){
//	       List<String> menuList = lunchCategories.get(pairItr.getPairValue());
//	       for(String menu: menuList){
//	               Pair pairItem = new Pair(pairItr.getPairKey(), menu);
//	               result.add(pairItem);
//	           }
//	    }
//	    
//	    
//	}
//
//	return result;
//}
