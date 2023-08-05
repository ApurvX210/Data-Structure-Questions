public class OptimalStratergyGame {
    static long maxi(int arr[],int l,int h){
        if(l>h){
            return 0;
        }
        if(l==h){
            return arr[l];
        }
        return Integer.max(maxi(arr, l+1, h-1)+arr[l], Integer.max(maxi(arr, l+2, h)+arr[l], Integer.max(maxi(arr, l+1, h-1)+arr[h], maxi(arr, l, h-2)+arr[h])));
    }
    static long countMaximum(int arr[], int n)
    {
        return maxi(arr, 0, n-1);
    }
}
