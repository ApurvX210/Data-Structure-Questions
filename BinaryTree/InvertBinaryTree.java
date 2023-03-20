public class InvertBinaryTree {
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

    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode a=root.right;
        TreeNode b=root.left;
        root.left=invertTree(a);
        root.right=invertTree(b);
        return root;
    }
}
