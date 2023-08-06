import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> r=new ArrayList<>();
        q.add(0);
        while(q.size()>0){
            int num=q.poll();
            if(r.contains(num)){
                continue;
            }
            a.add(num);
            r.add(num);
            for(int i : adj.get(num)){
                q.add(i);
            }
        }
        return a;
    }
}
