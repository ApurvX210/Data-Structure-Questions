import java.util.ArrayList;
import java.util.HashMap;

public class MinTimeJob {
    public static int[] minimumTime(int n, int m, int[][] edges) {
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        int[] indeg = new int[n];
        int[] job = new int[n];
        
        for (int i = 0; i < m; i++) {
            int u = edges[i][0] - 1;
            int v = edges[i][1] - 1;
            graph.get(u).add(v);
            indeg[v]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            if (indeg[i] == 0) {
                q.add(i);
                job[i] = 1;
            }
        }
        
        while (!q.isEmpty()) {
            int curr = q.poll();
            
            for (int neighbor : graph.get(curr)) {
                indeg[neighbor]--;
                
                if (indeg[neighbor] == 0) {
                    q.add(neighbor);
                    job[neighbor] = 1 + job[curr];
                }
            }
        }
        
        return job;
    }
}
