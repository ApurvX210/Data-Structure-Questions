import java.util.ArrayList;
import java.util.List;

class mincoin{
    static List<Integer> minPartition(int N)
    {
        int arr[]={2000,500,200,100,50,20,10,5,2,1};
        List<Integer> ans=new ArrayList<>();
        int i=0;
        while(N>0){
            if(N-arr[i]>=0){
                ans.add(arr[i]);
                N-=arr[i];
            }else{
                i++;
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        System.out.println("hello");
    }
}