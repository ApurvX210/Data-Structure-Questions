public class MinNode {
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

    int minValue(Node node) {
        
        Node temp=node;
        while(temp!=null){
            if(temp.left==null){
                return temp.data;
            }
            else{
                temp=temp.left;
            }
        }
        return -1;
    }
}
