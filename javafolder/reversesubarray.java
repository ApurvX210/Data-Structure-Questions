public class reversesubarray {
    static boolean checkReverse(int arr[], int n){
        int val=0;
        int num=-1;
        for(int i=1;i<arr.length;i++){
            if(val==2 && arr[i]<arr[i-1]){
                return false;
            }
            else if(val==1 && arr[i]<arr[i-1]){
                continue;
            }else if(val==1 && arr[i]>arr[i-1]){
                val=2;
                if(num>arr[i]){
                    return false;
                }
            }
            else if(val==0 && arr[i]>arr[i-1]){
                continue;
            }else if(val==0 && arr[i]<arr[i-1]){
                num=arr[i];
                val=1;
            }
        }
        return true;
    }
    public static void main(String[] args) {
 
        int arr[] = { 1, 2, 4, 5, 3 };
        int n = arr.length;
 
        if (checkReverse(arr, n)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
