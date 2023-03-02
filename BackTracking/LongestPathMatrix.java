public class LongestPathMatrix {
    public static void l(int[][] mat,int n,int m,int xs,int ys,int xd,int yd,int arr[][],int ans[],int count) {
        if(xs>=0 && xs<mat.length && ys>=0 && ys<mat[0].length && arr[xs][ys]==0 && mat[xs][ys]==1){
            arr[xs][ys]=1;
            count++;
            if(xs==xd && ys==yd){
                ans[0]=Integer.max(ans[0], count);
                arr[xs][ys]=0;
                return;
            }
            l(mat, n, m, xs-1, ys, xd, yd, arr, ans,count);
            l(mat, n, m, xs+1, ys, xd, yd, arr, ans,count);
            l(mat, n, m, xs, ys+1, xd, yd, arr, ans,count);
            l(mat, n, m, xs, ys-1, xd, yd, arr, ans,count);
            arr[xs][ys]=0;
        }
    }
    public static int longestPath(int[][] mat,int n,int m,int xs,int ys,int xd,int yd) {
        int arr[][]=new int[n][m];
        int ans[]=new int[1];
        ans[0]=-1;
        l(mat, n, m, xs, ys, xd, yd, arr, ans,-1);
        return ans[0];
    }
    public static void main (String[] args) {
 
        // input matrix with hurdles shown with number 0
        int mat[][] = { { 1, 1, 1},
                       { 1, 1, 1},
                       { 1, 1, 1},
                       { 0, 1, 1},
                       { 1, 1, 1},
                       { 1, 1, 1},
                    
                    };
     
        // find longest path with source (0, 0) and
        // destination (1, 7)
        System.out.println(longestPath(mat,mat.length,mat[0].length, 3, 1, 2, 2));
     
      }
}
