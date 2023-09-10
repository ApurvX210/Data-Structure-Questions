import java.util.PriorityQueue;

public class mincostrope {
    long minCost(long arr[], int n) 
    {
        PriorityQueue<Long> q=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            q.add(arr[i]);
        }
        // for(long i : q){
        //     System.out.print(i+" ");
        // }
        long ans=0;
        while(q.size()>0){
            if(q.size()==1){
                return ans;
            }
            long a=q.poll();
            a+=q.poll();
            ans+=a;
            q.add(a);
        }
        return ans;
    }
}
