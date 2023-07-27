public class maxdiffzerone {
    int maxSubstring(String S) {
        int ans=-1;
        int dp[]=new int[S.length()+1];
        dp[0]=0;
        for(int i=1;i<dp.length;i++){
            if(dp[i-1]>=0){
                if(S.charAt(i-1)=='1'){
                    dp[i]=dp[i-1]-1;
                }else if(S.charAt(i-1)=='0'){
                    dp[i]=dp[i-1]+1;
                }
            }else{
                if(S.charAt(i-1)=='1'){
                    dp[i]=-1;
                }else if(S.charAt(i-1)=='0'){
                    dp[i]=1;
                }
            }
            ans=Integer.max(ans, dp[i]);
        }
        return ans;
    }
}
