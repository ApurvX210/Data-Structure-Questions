public class sticklerthief {
    public static int FindMaxSum(int arr[], int n)
    {
        int ans=0;
        int a[]=new int[n];
        int odd=0;
        int even=0;
        for(int i=n-1;i>=0;i--){
            if(i%2==0){
                even+=arr[i];
                a[i]=even;
            }else{
                odd+=arr[i];
                a[i]=odd;
            }
        }
        int i=0;
        while(i<n){
            if(a[i]<a[i+1]){
                if(arr[i]>arr[i+1]){
                    ans+=arr[i];
                    i+=3;
                    if(i==n-1){
                        ans+=arr[n-1];
                        break;
                    }
                }else{
                    ans+=arr[i+1];
                    i+=3;
                    if(i==n-1){
                        ans+=arr[n-1];
                        break;
                    }
                }
            }else{
                ans+=arr[i];
                i+=2;
                if(i==n-1){
                    ans+=arr[n-1];
                    break;
                }
            }
        }
        return ans;
    }public static void main(String args[])
    {
   
      // Creating the array
      int[] arr = {3,2,5,10,7};
      int N = arr.length;
   
      // Function call
      System.out.println(FindMaxSum(arr, N));
    }
}
