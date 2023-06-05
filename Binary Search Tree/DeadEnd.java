public class DeadEnd {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public static boolean DeadEnd(Node root,int low,int high){
        if(root==null){
            return false;
        }
        if(low==high){
            return true;
        }
        if(DeadEnd(root.left, low, root.data-1)){
            return true;
        }
        if(DeadEnd(root.right, root.data+1, high)){
            return true;
        }
        return false;
    }
    public static boolean isDeadEnd(Node root) {
        Node temp=root;
        return DeadEnd(root, 1, Integer.MAX_VALUE);
    }
}
