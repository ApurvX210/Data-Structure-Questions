public class reorderLinkedlist {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode reverseList(ListNode head) {
        ListNode a=head;
        if(a==null || a.next==null){
            return a;
        }
        ListNode b=head.next;
        a.next=null;
        ListNode c=null;
        while(b!=null && b.next!=null){
            c=b.next;
            b.next=a;
            a=b;
            b=c;
        }
        b.next=a;
        return b;
    }
    public void reorderList(ListNode head) {
        int num=0;
        ListNode temp=head;
        while(temp!=null){
            num++;
            temp=temp.next;
        }
        if(num%2==0){
            num++;
        }
        num=num/2;
        ListNode head1=null;
        temp=head;
        while(num!=0){
            temp=temp.next;
        }
        head1=temp.next;
        temp.next=null;
        head1=reverseList(head1);
        ListNode h1=head;
        ListNode h2=head1;
        while(h1!=null && h2!=null){
            ListNode m=h1.next;
            ListNode n=h2.next;
            h1.next=h2;
            h2.next=m;
            h2=n;
            h1=m;
        }
    }
}
