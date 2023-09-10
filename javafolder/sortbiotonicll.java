public class sortbiotonicll {
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }
    public Node flatten(Node head) {
        Node temp=head;
        Node s=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(s!=null){
            if(s.child!=null){
                temp.next=s.child;
                while(temp.next!=null){
                    temp=temp.next;
                }
            }
        }
        return head;
    }
}
