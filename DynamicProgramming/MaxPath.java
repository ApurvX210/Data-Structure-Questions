public class MaxPath {
    static int maximumPath(int N, int M[][])
    {
        int dp[][]=new int[N][N];
        int ans=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int x=0;
                int y=0;
                int z=0;
                if(i-1>=0){
                    if(j-1>=0){
                        x=dp[i-1][j-1];
                    }
                    y=dp[i-1][j];
                    if(j+1<N){
                        z=dp[i-1][j+1];
                    }
                }
                int max=Integer.max(x,Integer.max(y,z));
                dp[i][j]=M[i][j]+max;
                ans=Integer.max(dp[i][j],ans);
            }
        }
        return ans;
    }
}
