import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DupTree {
    class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    public String duplicate(Node root, HashMap<String, Integer> h,List<Node> l) {
        if (root == null) {
            return "";
        }
        if (root.left == null && root.right == null) {
            return root.data + "";
        }
        String a = duplicate(root.left, h);
        String b = duplicate(root.right, h);
        if (h.containsKey(root.data + " " + a + " " + b)) {
            l.add(root);
            h.put(root.data + " " + a + " " + b, h.get(root.data + " " + a + " " + b) + 1);
        } else {
            h.put(root.data + " " + a + " " + b, 1);
        }
        return root.data + " " + a + " " + b;
    }

    public List<Node> printAllDups(Node root) {
        List<Node> l = new ArrayList<>();
        HashMap<String, Integer> h = new HashMap<>();
        duplicate(root, h,l);
        Collections.sort(l,new Comparator<Node>() {

            @Override
            public int compare(Node o1, Node o2) {
                return o1.data-o2.data;
            }
            
        });
        return l;
    }
}
