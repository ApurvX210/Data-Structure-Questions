import java.util.*;
public class alternativeXO {
    public static void spiralOrder(int a,int b) {
        int left=0;
        int right=b-1;
        int top=0;
        int bottom=a-1;
        boolean x=false;
        boolean y=true;
        boolean x1=true;
        boolean y1=true;
        int i=0;
        int j=0;
        char[][] matrix=new char[a][b];
        char r='X';
        int num=0;
        while(left<=right && top<=bottom){
            if(x){
                if(num==4){
                    if(r=='X'){
                        r='O';
                    }else{
                        r='X';
                    }
                    num=0;
                }
                num++;
                while(i>=top && i<=bottom){
                    matrix[i][j]=r;
                    if(x1){
                        if(i==bottom){
                            break;
                        }
                        i++;
                    }else{
                        if(i==top){
                            break;
                        }
                        i--; 
                    }
                }
                if(x1){
                    right--;
                    j--;
                    x1=false;
                }else{
                    left++;
                    j++;
                    x1=true;
                }
                x=false;
                y=true;
            }
            if(y){
                if(num==4){
                    if(r=='X'){
                        r='O';
                    }else{
                        r='X';
                    }
                    num=0;
                }
                num++;
                while(j>=left && j<=right){
                    matrix[i][j]=r;
                    if(y1){
                        if(j==right){
                            break;
                        }
                        j++;
                    }else{
                        if(j==left){
                            break;
                        }
                        j--;
                    }
                }
                if(y1){
                    top++;
                    i++;
                    y1=false;
                }else{
                    bottom--;
                    i--;
                    y1=true;
                }
                y=false;
                x=true;
            }
        }
        for(int m=0;m<matrix.length;m++){
            for(int n=0;n<matrix[0].length;n++){
                System.out.print(matrix[m][n]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        spiralOrder(5, 5);
    }
}
