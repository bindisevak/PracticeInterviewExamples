package arrays;

import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args) {
		TwoSum sum = new TwoSum();
		int[] arr = {4,5,11,15};
		int target = 9;
		int[] result = sum.getTwoSum(arr, target);
		for(int i: result){
			System.out.println("Result: " +i);
		}
	}
	public int[] getTwoSum(int[] arr, int target){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		
		for(int i=0; i<arr.length; i++){
			if(map.containsKey(arr[i])){
				int index = map.get(arr[i]);
				result[0] = index+1;
				result[1] = i+1;
				//break;
			} else {
				map.put(target - arr[i], i);
			}
		}
		return result;
	}

}
