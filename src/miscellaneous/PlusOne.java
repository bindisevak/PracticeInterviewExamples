package miscellaneous;

public class PlusOne {
	public static void main(String[] args) {
		int[] arr = {9,9,9};
		int[] result = new int[arr.length+1];
		PlusOne pl = new PlusOne();
		result = pl.plusOne(arr);
		for(int i: result)
		{
			System.out.println(i);
		}
	}
	public int[] plusOne(int[] digits) {
	    if(digits==null||digits.length==0)
	        return new int[0];
	 
	    int carry = 1;    
	    for(int i=digits.length-1; i>=0; i--){
	        int sum = digits[i]+carry;
	        if(sum>=10){
	            carry=1;
	        }else{
	            carry=0;
	        }
	        digits[i]=sum%10;
	        //System.out.print(digits[i]);
	    }
	 System.out.println(carry);
	    if(carry==1){
	        int[] result = new int[digits.length+1];
	        System.arraycopy(digits, 0, result, 1, digits.length);
	        result[0]=1;
	        return result;
	    }else{
	        //int[] result = new int[digits.length];
	        return digits;
	    }
	}
}
