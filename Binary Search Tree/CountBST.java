import segregateLL.Node;

public class CountBST {
    void count(Node root,int l,int h,int arr[]){
        if(root==null){
            return;
        }
        if(root.data>=l && root.data<=h){
            // System.out.println(root.data);
            arr[0]++;
            count(root.left, l, h, arr);
            count(root.right, l, h, arr);
        }
        if(root.data<l){
            count(root.right, l, h, arr);
        }
        if(root.data>h){
            count(root.left, l, h, arr);
        }
        
    }
    int getCount(Node root,int l, int h)
    {
        int arr[]={0};
        count(root, l, h, arr);
        return arr[0];
    }
}
