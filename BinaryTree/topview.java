import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class topview {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static class data {
        int depth;
        Node node;

        data(int depth, Node node) {
            this.depth = depth;
            this.node = node;
        }
    }

    public static void tv(Node root, Map<Integer, data> h, int num, int depth) {
        if (root == null) {
            return;
        }
        if (h.containsKey(num) == false) {
            // System.out.println("first"+root.data+" "+depth);
            h.put(num, new data(depth, root));
        } else {
            data d = h.get(num);
            // System.out.println(d.depth+" "+depth);
            if (d.depth > depth) {
                // System.out.println("second"+root.data+" "+depth);
                h.put(num, new data(depth, root));
            }
        }
        tv(root.left, h, num + 1, depth + 1);
        tv(root.right, h, num - 1, depth + 1);

    }

    static ArrayList<Integer> topView(Node root) {
        Map<Integer, data> h = new TreeMap<Integer, data>(Collections.reverseOrder());
        ArrayList<Integer> a = new ArrayList<>();
        tv(root, h, 0, 0);
        for(int i:h.keySet()){
            a.add(h.get(i).node.data);
        }
        return a;
    }
}
