package arrays;

public class RemoveDupInPlace2 {
	public static void main(String[] args) {
		RemoveDupInPlace rm = new RemoveDupInPlace();
		int[] arr = {1,2,2,3,3,3,4};
		int ans = rm.removeDup(arr);
		System.out.println("Length: "+ans);
	}
	
	public int removeDup(int[] a){
		if(a.length<3){
			return a.length;
		}
		int prev = 1;
		int curr = 2;
		
		while(curr<a.length){
			if(a[curr] == a[prev] && a[curr] == a[prev-1]){
				curr++;
			} else {
				prev++;
				a[prev] = a[curr];
				curr++;
			}
		}
		return prev+1;
	}
}
