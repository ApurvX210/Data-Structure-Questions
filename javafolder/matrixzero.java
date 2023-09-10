public class matrixzero {
    public static void setZeroes(int[][] matrix) {
        int a=matrix.length;
        int b=matrix[0].length;
        boolean flag[]=new boolean[2];
        int m=0;
        int n=0;
        for(int i=0;i<a;i++){
            flag[m]=false;
            for(int j=0;j<b;j++){
                if(matrix[i][j]==0 && i==0){
                    flag[m]=true;
                    matrix[i+1][j]++;
                }else if(i>0 && matrix[i][j]==1 && matrix[i-1][j]==0){
                    flag[m]=true;
                    matrix[i+1][j]++;
                    matrix[i][j]=0;
                }else if(i>0 && matrix[i-1][j]==0){
                    matrix[i][j]=0;
                    if(i+1<a){
                        matrix[i+1][j]++;
                    }
                }else if(i>0 && matrix[i][j]==0){
                    flag[m]=true;
                    if(i+1<a){
                        matrix[i+1][j]++;
                    }
                    for(int p=i-1;p>=0;p--){
                        matrix[p][j]=0;
                    }
                }
            }
            if(m==1){
                if(flag[n]){
                    for(int j=0;j<b;j++){
                        matrix[i-1][j]=0;
                    }
                }
                n++;
            }else if(m==0 && n!=0){
                if(flag[n]){
                    for(int j=0;j<b;j++){
                        matrix[i-1][j]=0;
                    }
                }
                n=0;
            }
            m++;
            if(m==2){
                m=0;
            }
        }
        if(m==1){
            if(flag[n]){
                for(int j=0;j<b;j++){
                    matrix[a-1][j]=0;
                }
            }
            n++;
        }else if(m==0 && n!=0){
            if(flag[n]){
                for(int j=0;j<b;j++){
                    matrix[a-1][j]=0;
                }
            }
            n=0;
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int M[][] = {{-4,-2147483648,6,-7,0},{-8,6,-8,-6,0},{2147483647,2,-9,-6,-10}};
        setZeroes(M);
    }
}
