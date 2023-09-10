public class rotatemat {
    public static void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<=j){
                    int a=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=a;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int a=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=a;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int mat[][] = { {1,2,3},{4,5,6},{7,8,9} };
 
        rotate(mat);
    }
}
