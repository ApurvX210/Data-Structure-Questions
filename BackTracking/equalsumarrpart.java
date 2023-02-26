import java.util.ArrayList;
import java.util.Arrays;

public class equalsumarrpart {
    static int possible(int arr[],int current,int sum,int index,ArrayList<Integer> a){
        if(current==sum){
            System.out.println(a);
            return 1;
        }
        if(current>sum){
            return 0;
        }
        for(int i=index;i<arr.length;i++){
            a.add(arr[i]);
            if(possible(arr, current+arr[i], sum-arr[i], i+1,a)==1){
                return 1;
            }
            a.remove(a.size()-1);
        }
        return 0;
    }
    static int equalPartition(int N, int arr[])
    {
        Arrays.sort(arr);
        int sum=0;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return possible(arr, 0, sum ,0,a);
    }
    public static void main(String[] args) {
        int arr[]={1,5,11,5};
        System.out.println(equalPartition(4, arr));
    }
}
