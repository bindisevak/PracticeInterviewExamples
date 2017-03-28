package bitManipulation;

public class MissingNumber {
	public static void main(String[] args) {
		MissingNumber mn = new MissingNumber();
		int[] nums = {1,2,4,5};
		int n = nums.length;
		System.out.println("Result: "+mn.getMissing(nums, n));
	}
	
	public int getMissing(int[] a, int n){
		 int i;
		    int x1 = a[0]; /* For xor of all the elements in array */
		    int x2 = 1; /* For xor of all the elements from 1 to n+1 */
		     
		    for (i = 1; i< n; i++)
		        x1 = x1^a[i];
		            
		    for ( i = 2; i <= n+1; i++)
		        x2 = x2^i;         
		    
		    return (x1^x2);
	}
}
