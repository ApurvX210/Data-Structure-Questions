import java.util.Collections;

public class BinaryTreeBST {
    void inorder(Node root, ArrayList<Node> a) {
        if (root == null) {
            return;
        }
        inorder(root.left, a);
        a.add(root);
        inorder(root.right, a);
    }

    Node BST(ArrayList<Node> a,int l,int h){
        if(l<=h){
            int num=(l+h)/2;
            Node temp=a.get(num);
            temp.left=BST(a, l, num-1);
            temp.right=BST(a, num+1, h);
            return temp;
        }
        return null;
    }
    Node binaryTreeToBST(Node root)
    {
        ArrayList<Node> a=new ArrayList<>();
        inorder(root, a);
        Collections.sort(a, new Comparator<Node>(){
            public int compare(Node o1, Node o2){
                return o1.data-o2.data;
            }
       });
        return BST(a, 0, a.size()-1);
    }
}
