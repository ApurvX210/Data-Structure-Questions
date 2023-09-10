import java.util.Hashtable;

public class removeduplicateLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node removeDuplicates(Node head) 
    {
        Hashtable<Integer,Integer> h=new Hashtable<>();
        if(head==null){
            return head;
        }
        h.put(head.data, 1);
        Node temp=head.next;
        Node prev=head;
        while(temp.next!=null){
            if(h.containsKey(temp.data)){
                prev.next=temp.next;
                temp=temp.next;
            }else{
                h.put(temp.data, 1);
            }
        }
        return head;
    }
}
