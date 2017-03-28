package arrays;

public class RotateArray {
	public static void main(String[] args) {
		
	}
	
	public static void rotate(int[] arr, int order){
		if(arr == null || arr.length == 0 || order < 0){
			throw new IllegalArgumentException("Illegeal Argument");
		}
		if(order > arr.length){
			order = order % arr.length;
		}
		int a = arr.length - order;
		reverse(arr, 0, a-1);
		reverse(arr, a, arr.length-1);
		reverse(arr, 0, arr.length-1);
	}

	private static void reverse(int[] arr, int left, int right) {
		if(arr == null || arr.length == 1)
			return;
		
		while(left < right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
	}
}
