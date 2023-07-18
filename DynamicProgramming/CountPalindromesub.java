public class CountPalindromesub {
    long countPS(String S)
    {
        long dp[][]=new int[S.length()+1][S.length()+1];
        String S1="";
        for(int i=S.length()-1;i>=0;i--){
            S1+=S.charAt(i);
        }
        long a=0;
        for(int i=1;i<=S.length();i++){
            for(int j=1;j<=S.length();j++){
                if(S.charAt(i-1)==S1.charAt(j-1)){
                    if(dp[i-1][j-1]==0){
                        dp[i][j]=dp[i-1][j]+dp[i][j-1];
                    }
                    dp[i][j]=dp[i-1][j-1]*2+1;
                    
                }else{
                    dp[i][j]=Long.max(dp[i-1][j], Long.max(dp[i][j-1],dp[i-1][j-1]));
                }
            }
        }
        for(int i=0;i<=S.length();i++){
            for(int j=0;j<=S.length();j++){
                System.out.print(dp[i][j]+" ");
            }System.out.println();
        }
        return Long.max(dp[S.length()][S.length()], S.length())%((Long)Math.pow(10, 9)+7);
    }public static void main(String[] args) {
        System.out.println(2*2);
    }
}
