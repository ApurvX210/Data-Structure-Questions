public class mostwater {
    public static int maxArea(int[] arr){
        int low=0;
        int high=arr.length-1;
        int ans=0;
        while(low<high){
            if(arr[low]<=arr[high]){
                int cap=(high-low)*arr[low];
                ans=Integer.max(ans, cap);
                low++;
            }else if(arr[low]>arr[high]){
                int cap=(high-low)*arr[high];
                ans=Integer.max(ans, cap);
                high--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
