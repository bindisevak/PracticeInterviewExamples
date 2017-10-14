package arrays;

public class CandyProblem {
	public static void main(String[] args) {
		CandyProblem cp = new CandyProblem();
		int[] ratings = {2,4,2,6,1,7,8,9,2,1};
		int sum = cp.getCandy(ratings);
		System.out.println("Sum of candies: " +sum);
	}
	
	public int getCandy(int[] ratings){
		if(ratings == null || ratings.length == 0){
			return 0;
		}
		int[] candies = new int[ratings.length];
		candies[0] = 1;
		
		for(int i=1; i<ratings.length; i++){
			if(ratings[i]>ratings[i-1]){
				candies[i] = candies[i-1]+1;
			} else {
				candies[i] =1;
			}
		}
		
		for(int i = ratings.length-2; i>=0; i--){
			if(ratings[i]>ratings[i+1]){
				candies[i] = Math.max(candies[i+1]+1, candies[i]);
			} 

		}
		int result = 0;
		for(int i=0; i<ratings.length; i++){
			result += candies[i]; 
		}
		return result;
	}
}
