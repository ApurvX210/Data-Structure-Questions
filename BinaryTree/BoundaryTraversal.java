import java.util.ArrayList;

public class BoundaryTraversal {
    class Node {
        int data;
        Node left, right;

        public Node(int d) {
            data = d;
            left = right = null;
        }
    }
    public void traversal(Node node,ArrayList<Integer> a){
        if (node == null)
            return;
 
        if (node.left != null) {
            a.add(node.data);
            traversal(node.left,a);
        }
        else if (node.right != null) {
            a.add(node.data);
            traversal(node.right,a);
        }

    }
    public void traversal1(Node node,ArrayList<Integer> a){
        if (node == null)
            return;
        if (node.right != null) {
           traversal1(node.right,a);
            a.add(node.data);
        }
        else if (node.left != null) {
            traversal1(node.left,a);
            a.add(node.data);
        }
        

    }
    public void traversal2(Node node,ArrayList<Integer> a){
        if (node == null)
            return;
        traversal2(node.left, a);
        if(node.left==null && node.right==null){
            a.add(node.data);
        }
        
        traversal2(node.right,a);

    }

    ArrayList<Integer> boundary(Node node) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(node.data);
        traversal(node.left, a);
        traversal2(node.left,a);
        traversal2(node.right,a);
        traversal1(node.right,a);
        return a;
    }
}
