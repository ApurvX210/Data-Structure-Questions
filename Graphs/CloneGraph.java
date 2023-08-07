import java.util.ArrayList;

public class CloneGraph {
    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
    public Node cloneGraph(Node node) {
        int val=node.val;
        ArrayList<Node> a=new ArrayList<>();
        for(Node i:node.neighbors){
            
        }
    }
}
