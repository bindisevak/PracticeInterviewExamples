package arrays;

import java.util.PriorityQueue;

public class KthSmallestElementInArray {
	public static int find(int [] A, int k){
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=0;i<A.length;i++){
			pq.offer(A[i]);
		}
		int n = -1;
		while(k>0){
			n = pq.poll();
			k--;
		}
		return n;
	}
	public static void main(String[] args) {
		int[] A = { 1, 2, 10, 20, 40, 32, 44, 51, 6 };
		int k = 4;
		System.out.println("4th smallest element:" + find(A,4));

	}
}
