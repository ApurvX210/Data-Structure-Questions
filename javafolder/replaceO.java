public class replaceO {
    static void replace(int x,int y,char a[][],int[][]pat){
        if(x<0 || y<0 || x>=a.length || y>=a[0].length || pat[x][y]==1 || a[x][y]=='X'){
            return;
        }
        pat[x][y]=1;
        replace(x+1, y, a,pat);
        replace(x, y-1, a,pat);
        replace(x, y+1, a,pat);
        replace(x-1, y, a,pat);
    }
    static char[][] fill(int n, int m, char a[][])
    {
        int[][] pat=new int[n][m];
        for(int i=0;i<n;i++){
            if(a[i][0]=='O' && pat[i][0]==0){
                replace(i, 0, a,pat);
            }
        }
        for(int i=0;i<n;i++){
            if(a[i][m-1]=='O' && pat[i][m-1]==0){
                replace(i, m-1, a,pat);
            }
        }
        for(int i=0;i<m;i++){
            if(a[0][i]=='O' && pat[0][i]==0){
                replace(i, 1, a,pat);
            }
        }
        for(int i=0;i<m;i++){
            if(a[n-1][i]=='O' && pat[n-1][i]==0){
                replace(i, m-1, a,pat);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]=='O' && pat[i][j]==0){
                    a[i][j]='X';
                }
            }
        }
        return a;
    }
    public static void main (String[] args)
    {
        char[][] mat = {{'X', 'X', 'X', 'X'}, 
        {'X', 'O', 'X', 'X'}, 
        {'X', 'O', 'O', 'X'}, 
        {'X', 'O', 'X', 'X'}, 
        {'X', 'X', 'O', 'O'}};
                         
        fill(mat.length,mat[0].length,mat);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
