public class NegativeCycle {
    public int isNegativeWeightCycle(int n, int[][] edges) {
        int[] distance = new int[n];
        if(edges.length==0){
            return 0;
        }
        for (int i = 0; i < n; i++) {
            if(edges[0][0]!=i){
                distance[i] = Integer.MAX_VALUE-500;
            }
            
        }
        for (int i = 0; i < n-1 ; i++) {
            for (int j = 0; j < edges.length; j++) {
                if (distance[edges[j][1]] > distance[edges[j][0]] + edges[j][2]) {
                    distance[edges[j][1]] = distance[edges[j][0]] + edges[j][2];
                }
            }
        }
        for (int j = 0; j < edges.length; j++) {
            if (distance[edges[j][1]] > distance[edges[j][0]] + edges[j][2]) {
                return 1;
            }
        }
        return 0;

    }
}
