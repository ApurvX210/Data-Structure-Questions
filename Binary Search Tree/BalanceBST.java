import java.util.ArrayList;

import segregateLL.Node;

public class BalanceBST {
    class Node {
        int data;
        Node right, left;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

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

    Node buildBalancedTree(Node root) {
        ArrayList<Node> a=new ArrayList<>();
        inorder(root, a);
        return BST(a, 0, a.size()-1);
    }
}
