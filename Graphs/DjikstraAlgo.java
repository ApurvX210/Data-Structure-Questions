import java.util.ArrayList;
import java.util.Stack;

public class DjikstraAlgo {
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        int ans[]=new int[V];
        int a[][]=new int[V][V];
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                a[i][j]=Integer.MAX_VALUE;
            }
        }
        int visited[]=new int[V];
        int t=S;
        visited[t]=1;
        for(int i=0;i<V;i++){
            visited[t]=1;
            ArrayList<ArrayList<Integer>> d=adj.get(t);
            if(i>0){
                a[i][t]=a[i-1][t];
            }else{
                a[i][t]=0;
            }
            for(ArrayList<Integer> j:d){
                if(i>0){
                    a[i][j.get(0)]=Integer.min(a[i][t]+j.get(1), a[i-1][j.get(0)]);
                }else{
                    a[i][j.get(0)]=a[i][t]+j.get(1);
                }
            }
            int index=-1;
            for(int m=0;m<V;m++){
                if(i>0){
                    a[i][m]=Integer.min(a[i-1][m], a[i][m]);
                }
                if(visited[m]==0){
                    if(index==-1){
                        index=m;
                    }else{
                        if(a[i][index]>a[i][m]){
                            index=m;
                        }
                    }
                }
            }
            if(index==-1){
                break;
            }
            t=index;
        }
        for(int i=0;i<V;i++){
            ans[i]=a[V-1][i];
        }
        return ans;
    }
}
