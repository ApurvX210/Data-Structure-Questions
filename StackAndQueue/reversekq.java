import java.util.Queue;

public class reversekq {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        int arr[]=new int[k];
        int i=0;
        int k1=k;
        while(k!=0){
            arr[i]=q.poll();
            i++;
            k--;
        }
        for(int j=arr.length-1;j>=0;j--){
            q.add(arr[j]);
        }
        for(int j=0;j<(q.size()-k1);j++){
            int num=q.poll();
            q.add(num);
        }
        return q;
    }
}
