package arrays;

public class RemoveElement {
	public static void main(String[] args) {
		RemoveElement rm = new RemoveElement();
		int[] arr = {1,2,3,4};
		int ans = rm.removeElem(arr, 2);
		System.out.println("Length: "+ans);
	}
	
	public int removeElem(int[] a, int x){
		int i=0;
		int j=0;
		
		while(j<a.length){
			if(a[j] != x){
				a[i] = a[j];
				i++;
			}
			j++;
		}
		return i;
	}
}
