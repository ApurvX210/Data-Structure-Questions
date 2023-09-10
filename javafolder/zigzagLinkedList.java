public class zigzagLinkedList {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Node zigZag(Node head){
        Node a=head;
        Node b=a.next;
        if(b==null){
            return head;
        }
        Node c=b.next;
        if(c==null){
            if(a.data>=b.data){
                int num=a.data;
                a.data=b.data;
                b.data=num;
            }
        }
        Boolean flag=true;
        while(c!=null){
            if(flag){
                if(a.data>=b.data){
                    int num=a.data;
                    a.data=b.data;
                    b.data=num;
                }
                if(c.data>=b.data){
                    int num=b.data;
                    b.data=c.data;
                    c.data=num;
                }
                flag=false;
                a=a.next;
                b=b.next;
                c=c.next;
            }else{
                if(c.data<b.data){
                    int num=b.data;
                    b.data=c.data;
                    c.data=num;
                }
                a=a.next;
                b=b.next;
                c=c.next;
                flag=true;
            }
        }
        return head;
    }
}
