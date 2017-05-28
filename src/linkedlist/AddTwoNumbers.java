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
		int carry = 0;
		
		LinkedList newhead = new LinkedList(0);
		LinkedList p1 = l1, p2 = l2, p3 = newhead;
		
		while(p1 != null || p2 != null){
			if(p1 != null){
				carry += p1.val;
				p1 = p1.next;
			}
			
			if(p2 != null){
				carry += p2.val;
				p2 = p2.next;
			}
			p3.next = new LinkedList(1);
			p3 = p3.next;
			carry /= 10;
			System.out.println(carry);
		}
		if(carry == 1){
			p3.next = new LinkedList(1);
		}
		return newhead.next;
	}
}

