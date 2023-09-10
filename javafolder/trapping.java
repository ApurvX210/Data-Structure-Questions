public class trapping {
    public static int trap(int[] arr) {
        int block=-1;
        int ans=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0 && block==-1){
                block=i;
            }
            else if(block==-1 && arr[i]==0){
                continue;
            }
            else if(arr[i]>=arr[block]){
                ans+=sum;
                sum=0;
                block=i;
                max=0;
            }
            else if(arr[i]<arr[block] && i==arr.length-1){
                sum=0;
                max=Integer.max(max,arr[i]);
                arr[block]=max;
                i=block;
            }
            else{
                sum+=arr[block]-arr[i];
                max=Integer.max(max,arr[i]);
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={4,2,3};
        System.out.println(trap(arr));
        
    }
}
