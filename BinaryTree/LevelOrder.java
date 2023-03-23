import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

import multiplytwoLL.Node;

public class LevelOrder {
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        List<List<Integer>> a=new ArrayList<>();
        q.add(root);
        int s=q.size();
        int num=0;
        List<Integer> l=new ArrayList<>();
        while(q.size()>0){
            TreeNode temp=q.remove();
            if(temp==null){
                break;
            }
            l.add(temp.val);
            num++;
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
            if(num==s){
                num=0;
                a.add(new ArrayList<>(l));
                l.clear();
                s=q.size();
            }
            
        }
        return a;
    }
}
