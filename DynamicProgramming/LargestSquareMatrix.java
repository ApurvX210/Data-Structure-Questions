public class LargestSquareMatrix {
    static int maxSquare(int n, int m, int mat[][]){
        int dp[][]=new int[n][m];
        int ans=0;
        for(int i=0;i<n;i++){
            dp[i][0]=mat[i][0];
            ans=Integer.max(ans,dp[i][0]);
        }
        for(int i=0;i<m;i++){
            dp[0][i]=mat[0][i];
            ans=Integer.max(ans,dp[0][i]);
        }
        
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(mat[i][j]==0){
                    dp[i][j]=0;
                }else{
                    if(mat[i][j-1]==1 && mat[i-1][j]==1 && mat[i-1][j-1]==1){
                        dp[i][j]=2;
                    }else{
                        dp[i][j]=1;
                    }
                    if(dp[i][j-1]==dp[i-1][j] && dp[i][j-1]==dp[i-1][j-1]){
                        dp[i][j]=dp[i-1][j-1]+1;
                    }
                }
                ans=Integer.max(ans,dp[i][j]);
            }
        }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(dp[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        return ans;
    }
}
