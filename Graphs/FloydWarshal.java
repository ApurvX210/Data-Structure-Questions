public class FloydWarshal {
    public void shortest_distance(int[][] dist) {
        int i, j, k;
        int V=dist.length;
        for (i = 0; i < V; i++) {
            for (j = 0; j < V; j++) {
                if(dist[i][j]==-1){
                    dist[i][j]=2000;
                }
            }
        }

        for (k = 0; k < V; k++) {
            for (i = 0; i < V; i++) {
                for (j = 0; j < V; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }
        for (i = 0; i < V; i++) {
            for (j = 0; j < V; j++) {
                if(dist[i][j]==2000){
                    dist[i][j]=-1;
                }
            }
        }
    }
}
