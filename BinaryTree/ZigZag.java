import java.util.ArrayList;
import java.util.Stack;

public class ZigZag {
    class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> s = new Stack<>();
        Stack<Node> s1 = new Stack<>();
        s.add(root);
        boolean flag=true;
        while (s.size() > 0) {
            Node temp=s.pop();
            ans.add(temp.data);
            if(flag){
                if(temp.left!=null){
                    s1.push(temp.left);
                }
                if(temp.right!=null){
                    s1.push(temp.right);
                }
            }else{
                if(temp.right!=null){
                    s1.push(temp.right);
                }
                if(temp.left!=null){
                    s1.push(temp.left);
                }
            }
            if(s.size()==0){
                if(flag){
                    flag=false;
                }else{
                    flag=true;
                }
                s=s1;
                s1 = new Stack<>();
            }
        }
        return ans;
    }
}
