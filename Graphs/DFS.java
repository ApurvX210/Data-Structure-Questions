import java.util.ArrayList;
import java.util.Stack;

public class DFS {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        Stack<Integer> q=new Stack<>();
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> r=new ArrayList<>();
        q.add(0);
        while(q.size()>0){
            int num=q.pop();
            if(r.contains(num)){
                continue;
            }
            a.add(num);
            r.add(num);
            ArrayList<Integer> ar=adj.get(num);
            for(int i=ar.size()-1;i>=0;i--){
                q.add(ar.get(i));
            }
        }
        return a;
    }
}
