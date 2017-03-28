package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

class Node {
	      int label;
	      ArrayList<Node> neighbors;
	      Node(int x) { 
	    	  label = x; 
	    	  neighbors = new ArrayList<Node>(); }
	  };
public class CloneGraph {
	public static void main(String[] args) {
		
	}
	
	public Node getClonedGraph(Node node){
		if(node == null)
			return null;
		
		LinkedList<Node> queue = new LinkedList<Node>();
		HashMap<Node, Node> map = new HashMap<Node, Node>();
		Node head = new Node(node.label);
		
		queue.add(node);
		map.put(node, head);
		
		while(!queue.isEmpty()){
			Node curr = queue.pop();
			ArrayList<Node> currNeibhors = curr.neighbors;
			
			for(Node a: currNeibhors){
				if(!map.containsKey(a)){
					Node copy = new Node(a.label);
					map.put(a, copy);
					map.get(curr).neighbors.add(copy);
					queue.add(a);
				}else{
					map.get(curr).neighbors.add(map.get(a));
				}
			}
		}
		return head;
	}
}
