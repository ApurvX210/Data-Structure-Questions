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
            if(temp.data>Key){
                if(temp.left==null){
                    Node n=new Node(Key);
                    temp.left=n;
                    break;
                }else{
                    temp=temp.left;
                }
            }
            else if(temp.data<Key){
                if(temp.right==null){
                    Node n=new Node(Key);
                    temp.right=n;
                    break;
                }else{
                    temp=temp.right;
                }
            }else{
                break;
            }
        }
        return root;
    }
}
