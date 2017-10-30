package arrays;

public class PermutationNumbers {
	
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6};
		permute(0, a);    
	}
	
	public  static void permute(int start, int[] input ) {
	        if (start == input.length) {
	            //System.out.println(input);
	            for(int x: input){
	            System.out.print(x);
	        }
	        System.out.println("");
	        return;
	    }
	    for (int i = start; i < input.length; i++) {
	        // swapping
	        int temp = input[i];
	        input[i] = input[start];
	        input[start] = temp;
	       // System.out.println("temp: "+temp);
	       // swap(input[i], input[start]);
	
	        permute(start + 1, input);
	       // swap(input[i],input[start]);
	
	        int temp2 = input[i];
	        input[i] = input[start];
	        input[start] = temp2;
	        //System.out.println("temp2: "+temp2);
	    }
	}
}
