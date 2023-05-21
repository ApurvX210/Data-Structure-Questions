public class delnthnode {
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ans=head;
        ListNode temp=head;
        while(temp!=null){
            if(n>0){
                temp=temp.next;
                n--;
                if(n==1 && temp.next==null){
                    return head.next;
                }
            }
            else if(n==0){
                temp=temp.next;
                ans=ans.next;
            }
        }
        ans.next=ans.next.next;
        return head;
    }
}
