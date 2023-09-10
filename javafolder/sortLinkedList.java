import java.util.Arrays;

public class sortLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    static Node segregate(Node head)
    {
        int arr[]=new int[3];
        Node p=head;
        while(p!=null){
            arr[p.data]++;
            p=p.next;
        }
        System.out.println(Arrays.toString(arr));
        int i=0;
        while(p!=null){
            if(arr[i]>0){
                System.out.println(p.data);
                p.data=i;
                System.out.println(p.data);
                arr[i]--;
            }else{
                i++;
            }
            p=p.next;
        }
        return head;
    }
}
