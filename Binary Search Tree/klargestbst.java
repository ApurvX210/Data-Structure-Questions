import segregateLL.Node;

public class klargestbst {
    public void ans(Node root,int kval[],int arr[]){
        if(root==null){
            return;
        }
        ans(root.right, kval, arr);
        kval[0]--;
        if(kval[0]==0){
            arr[0]=root.data;
        }
        ans(root.left, kval, arr);
    }
    public int kthLargest(Node root,int K)
    {
        int arr[]={-1};
        int kval[]={K};
        ans(root, kval, arr);
        return arr[0];
    }
}
