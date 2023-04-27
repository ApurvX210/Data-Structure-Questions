public class SumTree {
    class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }
    public int Modify(Node root){
        if(root==null){
            return 0;
        }
        if(root.left ==null && root.right==null){
            int a=root.data;
            root.data=0;
            return a;
        }
        int a=root.data;
        root.data=Modify(root.left)+Modify(root.right);
        a+=root.data;
        return a;
    }
    public void toSumTree(Node root) {
        int ans=Modify(root);
    }
}
