public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        if(amount==0){
            return 0;
        }
        int dp[]=new int[amount+1];
        dp[0]=0;
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<coins.length;j++){
                if(i-coins[j]>0){
                    if(dp[i-coins[j]]!=0){
                        if(dp[i]==0){
                            dp[i]=dp[i-coins[j]]+1;
                        }else{
                            dp[i]=Integer.min(dp[i], dp[i-coins[j]]+1);
                        }
                        
                    }
                }else if(i-coins[j]==0){
                    dp[i]=1;
                }
            }
        }
        if(dp[amount]==0){
            return -1;
        }
        return dp[amount];
    }
    public static void main(String args[])
    {
        int coins[] = { 1, 2, 5 };
 
        System.out.println(coinChange(coins, 11));
    }
}
