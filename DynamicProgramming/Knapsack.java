public class Knapsack {
    static int knapSack(int N, int W, int val[], int wt[])
    {
        int dp[] = new int[W + 1];
         
        for(int i = 0; i <= W; i++){
            for(int j = 0; j < N; j++){
                if(wt[j] <= i){
                    dp[i] = Integer.max(dp[i], dp[i - wt[j]] +
                                val[j]);
                }
            }
        }
        return dp[W];
    }
}
