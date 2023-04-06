public class BalanceTree {
    class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }
    int hieght(Node root){
        if(root==null){
            return 0;
        }
        int n1=hieght(root.left);
        int n2=hieght(root.right);
        if(n1==-1 || n2==-1){
            return -1;
        }else{
            if(Math.abs(n2-n1)>1){
                return -1;
            }
            return Integer.max(n1, n2)+1;
        }
    }
    boolean isBalanced(Node root) {
        int a=hieght(root);
        if(a==-1){
            return false;
        }else{
            return true;
        }
    }
}
