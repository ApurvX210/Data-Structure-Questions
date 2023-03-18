import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_traversal {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public ArrayList<Integer> reverseLevelOrder(Node node) {
        Queue<Node> q= new LinkedList<>();
        ArrayList<Integer> a=new ArrayList<>();
        q.add(node);
        while(q.size()>0){
            Node temp=q.remove();
            a.add(temp.data);
            if(temp.right!=null){
                q.add(temp.right);
            }
            if(temp.left!=null){
                q.add(temp.left);
            }
            
        }
        for (int i = 0; i < a.size() / 2; i++) {
            Integer temp = a.get(i);
            a.set(i, a.get(a.size() - i - 1));
            a.set(a.size() - i - 1, temp);
        }
        return a;
    }
}
