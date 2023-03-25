import java.util.Queue;
import java.util.Stack;

import multiplytwoLL.Node;

public class SubTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode Possible(TreeNode root, TreeNode subRoot){
        if(root==subRoot){
            return root;
        }
        TreeNode a=Possible(root.left, subRoot);
        if(a!=null){
            return a;
        }
        TreeNode b=Possible(root.right, subRoot);
        if(b!=null){
            return b;
        }
        return null;
        
    }
    public boolean STree(TreeNode root, TreeNode subRoot){
        if(root!=subRoot){
            return false;
        }
        if(root==null && subRoot==null){
            return true;
        }
        if(STree(root.left, subRoot.left) && STree(root.right, subRoot.left)){
            return true;
        }
        return false;
    }
    public  boolean isSubtree(TreeNode root, TreeNode subRoot) {
        TreeNode temp=Possible(root, subRoot);
        return STree(temp, subRoot);
    }
}
