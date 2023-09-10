public class multiplytwoLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public long multiplyTwoLists(Node l1, Node l2) {
        String n1 = "";
        String n2 = "";
        while (l1 != null) {
            n1 += l1.data + "";
            l1 = l1.next;
        }
        System.out.println(n1);
        while (l2 != null) {
            n2 += l2.data + "";
            l2 = l2.next;
        }
        System.out.println(n2);
        Long l = Long.parseLong(n1);
        Long l3 = Long.parseLong(n2);
        l=l*l3;
        return l;

    }
}
