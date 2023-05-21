public class delrightLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node compute(Node head) {
        Node temp=head;
        Node prev=null;
        while(temp.next!=null){
            if(temp==head){
                if(temp.data<temp.next.data){
                    head=temp.next;
                    prev=head;
                }
            }else{
                if(temp.data<temp.next.data){
                    prev.next=temp.next;
                }
            }
        }
        return head;
    }
}
