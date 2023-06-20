public class ksmallestBST {
    public void ans(TreeNode root,int kval[],int arr[]){
        if(root==null){
            return;
        }
        ans(root.left, kval, arr);
        kval[0]--;
        if(kval[0]==0){
            arr[0]=root.val;
        }
        ans(root.right, kval, arr);
    }
    public int kthSmallest(TreeNode root, int k) {
        int arr[]={-1};
        int kval[]={k};
        ans(root, kval, arr);
        return arr[0];
    }
}
