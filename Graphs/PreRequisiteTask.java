public class PreRequisiteTask {
    public boolean isPossible(int n,int m, int[][] edges)
    {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        int[] indeg = new int[n];
        
        for (int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            indeg[v]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            if (indeg[i] == 0) {
                q.add(i);
            }
        }
        
        while (!q.isEmpty()) {
            int curr = q.poll();
            
            for (int neighbor : graph.get(curr)) {
                indeg[neighbor]--;
                
                if (indeg[neighbor] == 0) {
                    q.add(neighbor);
                }
            }
        }
        
        boolean ans=true;
        for(int i=0;i<n;i++){
            if(indeg[i]>0){
                ans=false;
                break;
            }
        }
        return ans;
    }
}
