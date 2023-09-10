public class mergelinkedlist {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode a = list1;
        ListNode b = list2;
        ListNode head = null;
        if (a != null && b != null) {
            if (a.val > b.val) {
                head = b;
            } else {
                head = a;
            }
        }
        if(a==null){
            return b;
        }else if(b==null){
            return a;
        }
        ListNode prev = null;
        while (a != null && b != null) {
            if (a.val > b.val) {
                ListNode c = b.next;
                b.next = a;
                if (prev != null) {
                    prev.next = b;
                    prev = b;
                } else {
                    prev = b;
                }
                b = c;
            } else {
                prev = a;
                a = a.next;
            }
        }
        if(a==null){
            prev.next=b;
        }
        return head;
    }
}
