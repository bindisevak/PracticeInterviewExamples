package sort;

public class MergeSortedArray {
	public static void main(String[] args) {
		MergeSortedArray ms = new MergeSortedArray();
		int[] A = {1,5,2};
		int[] B = {7,3,4};
		int m = A.length;
		int n = B.length;
		ms.merge(A, m, B, n);
	}
	
	public void merge(int A[], int m, int B[], int n) {
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;
	 
		while (i >= 0 && j >= 0) {
			if (j < 0 || (i >= 0 && A[i] > B[j]))
				A[k--] = A[i--];
			else
				A[k--] = B[j--];
		}
		
		while(i >= 0){
			A[k--] = A[i--];
		}
		while(j >= 0){
			A[k--] = B[j--];
		}
	
		for(int l=0; l<k; l++){
			System.out.println(A[l]);
		}
	}
}
