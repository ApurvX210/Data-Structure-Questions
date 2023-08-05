public class NoOfBalanceTree {
    static long countBT(int h){
        long dp[]=new long[h+1];

       long mod=(long)1e9+7;

       dp[0]=1;

       dp[1]=1;

       

       for(int i=2;i<=h;i++){

           dp[i]=(dp[i-1]*(2*dp[i-2]+dp[i-1]))%mod;

       }

       return dp[h];
    }
}
