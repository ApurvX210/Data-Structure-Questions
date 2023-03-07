import java.util.Arrays;

public class minsumDigit {
    public static long minSum(int arr[], int n)
    {
        Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        if(arr.length==1){
            return arr[0];
        }
        if(arr.length==0){
            return 0;
        }
        long a=0;
        long b=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                a=a*10+arr[i];
                // System.out.println(a);
            }else{
                b=b*10+arr[i];
            }
        }
        // System.out.println(a);
        // System.out.println(b);
        return a+b;
    }
    public static void main(String[] args) {
        int arr[]={5, 5, 7 ,3 ,8, 2, 2, 0 ,6, 9 ,5 ,4, 7 ,9, 7 ,6, 1, 4, 2, 9, 7, 8, 1, 1 ,1 ,7 ,5, 7, 8};
        System.out.println(minSum(arr, arr.length));
    }
}
