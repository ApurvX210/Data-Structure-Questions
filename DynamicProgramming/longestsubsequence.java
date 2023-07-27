public class longestsubsequence {
    static int longestSubsequence(int N, int A[])
    {
        int ans=1;
        int dp[]=new int[N];
        dp[0]=1;
        for(int i=1;i<A.length;i++){
            int a=0;
            for(int j=0;j<i;j++){
                if(Math.abs(A[j]-A[i])==1){
                    a=Integer.max(a, dp[j]);
                }
                dp[i]=a+1;
                ans=Integer.max(ans, dp[i]);
            }
        }
        return ans;
    }
}
