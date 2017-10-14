 package linkedlist;

import linkedlist.LinkedList.Node;

class LinkedList {
	 
    public int val;
	public LinkedList next;
	public LinkedList(int i) {
		// TODO Auto-generated constructor stub
	}
	public LinkedList() {
		// TODO Auto-generated constructor stub
	}
	static Node head;

    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
}  
public  class AddTwoNumbers {
	public static void main(String[] args) {
		LinkedList lt = new LinkedList();
		lt.head = new Node(50);
        lt.head.next = new Node(20);
        lt.head.next.next = new Node(15);
        lt.head.next.next.next = new Node(4);
        lt.head.next.next.next.next = new Node(10);
        
		LinkedList lt1 = new LinkedList();
		lt1.head = new Node(50);
        lt1.head.next = new Node(20);
        lt1.head.next.next = new Node(15);
        lt1.head.next.next.next = new Node(4);
        lt1.head.next.next.next.next = new Node(10);
        
        AddTwoNumbers am = new AddTwoNumbers();
        LinkedList lst = am.getList(lt, lt1);
        while(lst != null){
        	System.out.println(lst.val);
        	lst = lst.next;
        }
	}
	public LinkedList getList(LinkedList l1, LinkedList l2){
		  int carry =0;
		  
		  LinkedList newHead = new LinkedList(0);
		  LinkedList p1 = l1, p2 = l2, p3=newHead;
	 
	        while(p1 != null && p2 != null){
	        	int sum = carry + p1.val+p2.val;
	        	p1 = p1.next;
	        	p2 = p2.next;
	            p3.next = new LinkedList(sum%10);
	            p3 = p3.next;
	            carry = sum/10;
	        }
	        while(p1 != null){
	        	int sum = carry + p1.val;
	        	p1 = p1.next;
	            p3.next = new LinkedList(sum%10);
	            p3 = p3.next;
	            carry = sum/10;
	        }
	        while( p2 != null){
	        	int sum = carry + p2.val;
	        	p2 = p2.next;
	            p3.next = new LinkedList(sum%10);
	            p3 = p3.next;
	            carry = sum/10;
	        }
	 
	        if(carry != 0){
	        	 p3.next=new LinkedList(carry);
	        }
	           
	        
//	        while(newHead.next != null){
//	        	System.out.println(":"+newHead.next.val);
//	        	newHead.next = newHead.next.next;
//	        }
	        
	        return newHead.next;
	    }
}

