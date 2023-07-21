public class KnapSackZeroOne {
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
        int dp[][]=new int[n+1][W+1];
        for(int j=1;j<=n;j++){
            for(int i=1;i<=W;i++){
                if(i-wt[j-1]>=0){
                    dp[j][i]=Integer.max(dp[j-1][i], val[j-1]+dp[j-1][i-wt[j-1]]);
                }else{
                    dp[j][i]=Integer.max(dp[j][i-1], dp[j-1][i]);
                }
            }
        }
        return dp[n][W];
    }
}
