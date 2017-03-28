package divideAndConquer;


public class FndMedianSortedArrays {
	public static void main(String[] args) {
		
	}
	
	public double getMedian(int[] num1, int[] num2){
		int total = num1.length+num2.length;
		if(total % 2 == 0){
			return (findKth(total/2+1, num1,num2,0,0) + findKth(total/2, num1,num2,0,0))/2.0;
		}else{
			return findKth(total/2+1, num1,num2,0,0);
		}
	}

	private int findKth(int k, int[] num1, int[] num2, int s1, int s2) {
		if(s1 >= num1.length)
			return num2[s2+k-1];
		if(s2 >= num2.length)
			return num1[s1+k-1];
		if(k==1)
			Math.min(num1[s1], num2[s2]);
		
		int m1 = s1+k/2-1;
		int m2 = s2+k/2-1;
		
		int mid1 = m1<num1.length?num1[m1]:Integer.MAX_VALUE;
		int mid2 = m2<num2.length?num2[m2]:Integer.MAX_VALUE;
		
		if(mid1<mid2){
			return findKth(k-k/2, num1, num2, m1+1, s2);
		}else{
			return findKth(k-k/2, num1, num2, s1, m2+1);
		}
	}
	
}
