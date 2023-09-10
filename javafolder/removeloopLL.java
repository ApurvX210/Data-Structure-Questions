public class removeloopLL {
    class Node {
        int data;
        Node next;
    }
    public static void removeLoop(Node head){
        Node a=head;
        Node b=head;
        while(b!=null && b.next!=null){
            Node m=b.next;
            a=a.next;
            b=b.next.next;
            if(a==b){
                m.next=null;
                return;
            }
        }
    }
}
