package binarySearchTree;

public class SameTree {
	public static void main(String[] args) {
		
	}
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
	    if(p==null && q==null){
	        return true;
	    }else if(p==null || q==null){
	        return false;
	    }
	 
	    if(p.val==q.val){
	        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	    }else{
	        return false;
	    }
	}
	
	public boolean isSymmetric(TreeNode l, TreeNode r) {
		if (l == null && r == null) {
			return true;
		} else if (r == null || l == null) {
			return false;
		}
	 
		if (l.val != r.val)
			return false;
	 
		if (!isSymmetric(l.left, r.right))
			return false;
		if (!isSymmetric(l.right, r.left))
			return false;
	 
		return true;
	}
}
