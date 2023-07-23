public class LongestPallindromSub {
    public int longestPalinSubseq(String S)
    {
        int dp[][]=new int[S.length()+1][S.length()+1];
        String S1="";
        for(int i=S.length()-1;i>=0;i--){
            S1+=S.charAt(i);
        }
        for(int i=1;i<=S.length();i++){
            for(int j=1;j<=S.length();j++){
                if(S.charAt(i-1)==S1.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Integer.max(dp[i-1][j], Integer.max(dp[i][j-1],dp[i-1][j-1]));
                }
            }
        }
        return dp[S.length()][S.length()];
    }
}
