import java.util.ArrayList;
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
    public void Possible(TreeNode root, TreeNode subRoot,ArrayList<TreeNode> a){
        if(root ==null || subRoot==null){
            return;
        }
        if(root.val==subRoot.val){
            a.add(root);
        }
        Possible(root.left, subRoot, a);
        Possible(root.right, subRoot, a);
    }
    public boolean STree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null && q!=null){
            return false;
        }
        if(p!=null && q==null){
            return false;
        }
        if(p.val==q.val){
            if(STree(p.left, q.left) && STree(p.right, q.right)){
                return true;
            }
            return false;
        }
        return false;
    }
    public  boolean isSubtree(TreeNode root, TreeNode subRoot) {
        ArrayList<TreeNode> a=new ArrayList<>();
        Possible(root, subRoot, a);
        for(TreeNode i:a){
            System.out.println(i.val);
            if(STree(i, subRoot)){
                return true;
            }
        }
        return false;
    }
}
