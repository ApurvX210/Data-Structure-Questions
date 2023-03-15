import java.util.Arrays;

public class Swap_Maximize {
    long maxSum(long arr[], int n) {
        Arrays.sort(arr);
        long a[]=new long[n];
        int j=0;
        for(int i=0;i<arr.length/2;i++){
            a[j]=arr[i];
            a[++j]=arr[n-1-i];
            j++;
        }
        if(n%2!=0){
            a[j]=arr[arr.length/2];
        }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(a[i]+" ");
        // }
        long ans=0;
        for(int i=1;i<n;i++){
            ans+=(Math.abs(a[i]-a[i-1]));
        }
        ans+=Math.abs(a[n-1]-a[0]);
        return ans;
    }

    public static void main (String[] args)
    {
        long arr[] = { 4, 2, 1, 8 };
        int n = arr.length;
        System.out.println(maxSum(arr, n));
    }
}
