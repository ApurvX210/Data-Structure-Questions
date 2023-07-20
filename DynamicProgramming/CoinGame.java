public class CoinGame {
    public int findWinner(int N,int X,int Y)
    {
        int dp[]=new int[N+1];
        dp[0]=0;
        for(int i=1;i<dp.length;i++){
            if(dp[i-1]==0){
                dp[i]=1;
            }
            if(i-X>=0){
                if(dp[i-X]==0){
                    dp[i]=1;
                }
            }
            if(i-Y>=0){
                if(dp[i-Y]==0){
                    dp[i]=1;
                }
            }
        }
        return dp[N];
    }
}
