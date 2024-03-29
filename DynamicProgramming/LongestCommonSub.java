public class LongestCommonSub {
    int longestCommonSubstr(String S1, String S2, int n, int m){
        int ans=0;
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(S1.charAt(i-1)==S2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                ans=Integer.max(ans,dp[i][j]);
            }
        }
        return ans;
    }
}
