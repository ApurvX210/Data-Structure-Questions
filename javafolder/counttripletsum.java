import java.util.Arrays;

public class counttripletsum {
    static long countTriplets(long arr[], int n,int sum)
    {
        Arrays.sort(arr);
        long count=0;
        for(int i=0;i<arr.length;i++){
            long s=sum-arr[i];
            if(sum>0){
                int l=i+1;
                int h=arr.length-1;
                while(l<h){
                    if(arr[l]+arr[h]<s){
                        count+=(h-l);
                        l++;
                    }else if(arr[l]+arr[h]>=s){
                        h--;
                    }
                }
            }
        }
        return count;
    }public static void main(String[] args) {
        long arr[] = new long[]{5, 1, 3, 4, 7};
        int sum = 12;
        System.out.println(countTriplets(arr,arr.length, sum));
    }
}
