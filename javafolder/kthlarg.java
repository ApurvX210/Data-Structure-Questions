import java.util.ArrayList;

public class kthlarg {
    public int pivot(int []arr,int l,int h){
        int piv=arr[h];
        int j=l-1;
        for(int i=l;i<h;i++){
            if(arr[i]<piv){
                j++;
                int a=arr[i];
                arr[i]=arr[j];
                arr[j]=a;
            }
        }
        j++;
        int a=arr[h];
        arr[h]=arr[j];
        arr[j]=a;
        return j;

    }
    public  int findKthLargest(int[] arr, int k) {
        int l=0;
        int h=arr.length-1;
        int size=arr.length;
        int piv=pivot(arr, 0, h);
        while(true){
            if((h-piv+1)>k){
                l=piv+1;
                size=(h-l+1);
                piv=pivot(arr, l, h);
            }else if((h-piv+1)<k){
                h=piv-1;
                k=k-(size-(h-l+1));
                size=(h-l+1);
                piv=pivot(arr, l, h);
            }else{
                return arr[piv];
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,2,1,5,6,4};
        System.out.println(new kthlarg().findKthLargest(arr, 2));
    }
}
