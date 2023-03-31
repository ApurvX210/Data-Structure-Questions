public class YshapedLiskedList {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    int intersectPoint(Node head1, Node head2)
	{
        int m=0;
        int n=0;
        Node temp=head1;
        Node temp2=head2;
        while(temp!=head1){
            m++;
            temp=temp.next;
        }
        System.out.println(m);
        while(temp2!=head2){
            n++;
            temp2=temp2.next;
        }
        System.out.println(n);
        temp=head1;
        temp2=head2;
        if(m>n){
            int num=m-n;
            while(num>0){
                num--;
                temp=temp.next;
            }
        }else{
            int num=n-m;
            while(num>0){
                num--;
                temp2=temp2.next;
            }
        }
        while(temp!=null && temp2!=null){
            if(temp==temp2){
                return temp.next.data;
            }
            temp=temp.next;
            temp2=temp2.next;
        }
        return 0;
	}
}
