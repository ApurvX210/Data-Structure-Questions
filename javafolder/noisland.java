public class noisland {
    public static void count(char[][] grid,int ans[][],int x,int y,int a){
        if(x>=0 && y>=0 && x<grid.length && y<grid[0].length && grid[x][y]!='0' && ans[x][y]==0){
            ans[x][y]=a;
            count(grid, ans, x, y+1, a);
            count(grid, ans, x, y-1, a);
            count(grid, ans, x+1, y, a);
            count(grid, ans, x+1, y+1, a);
            count(grid, ans, x+1, y-1, a);
            count(grid, ans, x-1, y, a);
            count(grid, ans, x-1, y-1, a);
            count(grid, ans, x-1, y+1, a);
        }
    }
    public  static int numIslands(char[][] grid) {
        int ans[][]=new int[grid.length][grid[0].length];
        int a=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(ans[i][j]==0 && grid[i][j]=='1'){
                    a++;
                    count(grid, ans ,i ,j,a);
                }
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                System.out.print(ans[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println(a);
        return a;
        
    }
    public static void main(String[] args) {
        char M[][] = new char[][] { { '1', '1', '0', '1', '1' },
                                  { '0', '1', '1', '0', '0' },
                                  { '1', '0', '0', '0', '1' },
                                  { '0', '0', '0', '0', '0' },
                                  { '1', '0', '1', '0', '1' } };
        char M1[][] = new char[][] { { '0', '1' },
                                  { '1', '0' },
                                  { '1', '1'},
                                  { '1', '0' }
                                   };
        
        numIslands(M1);
        
    }
}
// int[][] ans=new int[grid.length][grid[0].length];
//         int count=1;
//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[0].length;j++){
//                 if(grid[i][j]=='1'){
//                     int a=Integer.MAX_VALUE;
//                     if(j-1 >=0 && ans[i][j-1]!=0){
//                         a=Integer.min(a,ans[i][j-1]);
//                     }
//                     if(i-1 >=0 && ans[i-1][j]!=0){
//                         a=Integer.min(a,ans[i-1][j]);
//                     }
//                     if(j-1 >=0 && i-1 >=0 && ans[i-1][j-1]!=0){
//                         a=Integer.min(a,ans[i-1][j-1]);
//                     }
//                     if(i-1 >=0 && j+1<grid[0].length && ans[i-1][j+1]!=0){
//                         a=Integer.min(a,ans[i-1][j+1]);
//                     }
//                     if(a!=Integer.MAX_VALUE){
//                         ans[i][j]=a;
//                         if(j-1 >=0 && ans[i][j-1]!=0){
//                             ans[i][j-1]=Integer.min(ans[i][j-1], a);
//                         }
//                         if(i-1 >=0 && ans[i-1][j]!=0){
//                             ans[i-1][j]=Integer.min(ans[i-1][j], a);
//                         }
//                         if(j-1 >=0 && i-1 >=0 && ans[i-1][j-1]!=0){
//                             ans[i-1][j-1]=Integer.min(ans[i-1][j-1], a);
//                         }
//                         if(i-1 >=0 && j+1<grid[0].length && ans[i-1][j+1]!=0){
//                             if(a<ans[i-1][j+1]){
//                                 ans[i-1][j+1]=a;
//                                 for(int x=j+1;x<grid[0].length;x++){
//                                     if(ans[i-1][x]!=0){
//                                         ans[i-1][x]=a;
//                                     }else{
//                                         break;
//                                     }
//                                 }
//                             }
//                         }
//                     }else{
//                         ans[i][j]=count;
//                         count++;
//                     }
//                 }
//             }
//         }
//         for(int i=0;i<ans.length;i++){
//             for(int j=0;j<ans[0].length;j++){
//                 System.out.print(ans[i][j]+" ");
//             }
//             System.out.println();
            
//         }
//         int c=0;
//         int a=0;
//         for(int i=0;i<ans.length;i++){
//             for(int j=0;j<ans[0].length;j++){
//                 if(ans[i][j]>c){
//                     a++;
//                     c=ans[i][j];
//                 }
//             }
            
//         }
//         System.out.println(a);
//         return a;
