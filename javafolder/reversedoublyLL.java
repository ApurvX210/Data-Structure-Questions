public class reversedoublyLL {
    class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node reverseDLL(Node head) {
        Node a=head;
        Node c=null;
        Node b=head.next;
        a.next=null;
        while(b!=null){
            c=b.next;
            if(c==null){
                b.next=a;
                return b;
            }
            b.next=a;
            a=b;
            b.prev=c;
            b=c;
        }
        return b;
    }
}
