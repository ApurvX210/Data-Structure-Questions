public class SnakeLadder {
    public void value(int[][] board,int num,int count,int ans[],int[][] visited){
        int n=board.length;
        if(num>=(n*n)){
            ans[0]=Integer.min(ans[0], count);
            return;
        }
        int row=num/n;
        int column;
        if(row%2==0){
            column=num%n;
        }else{
            column=n-1-(num%n);
        }
        row=n-1-row;
        System.out.println(num);
        if(visited[row][column]!=1){
            visited[row][column]=1;
        }else{
            return;
        }
        for(int i=1;i<=Integer.min(num+6, n*n);i++){
            row=(num+i)/n;
            if(row%2==0){
                column=num%n;
            }else{
                column=n-1-(num%n);
            }
            row = n - 1 - row;
            System.out.println(row+" "+column);
            if(board[row][column]!=-1){
                // System.out.println(num+i+" m");
                value(board, board[row][column], count+1,ans,visited);
            }else{
                
                    value(board, num+i, count+1,ans,visited);
                
            }
        }
    }
    public int snakesAndLadders(int[][] board) {
        int [][] visited=new int[board.length][board.length];
        int ans[]=new int[1];
        visited[board.length-1][0]=1;
        ans[0]=Integer.MAX_VALUE;
        value(board, 1, 0, ans,visited);
        return ans[0];
    }
}
