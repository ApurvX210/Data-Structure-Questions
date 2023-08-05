public class pairdiff {
    public static int maxSumPairWithDifferenceLessThanK(int arr[], int N, int k) 
    {
        Arrays.sort(arr);
        int ans=0;
        for(int i=N-1;i>0;i--){
            if(arr[i]-arr[i-1]<k){
                ans+=arr[i]+arr[i-1];
                i--;
            }
        }
        return ans;
    }
}
