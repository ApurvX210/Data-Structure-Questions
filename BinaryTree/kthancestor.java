import segregateLL.Node;

public class kthancestor {
    class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }
    public int Ancestor(Node root, int k, int node,int arr[])
    {
        if(root==null){
            return k;
        }
        if(arr[0]!=-1){
            return -1;
        }
        if(root.data==node){
            return k-1;
        }
        int a=Ancestor(root.left, k, node,arr);
        int b=Ancestor(root.right, k, node,arr);
        if(a==0 || b==0){
            arr[0]=root.data;
            return -1;
        }
        if(a<k){
            return a-1;
        }
        if(b<k){
            return b-1;
        }
        return k;
    }
    public int kthAncestor(Node root, int k, int node)
    {
        int arr[]={-1};
        Ancestor(root, k, node, arr);
        return arr[0];
    }
}
