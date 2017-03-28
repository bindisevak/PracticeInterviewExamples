package arrays;

public class RemoveDupInPlace {
	public static void main(String[] args) {
		int[] arr = {1,1,2,3,3};
		RemoveDupInPlace rm = new RemoveDupInPlace();
		int ans = rm.removeDup(arr);
		System.out.println(ans);
	}
	
	public int removeDup(int[] a){
		if(a.length<2){
			return a.length;
		}
		int j=0;
		int i=1;
		
		while(i<a.length){
			if(a[i] == a[j]){
				i++;
			} else {
				j++;
				a[j]=a[i];
					i++;
				
			}
		}
		return j+1;
	}
}
