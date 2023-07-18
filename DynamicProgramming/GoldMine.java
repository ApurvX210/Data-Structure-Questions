public class GoldMine {
    static int maxGold(int n, int m, int M[][])
    {
        int dp[][]=new int[n][m];
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int x=0;
                int y=0;
                int z=0;
                if(i-1>=0){
                    if(j-1>=0){
                        x=dp[j-1][i-1];
                    }
                    y=dp[j][i-1];
                    if(j+1<n){
                        z=dp[j+1][i-1];
                    }
                }
                int max=Integer.max(x,Integer.max(y,z));
                dp[j][i]=M[j][i]+max;
                ans=Integer.max(dp[j][i],ans);
            }
        }
        return ans;
    }
}
