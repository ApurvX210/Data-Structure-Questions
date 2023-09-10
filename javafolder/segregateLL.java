public class segregateLL {
    class Node{
        int data;
        Node next;
        
        Node(int x){
            data = x;
            next = null;
        }
    }
    Node divide(int N, Node head){
        Node even=null;
        if(head.data%2==0){
            even=head;
        }
        Node temp=head;
        Node temp1=head.next;
        while(temp1!=null){
            if(temp1.data%2==0){
                if(even!=null){
                    temp.next=temp1.next;
                    temp1.next=even.next;
                    even.next=temp1;
                    even=temp1;
                    temp1=temp.next;
                }else{
                    temp.next=temp1.next;
                    even=temp1;
                    even.next=head;
                    head=even;
                    temp1=temp.next;
                }
            }else{
                temp=temp1;
                temp1=temp1.next;
            }
        }
        return head;
    }
}
