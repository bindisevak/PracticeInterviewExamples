package linkedlist;

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) {
//        val = x;
//        next = null;
//    }
//}
public class RemoveDuplicates {
	public static void main(String[] args) {
		
	}
	
	public ListNode deleteDup(ListNode head){
		ListNode current = head;
		while(current != null && current.next != null){
			if(current.next.val == current.val){
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		return head;
	}
	
	public ListNode deleteDup1(ListNode head){
		if (head == null) {
            return head;
        }
		ListNode dummyHead = new ListNode(0);
		dummyHead.next = head;
		ListNode node = dummyHead;
		
		while(node.next != null && node.next.next != null){
			if(node.next.val == node.next.next.val){
				int dupVal = node.next.val;
				while(node.next != null && node.next.next.val == dupVal){
					node.next = node.next.next;
				}
			} else {
				node = node.next;
			}
		}
		return dummyHead.next;
	}
}
