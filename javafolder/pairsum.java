import java.util.*;
public class pairsum {
    public static boolean findPairSum(int[] arr, int sum) {
        int index=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                index=i;
                break;
            }
        }
        int l=-1;int h=-1;
        if(index!=-1){
            l=index;
            h=index-1;
        }else{
            l=0;
            h=arr.length-1;
        }
        while(l!=h){
    
            if(arr[l]+arr[h]>sum){
                if(h==0){
                    h=arr.length-1;
                }
                else{
                    h--;
                }
            }else if(arr[l]+arr[h]<sum){
                if(l==arr.length-1){
                    l=0;
                }
                else{
                    l++;
                }
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<arr.length;j++){
                arr[j]=sc.nextInt();
            }
            if(findPairSum(arr, k)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        // int arr[]={8,10,11,1};
        // System.out.println(findPairSum(arr, 2));
    }
}
