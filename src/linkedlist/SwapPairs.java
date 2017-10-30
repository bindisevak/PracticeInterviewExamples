
package linkedlist;

public class SwapPairs {

	public static void main(String[] args) {
		
	}
	
	public LinkedList getPairs(LinkedList head){
		  LinkedList dummy = new LinkedList(0);
	        dummy.next = head;
	        
	        head = dummy;
	        while (head.next != null && head.next.next != null) {
	            LinkedList n1 = head.next, n2 = head.next.next;
	            // head->n1->n2->...
	            // => head->n2->n1->...
	            head.next = n2;
	            n1.next = n2.next;
	            n2.next = n1;
	            
	            // move to next pair
	            head = n1;
	        }
	        
	        return dummy.next;
	    }
}
