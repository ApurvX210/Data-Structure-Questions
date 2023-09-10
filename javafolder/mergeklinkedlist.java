import java.util.*;

public class mergeklinkedlist {
    // class Node {
    // int data;
    // Node next;

    // Node(int key) {
    // data = key;
    // next = null;
    // }
    // }

    // Node mergeKList(Node[]arr,int K)
    // {

    // if(K == 0) return null;
    // PriorityQueue<Node> min_heap = new PriorityQueue<>((a,b) -> a.data - b.data);
    // for(int i=0;i<K;i++) {
    // if(arr[i] != null)
    // min_heap.offer(arr[i]);
    // }
    // Node head = new Node(0);
    // Node curr = head;
    // while(!min_heap.isEmpty()) {
    // Node temp = min_heap.poll();
    // curr.next = temp;
    // curr = curr.next;
    // if(temp.next != null) {
    // temp = temp.next;
    // min_heap.offer(temp);
    // }
    // }
    // return head.next;
    // }
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static ArrayList<ArrayList<Integer>> levelOrder(Node node) 
    {
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        int cnt=1;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> a=new ArrayList<>();
        while(q.size()>0){
            Node n=q.poll();
            a.add(n.data);
            if(n.left!=null){
                q.add(n.left);
            }
            if(n.right!=null){
                q.add(n.right);
            }
            cnt--;
            if(cnt==0){
                cnt=q.size();
                ans.add(a);
                a=new ArrayList<>();
            }
        }
        return ans;
        
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        Integer.M
    }
}
