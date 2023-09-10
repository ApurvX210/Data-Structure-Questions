public class minrot {
    public static int findMin(int[] arr) {
        int low=0;
        int high=arr.length-1;
        int mid=-1;
        while(low<high){
            if(arr[low]>arr[high]){
                mid=(low+high)/2;
                if(arr[mid]>arr[low]){
                    low=mid+1;
                }else{
                    high=mid;
                }
            }else{
                return arr[low];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={11,13,15,17};
        System.out.println(findMin(arr));

    }
}
