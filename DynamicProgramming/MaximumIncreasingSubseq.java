public class MaximumIncreasingSubseq {
    public int maxSumIS(int arr[], int n)  
	{  
	    int dp[]=new int[n];
        int ans=0;
        for(int i=0;i<n;i++){
            dp[i]=arr[i];
            int num=0;
            for(int j=i-1;j>=0;j--){
                if(arr[j]<arr[i]){
                    num=Integer.max(num,dp[j]);
                }
            }
            dp[i]+=num;
            ans=Integer.max(dp[i],ans);
        }
        return ans;
	}
}
