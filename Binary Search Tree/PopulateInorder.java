import java.util.ArrayList;

public class PopulateInorder {
    class Node {
        int data;
        Node left, right, next;

        public Node(int data) {
            this.data = data;
        }
    }
    Node prev=null;
    public void populateNext(Node root) {
        if(root!=null){
            populateNext(root.right);
            root.next=prev;
            prev=root;
            populateNext(root.left);
        }
    }
}
