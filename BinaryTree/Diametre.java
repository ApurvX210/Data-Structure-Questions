public class Diametre {
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
    int dvalue(Node root,int ans[]){
        if(root==null){
            return 0;
        }
        int a=dvalue(root.left, ans);
        int b=dvalue(root.right, ans);
        ans[0]=Integer.max(ans[0], a+b+1);
        return Integer.max(a, b)+1;
    }
    int diameter(Node root) {
        int arr[]={0};
        dvalue(root, arr);
        return arr[0];
    }
}
