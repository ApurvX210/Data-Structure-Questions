import java.util.Arrays;

public class mergearr {
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int i=0;
        int j=0;
        int count=0;
        while(count!=n){
            if(j==m && i<n){
                i++;
                count++;
            }else if(i==n && j<m){
                j++;
                count++;
            }
            else if(arr1[i]<=arr2[j]){
                i++;
                count++;
            }else{
                j++;
                count++;
            }
        }
        for(int k=0;k<j;k++){
            long a=arr1[i+k];
            arr1[i+k]=arr2[k];
            arr2[k]=a;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    public static void main(String[] args) {
        long arr1[] = new long[]{1, 4, 18, 19, 19 ,28, 29, 32, 35 ,35 ,39, 39, 44, 49, 49, 50, 50};
        long arr2[] = new long[]{8 ,34};
        merge(arr1,arr2,arr1.length,arr2.length);
        System.out.print("After Merging nFirst Array: ");
        System.out.println(Arrays.toString(arr1));
        System.out.print("Second Array:  ");
        System.out.println(Arrays.toString(arr2));
    }
}
