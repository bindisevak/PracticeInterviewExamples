package codazen;

import java.util.Comparator;

public class StudentSorting {
	
	public static<T> void sort(T []a, Comparator<? super T>comparator){
	
		        mSort(a,0, a.length-1, comparator);
		    }
	
	 public static<T> void mSort(T []a,int lower,int upperPtr, Comparator<? super T>comparator){
		 
		         if(lower == upperPtr){
		 
		             return;
		 
		         }else{
		 
		             int mid = (lower+upperPtr)/2;
		 
		             mSort(a,lower,mid,comparator);
		 
		             mSort(a,mid+1, upperPtr,comparator);
		 	 
		                 mergeAsc(a,lower,mid+1,upperPtr,comparator);
		 	 
		         }
		 
		     }
	 
	 public static<T> void mergeAsc(T []a,int lowerPtr,int higerPtr,int upperPtr,Comparator<? super T>comparator){
		 
		         Object []tempArr = new Object[a.length];
		 
		         int tempI=0;
		 
		         int lower = lowerPtr;
		 
		         int mid = higerPtr-1;
		 
		         int totalItems = upperPtr-lower+1;
		 
		         while(lower <= mid && higerPtr <= upperPtr){
		 
		        	 if(comparator.compare(a[lower],a[higerPtr]) == 0){
		        		 
		                 System.out.println("ALL Properties can't be same");
		                 break;
		 
		             }else if(comparator.compare(a[lower],a[higerPtr]) < 0){
		 
		                 tempArr[tempI++] = a[lower++];
		 
		             }else{
		 
		                 tempArr[tempI++] = a[higerPtr++];
		 
		             }
		 
		         }
		 
		  
		 
		         while(lower <= mid){
		 
		             tempArr[tempI++] = a[lower++];
		 
		         }
		 
		  
		 
		         while(higerPtr <= upperPtr){
		 
		             tempArr[tempI++] = a[higerPtr++];
		 
		         }
		 
		  
		 
		         for(int i=0;i<totalItems;i++){
		 
		             a[lowerPtr+i] = (T) tempArr[i];
		 
		         }
		 
		     }
	 
//	 private static Object[] gettempArr(int length){
//		 
//		         Object []tempArr = new Object[length];
//		 
//		         return tempArr;
//		 
//		     }



}
