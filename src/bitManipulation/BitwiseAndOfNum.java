package bitManipulation;

public class BitwiseAndOfNum {
	public static void main(String[] args) {
		
	}
	
	public int rangeBitwiseAnd(int m, int n){
		while(n>m){
			n = n & n - 1;
		}
		return m & n;
	}
}
