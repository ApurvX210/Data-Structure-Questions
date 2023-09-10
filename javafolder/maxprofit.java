import java.util.Arrays;

public class maxprofit {
    
    public static int maxProfit(int[] arr) {
        if(arr.length==1){
            return 0;
        }
         int min=arr[0];
         int ans=Integer.MIN_VALUE;
         for(int i=1;i<arr.length;i++){
             min=Integer.min(min,arr[i]);
             ans=Integer.max(ans,(arr[i]-min));
         }
         return ans;
     }
    public static void main(String[] args) {
        int arr[]={2,1,2,1,0,0,1};
        int ans=maxProfit(arr);
        System.out.println(ans);
    }
}
