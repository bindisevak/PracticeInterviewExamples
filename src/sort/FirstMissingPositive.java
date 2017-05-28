package sort;

public class FirstMissingPositive {
	public static void main(String[] args) {
		int[] A = {3,4,-1,1};
		int[] B= {2,0,1};
		System.out.println("Result: "+getFirstMissing(A));
		System.out.println("Result: "+getFirstMissing(B));
	}
	
	
	public static int getFirstMissing(int[] A){
		if(A == null || A.length == 0)
			return 1;
		
		for(int i=0; i<A.length; i++){
			if(A[i] <= A.length && A[i]>0 && A[A[i]-1] != A[i]){
				int tmp = A[A[i]-1];
				A[A[i]-1] = A[i];
				A[i] = tmp;
				i--;
			}
		}
		for(int i=0; i<A.length; i++){
			if(A[i] != i+1)
				return i+1;
		}
		return A.length+1;
	}
}
