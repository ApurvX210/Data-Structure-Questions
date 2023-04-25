public class LowestCommonAncestor {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public int ancestor(Node root, int n1,int n2,Node arr[]){
        if(root==null){
            return 0;
        }
        int num=0;
        if(root.data==n1 || root.data==n2){
            num+=1;
        }
        num+=ancestor(root.left, n1, n2, arr);
        num+=ancestor(root.right, n1, n2, arr);
        if(num==2){
            if(arr[0]==null){
                arr[0]=root;
            }
        }
        return num;
    }

    Node lca(Node root, int n1, int n2) {
        Node a=null;
        Node arr[]={a};
        ancestor(root, n1, n2, arr);
        return arr[0];
    }
}
