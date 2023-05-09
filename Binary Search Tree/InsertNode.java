import segregateLL.Node;

public class InsertNode {
    class Node {
        int data;
        Node left, right;

        public Node(int d) {
            data = d;
            left = right = null;
        }
    }
    Node insert(Node root, int Key) {
        Node temp=root;
        while(temp!=null){
            if(temp.data >Key){
                if(temp.left.data<Key){
                    Node n=new Node(Key);
                    n.right=
                }
            }
        }
    }
}
