import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class klargestStream {
    static int[] kthLargest(int k, int[] arr, int n) {
        // code here
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        int[] ans = new int[n];
        for(int i = 0;i<n;i++){
            if(minHeap.size()<k){
                minHeap.offer(arr[i]);
            }
            else if(arr[i]>minHeap.peek()){
                minHeap.poll();
                minHeap.offer(arr[i]);
            }
            if(minHeap.size()<k){
                ans[i]=-1;
            }
            else{
                ans[i]=minHeap.peek();
            }
        }
        return ans;
    }
}
