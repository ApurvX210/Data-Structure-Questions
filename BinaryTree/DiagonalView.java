import java.util.ArrayList;
import java.util.Map;

public class DiagonalView {
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

    public  void tv(Node root, Map<Integer, ArrayList<Integer>> h, int num) {
        if (root == null) {
            return;
        }
        if (h.containsKey(num) == false) {
            // System.out.println("first"+root.data+" "+depth);
            ArrayList<Integer> a=new ArrayList<>();
            a.add(root.data);
            h.put(num, a);
        } else {
            ArrayList<Integer> a=h.get(num);
            a.add(root.data);
            h.put(num,a);
        }
        tv(root.left, h, num + 1);
        tv(root.right, h, num);

    }

    public ArrayList<Integer> diagonal(Node root) {
        Map<Integer, ArrayList<Integer>> h = new TreeMap<Integer, ArrayList<Integer>>();
        ArrayList<Integer> a = new ArrayList<>();
        tv(root, h, 0);
        for (int i : h.keySet()) {
            a.addAll(h.get(i));
        }
        return a;
    }
}
