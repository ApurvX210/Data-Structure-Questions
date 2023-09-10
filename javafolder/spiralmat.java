import java.util.*;
public class spiralmat {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        boolean x=false;
        boolean y=true;
        boolean x1=true;
        boolean y1=true;
        int i=0;
        int j=0;
        List<Integer> l=new ArrayList<>();
        while(left<=right && top<=bottom){
            if(x){
                while(i>=top && i<=bottom){
                    l.add(matrix[i][j]);
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
                while(j>=left && j<=right){
                    l.add(matrix[i][j]);
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
        return l;

    }
    public static void main(String[] args) {
        int arr[][] = {
            { 1, 2, 3, 4 },    
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 }, 
            { 13, 14, 15, 16 },
            { 17, 18, 19, 20 },
        };
        List<Integer> l=spiralOrder(arr);
        System.out.println(l);
    }
}
