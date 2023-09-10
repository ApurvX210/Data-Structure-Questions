import java.util.ArrayList;

public class ratinmaze {
    public static void path(int [][] m,int x,int y,ArrayList<String> a,String s,int pat[][]){
        if(x==m.length-1 && y==m[0].length-1 && m[x][y]==1){
            a.add(s);
            return;
        }
        if(x<m.length && x>=0 && y>=0 && y<m[0].length && m[x][y]==1 && pat[x][y]!=1){
            pat[x][y]=1;
            path(m, x-1, y, a, s+"U",pat);
            path(m, x+1, y, a, s+"D",pat);
            path(m, x, y-1, a, s+"L",pat);
            path(m, x, y+1, a, s+"R",pat);
            pat[x][y]=0;
        }
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> a=new ArrayList<>();
        int pat[][]=new int[n][n];
        path(m,0,0,a,"",pat);
        return a;
    }
    public static void main(String args[])
    {
        int maze[][] = {{1, 0, 0, 0},
        {1, 1, 0, 1}, 
        {1, 1, 0, 0},
        {0, 1, 1, 1}};
        ArrayList<String> a=findPath(maze, 4);
        for(String i:a){
            System.out.println(i);
        }
        
    }
}
