package binarySearchTree;


class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
 
	TreeNode(int x) {
		val = x;
	}
}
public class SortedArrayToBST {
	public static void main(String[] args) {
		
	}
	
	public TreeNode sortedArrayToBST(int[] num){
		if(num.length == 0)
			return null;
		return getBSTArray(num, 0, num.length-1);
	}

	public TreeNode getBSTArray(int[] num, int start, int end){
		if(start > end)
			return null;
		
		int mid = (start + end)/2;
		TreeNode root = new TreeNode(num[mid]);
		root.left = getBSTArray(num, start, mid-1);
		root.right = getBSTArray(num, mid+1, end);
		return root;
	}
}
