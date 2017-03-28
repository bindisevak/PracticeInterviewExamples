package dynamicProgramming;

public class DistinctSubsequences {
	public static void main(String[] args) {
		String S = "rabbbit";
		String T = "rabbit";
		System.out.println("Result: "+numDistincts(S, T));
	}
	
//    #    r   a   b   b   i   t
//#   1    0   0   0   0   0   0
//r   1    1   0   0   0   0   0
//a   1    1   1   0   0   0   0
//b   1    1   1   1   0   0   0
//b   1    1   1   2   1   0   0
//b   1    1   1   3   3   0   0
//i   1    1   1   3   3   3   0
//t   1    1   1   3   3   3   3 
	
	public static int numDistincts(String S, String T){
		int[][]table = new int[S.length()+1][T.length()+1];
		
		for(int i=0; i<S.length(); i++){
			table[i][0] = 1;
			System.out.print(table[i][0]);
			
		}
		System.out.println();
		for(int i=1; i<=S.length(); i++){
			for(int j=1; j<=T.length(); j++){
				if(S.charAt(i-1) == T.charAt(j-1)){
					table[i][j] = table[i-1][j] + table[i-1][j-1];
				}else{
					table[i][j] = table[i-1][j];
				}
				System.out.print(table[i][j]);
				
			}
			System.out.println();
		}
		return table[S.length()][T.length()];
			
	}
}
