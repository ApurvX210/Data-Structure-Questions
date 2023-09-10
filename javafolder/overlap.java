import java.util.*;
import java.util.Comparator;

public class overlap {
    public static int[][] overlappedInterval(int[][] arr)
    {
        if(arr.length==1){
            return arr;
        }
        Arrays.sort(arr,new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
            
        });
        int[][]ans=new int[arr.length][2];
        int a,b;
        a=arr[0][0];
        b=arr[0][1];
        int cnt=0;
        for(int i=1;i<arr.length;i++){
            if(b>=arr[i][0]){
                if(b<arr[i][1]){
                    b=arr[i][1];
                }
                if(i==arr.length-1){
                    ans[cnt][0]=a;
                    ans[cnt][1]=b;
                    cnt++;
                }
            }else{
                ans[cnt][0]=a;
                ans[cnt][1]=b;
                cnt++;
                a=arr[i][0];
                b=arr[i][1];
                if(i==arr.length-1){
                    ans[cnt][0]=a;
                    ans[cnt][1]=b;
                    cnt++;
                }
                
            }
        }
        int ans1[][]=new int[cnt][2];
        for(int i=0;i<ans1.length;i++){
            ans1[i][0]=ans[i][0];
            ans1[i][1]=ans[i][1];
        }
        return ans1;
    }
    public static void main(String[] args) {
        int ans[][]= {{1,3},{2,4},{6,8},{9,10}};
        int arr[][]=overlappedInterval(ans);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j] +" ");
            }
        }
    }
}
