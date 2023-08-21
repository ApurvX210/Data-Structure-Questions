public class Topological {
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int res[]=new int[V];
        int c[]=new int[V];
        for(int i=0;i<V;i++){
            for(int j:adj.get(i)){
                c[j]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<c.length;i++){
            if(c[i]==0){
                q.add(i);
            }
        }
        int h=0;
        int no=0;
        while(!q.isEmpty()){
            no=q.poll();
            res[h]=no;
            h++;
            for(int i:adj.get(no)){
                c[i]--;
                if(c[i]==0){
                    q.add(i);
                }
            }
        }
        return res;
    }
}
