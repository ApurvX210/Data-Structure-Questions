import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queuereverse {
    public Queue<Integer> rev(Queue<Integer> q){
        int arr[]=new int[q.size()];
        int i=0;
        while(q.size()!=0){
            arr[i]=q.poll();
            i++;
        }
        for(int j=arr.length-1;j>=0;j--){
            q.add(arr[j]);
        }
        return q;

    }
}
