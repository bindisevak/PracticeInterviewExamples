package binarySearchTree;

import java.util.LinkedList;

public class MaxMinDepth {
	public static void main(String[] args) {
		
	}
	
	public int maxDepth(TreeNode root) {
	    if(root==null)
	        return 0;
	 
	    int leftDepth = maxDepth(root.left);
	    int rightDepth = maxDepth(root.right);
	 
	    int bigger = Math.max(leftDepth, rightDepth);
	 
	    return bigger+1;
	}
	
	public int minDepth(TreeNode root){
		if(root == null)
			return 0;
		
		LinkedList<TreeNode> nodes = new LinkedList<TreeNode>();
		LinkedList<Integer> counts = new LinkedList<Integer>();
		nodes.add(root);
		counts.add(1);
		
		while(!nodes.isEmpty()){
			TreeNode curr = nodes.remove();
			int count = counts.remove();
			
			if(curr.left == null && curr.right == null)
				return count;
			if(curr.left != null){
				nodes.add(curr.left);
				counts.add(count+1);
			}
			if(curr.right != null){
				nodes.add(curr.right);
				counts.add(count+1);
			}
		}
		return 0;
	}
	
	public int minDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return getMin(root);
    }

    public int getMin(TreeNode root){
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        return Math.min(getMin(root.left), getMin(root.right)) + 1;
    }
}
