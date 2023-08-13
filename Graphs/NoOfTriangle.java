public class NoOfTriangle {
    public static int numberOfTriangles(int n, int[][] g) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (g[i][j] == 1 && i!=j) {
                    for (int k = 0; k < n; k++) {
                        if (g[j][k] == 1 && j!=k) {
                            if(g[k][i]==1){
                                ans++;
                            }
                        }
                    }
                }
                g[i][j] = 0;
            }
        }
        return ans;
    }
}
