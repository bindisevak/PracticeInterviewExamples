
package matrix;

public class ClockwiseRoatation {
	public static void main(String[] args) {
		ClockwiseRoatation ck = new ClockwiseRoatation();
		int matrix[][]={{50,60,55,67},{62,65,70,71},{72,66,77,80}, {1,2,3,4}};
		ck.rotate(matrix);
	}
	
	public void rotate(int[][] matrix){
		int n = matrix.length;
		int halfN;
		if(n%2 == 0){
			halfN = n/2;
		} else {
			halfN = n/2+1;
		}
		//for layers
		for(int i=0; i<halfN; i++){
			for(int j=i; j<n-i-1; j++){
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[n-j-1][i];
				matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
				matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
				matrix[j][n-j-1] = tmp;
			}
		}
		
		for(int[]row: matrix){
			for(int i: row){
				System.out.print(i);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
