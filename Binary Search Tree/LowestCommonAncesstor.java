public class LowestCommonAncesstor {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode temp=root;
        while(temp!=null){
            System.out.println(temp.val);
            if((temp.val>=Integer.min(p.val, q.val) && temp.val<Integer.max(p.val, q.val)) || (temp.val>Integer.min(p.val, q.val) && temp.val<=Integer.max(p.val, q.val))){
                return temp;
            }
            if(temp.val>Integer.max(p.val, q.val)){
                System.out.println("left"+" "+Integer.max(p.val, q.val));
                temp=temp.left;
            }else{
                System.out.println("right");
                temp=temp.right;
            }
        }
        return null;
    }
}
