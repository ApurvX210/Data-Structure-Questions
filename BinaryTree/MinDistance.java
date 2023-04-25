public class mindistance {
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
    public void distance(Node root, int a,int arr[],int num){
        if(root==null){
            return ;
        }
        if(arr[0]!=-1){
            return;
        }
        if(root.data==a){
            arr[0]=num;
            return;
        }
        distance(root.left, a,arr,num+1);
        distance(root.right, a,arr,num+1);
    }
    int findDist(Node root, int a, int b) {
        Node ap=null;
        Node arr[]={ap};
        ancestor(root, a, b, arr);
        int ar[]={-1};
        distance(arr[0], a, ar, 0);
        int ans=ar[0];
        ar[0]=-1;
        distance(arr[0], b, ar, 0);
        ans+=ar[0];
        if(ans<0){
            return 0;
        }
        return ans;
    }
}
