package binarySearchTree;

public class RecoverBinarySearchTree {
	TreeNode node1 = null;
	TreeNode node2 = null;
	public static void main(String[] args) {
		
	}
	
	public void recoverTree(TreeNode root){
		inorderTraverse(root);
		int tmp = node1.val;
		node1.val = node2.val;
		node2.val = tmp;
	}
	
	TreeNode prev = null;
	private void inorderTraverse(TreeNode root) {
		if(root == null)
			return;
		inorderTraverse(root.left);
		if(prev != null){
			if(root.val <= prev.val){
				if(node1 == null)
					node1 = prev;
				node2 = root;
			}
		}
		prev = root;
		inorderTraverse(root.right);
		
	}

	
	
}
