import java.util.Stack;

public class InorderPreorder {
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

    class Data {
        int pos;
        TreeNode node;
        Data(int pos,TreeNode node){
            this.pos=pos;
            this.node=node;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root=new TreeNode(0, null, null);
        Stack<Data> s=new Stack<>();
        for(int i=0;i<preorder.length;i++){
            for(int j=0;j<inorder.length;j++){
                if(preorder[i]==inorder[j]){
                    if(s.size()==0){
                        root.val=preorder[i];
                        s.push(new Data(j, root));
                        break;
                    }else if(s.peek().pos>j){
                        TreeNode n=new TreeNode(preorder[i], null, null);
                        s.peek().node.left=n;
                        s.push(new Data(j, n));
                    }else{
                        Data num=new Data(-1, null);
                        while(s.size()>0 && s.peek().pos<j){
                            num=s.peek();
                            s.pop();
                        }
                        TreeNode n=new TreeNode(preorder[i], null, null);
                        num.node.right=n;
                        s.push(new Data(j, n));
                    }
                }
            }
        }
        return root;
    }
}
