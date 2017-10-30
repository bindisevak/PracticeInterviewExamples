package binarySearchTree;

class Tree{
	public int x;
	public Tree l;
	public Tree r;
}
/* In a binary tree, if in the path from the root to the node A, there is no
 * node with value greater than A's value, then A is a visible node. We need 
 * to count the number of visible nodes in a binary tree.
 */
public class VisibleNodes {
	public int solution(Tree T) {
        // write your code in Java SE 8
        return visibleNum(T, Integer.MIN_VALUE);
    }
    
    public int visibleNum(Tree T, int maxValue){
        if(T == null){
            return 0;
        }
        int result = 0;
        
        if(T.x >= maxValue){
           result = 1;
           maxValue = T.x;
        }
        
        return result + visibleNum(T.l,  maxValue) + visibleNum(T.r,  maxValue);
    }
}
