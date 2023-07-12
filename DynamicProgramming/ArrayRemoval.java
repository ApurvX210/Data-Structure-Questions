public class ArrayRemoval {
    int removals(int[] arr, int n, int k) {
        if(arr.length==1){
            return 0;
        }
        Arrays.sort(arr);
        int ans=Integer.MAX_VALUE;
        int h=n-1;
        for(int i=1;i<n;i++){
            if(arr[h]-arr[n-1-i]>k){
                h=h-1;
            }else{
                ans=Integer.min(ans, arr.length-(h-n+i+2));
            }
        }
        if(ans==Integer.MAX_VALUE){
            ans=1;
        }
        return ans;
    }
}
