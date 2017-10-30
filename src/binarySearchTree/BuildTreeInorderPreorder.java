package binarySearchTree;

class Node{
	char data;
    Node left, right;
  
    Node(char item) 
    {
        data = item;
        left = right = null;
    }
}
public class BuildTreeInorderPreorder {
	Node root;
	static int preIndex = 0;
	
	public static void main(String[] args) {
		
	}
	
	Node buildTree(char[] in, char[] pre, int inStrt, int inEnd){
		if(inStrt > inEnd)
			return null;
		
		Node tNode = new Node(pre[preIndex++]);
		if(inStrt == inEnd)
			return tNode;
		
		int inIndex = search(in, inStrt, inEnd, tNode.data);
		tNode.left = buildTree(in, pre, inStrt, inIndex-1);
		tNode.right = buildTree(in, pre, inIndex+1, inEnd);
		
		return tNode;
	}

	 int search(char[] in, int inStrt, int inEnd, char data) {
		 int i;
		 for( i=inStrt; i<=inEnd; i++){
			if(in[i] == data){
				return i;
			}
		}
		
		return i;
	}
}
