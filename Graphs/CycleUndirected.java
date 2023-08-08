import java.util.ArrayList;

public class CycleUndirected {
    public boolean cyclic(int i, boolean[] visited,
            boolean[] recStack,ArrayList<ArrayList<Integer>> adj,int n) {
        if (recStack[i]){
            if(adj.get(n).contains(i)){
                return false;
            }
            return true;
        }
            

        if (visited[i])
            return false;

        visited[i] = true;

        recStack[i] = true;
        List<Integer> children = adj.get(i);

        for (Integer c : children)
            if (cyclic(c, visited, recStack,adj,i))
                return true;

        recStack[i] = false;

        return false;
    }

    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (cyclic(i, visited, recStack,adj))
                return true;
        }

        return false;
    }
}
