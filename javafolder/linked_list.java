import java.util.LinkedList;
import java.util.Scanner;
class node
{
    public int data;
    node next;
    node(int d)
    {
        data = d;
        next = null;
    }
}

public class linked_list {

    public static node takeInput(Scanner s)
    {
        System.out.println("Enter the data for nodes: ");
        int data = s.nextInt();
        node head = null;
        while(data != -1)			// linked list keeps on getting created till user enters -1
        {
            node newNode = new node(data);
            if(head == null)
            {
                head = newNode;
            }
            else
            {
                node temp = head;
                while(temp.next != null)
                {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static int length(int data) {
        int length;
        if (data > 9 && data < 100) {
            length = 2;
        }
        else if (data > 99 && data < 1000) {
            length = 3;
        }
        else {
            length = 4;
        }
        return length;
    }
    public static void sortList(node head)
    {

        node current = head, index = null;

        int temp;

        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                index = current.next;

                while (index != null) {
                    int currLen = length(current.data);
                    int indexLen = length(index.data);
                    if (currLen > indexLen) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }

                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        node head = takeInput(s);

        sortList(head);

        System.out.print("Enter the element: ");
        int num = s.nextInt();
        node curr = head;
        int count = 0;
        while (curr.data != num) {
            curr = curr.next;
            count++;
        }
        System.out.println(count);
    }
    
}
