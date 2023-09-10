public class reverseLink {

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

    public static void main(String[] args) {

    }
}
