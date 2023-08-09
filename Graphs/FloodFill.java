import java.util.ArrayList;
import java.util.Stack;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        helper(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    public void helper(int image[][],int i,int j,int color,int num){
        if(i < 0 || j < 0 || i >= image.length || j >= image[0].length){
            return ;
        }
        if(image[i][j] != num || image[i][j] == color){
            return ;
        }
        image[i][j] = color;
        helper(image,i+1,j,color,num);
        helper(image,i-1,j,color,num);
        helper(image,i,j+1,color,num);
        helper(image,i,j-1,color,num);
    }
}
