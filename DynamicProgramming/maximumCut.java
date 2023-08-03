public class maximumCut {
    public int maximizeCuts(int n, int x, int y, int z) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            if (i - x >= 0) {
                if(dp[i-x]==0 && i-x==0){
                    dp[i]=1;
                }
                if(dp[i-x]>0){
                    dp[i]=Integer.max(dp[i], dp[i - x]+1);
                }
            }
            if (i - y >= 0) {
                if(dp[i - y]==0 && i - y==0){
                    dp[i]=Integer.max(dp[i], 1);
                }
                if(dp[i - y]>0){
                    dp[i]=Integer.max(dp[i], dp[i - y]+1);
                }
            }
            if (i - z >= 0) {
                if(dp[i - z]==0 && i - z==0){
                    dp[i]=Integer.max(dp[i], 1);
                }
                if(dp[i - z]>0){
                    dp[i]=Integer.max(dp[i], dp[i - z]+1);
                }
            }
        }
        return dp[n];
    }
}
