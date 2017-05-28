package dynamicProgramming;

//Obstacle Grid time: O(M*N) space: O(M*N)
public class UniquePaths {
	public static void main(String[] args) {
		int[][] arr = {{0,0,0},{0,1,0},{0,0,0}};
		UniquePaths up = new UniquePaths();
		int result = up.getUniquePaths(arr);
		System.out.println("Result: "+result);
	}
	public int getUniquePaths(int[][] grid){
		if(grid == null || grid.length == 0)
			return 0;
		
		int m = grid.length;
		int n = grid[0].length;
		
		if(grid[0][0] == 1|| grid[m-1][n-1] == 1)
			return 0;
		
		int[][] dp = new int[m][n];
		dp[0][0]=1;
		
		//left column
		for(int i=1; i<m; i++){
			if(grid[i][0] == 1)
				dp[i][0] = 0;
			else
				dp[i][0] = dp[i-1][0];
		}
		//top row
		for(int i=1; i<n; i++){
			if(grid[0][i] == 1)
				dp[0][i] = 0;
			else
				dp[0][i] = dp[0][i-1];
		}
		//fill up cells
		for(int i=1; i<m; i++){
			for(int j=1; j<n; j++){
				if(grid[i][j] == 1)
					dp[i][j] = 0;
				else
					dp[i][j] = dp[i-1][j] + dp[i][j-1];
				
			}	
			
		}
		return dp[m-1][n-1];
	}
}
