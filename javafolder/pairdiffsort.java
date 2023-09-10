import java.util.*;
public class pairdiffsort {
    public static boolean findPair(int arr[], int size, int n)
    {
        Arrays.sort(arr);
        int h=size-1;
        int l=h-1;
        if(n<0){
            n=-n;
        }
        while(l>=0 && h>=0){
            if(arr[h]-arr[l]==n){
                return true;
            }
            else if(arr[h]-arr[l]<n){
                l--;
            }else{
                h--;
                if(h==l){
                    l--;
                }
            }
        }
        return false;
    }
    public static void main (String[] args)
    {
        int arr[] = {1, 8, 30, 40, 100};
        int n = -60;
        System.out.println(findPair(arr,arr.length,n));
    }
}
