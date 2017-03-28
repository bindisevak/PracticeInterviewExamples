package miscellaneous;

public class MoveZeroes {
	public static void main(String[] args) {
		int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        pushToEnd(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");

	}
	
	public static void pushToEnd(int [] arr, int n){
		int count = 0;
		
		for(int i=0; i<n; i++){
			if(arr[i] != 0){
				arr[count++] = arr[i];
				System.out.print(arr[count]);
			}
				
		}
		
			System.out.println(count);

		while(count < n){
			System.out.print(arr[count]);
			arr[count++] = 0;
		}
			
	}
}
