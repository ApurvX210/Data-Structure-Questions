public class DecodeWays {
    public int numDecodings(String s) {
        int dp[]=new int[s.length()+1];
        dp[0]=0;
        if(s.charAt(0)=='0'){
            return 0;
        }
        for(int i=1;i<dp.length;i++){
            if(s.charAt(i-1)=='0' && s.charAt(i-2)>'2'){
                return 0;
            }else if(s.charAt(i-1)=='0'){
                dp[i]=dp[i-1]-1;
                if(dp[i]==0){
                    dp[i]++;
                }
            }else{
                if(i>=2 && Integer.parseInt(s.substring(i-2, i))>26){
                    dp[i]=dp[i-1];
                }else{
                    dp[i]=dp[i-1]+1;
                }
            }
        }
        return dp[s.length()];
    }
}
