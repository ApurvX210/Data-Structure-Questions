import java.util.Stack;

public class PreorderBST {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static Node post_order(int pre[], int size) {
        Stack<Node> s=new Stack<>();
        Node root=new Node(pre[0]);
        int i=1;
        Node temp=root;
        s.push(temp);
        while(i<size){
            if(s.size()>0){
                if(pre[i]<s.peek().data){
                    temp.left=new Node(pre[i]);
                    s.push(temp.left);
                    temp=temp.left;
                    i++;
                }else{
                    while(s.size()>0 && pre[i]>s.peek().data){
                        temp=s.pop();
                    }
                    temp.right=new Node(pre[i]);
                    s.push(temp.right);
                    temp=temp.right;
                    i++;
                }
            }
        }
        return root;
    }
}
