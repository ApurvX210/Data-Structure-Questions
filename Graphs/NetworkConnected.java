public class NetworkConnected {
    public int makeConnected(int n, int[][] connections) {
        int m[]=new int[n];
        int d[]=new int[n];
        for(int i=0;i<n;i++){
            m[i]=-1;
            d[i]=-1;
        }
        int count=0;
        for(int i=0;i<connections.length;i++){
            if(m[connections[i][0]]==-1 && m[connections[i][1]]==-1){
                m[connections[i][0]]=Integer.min(connections[i][0], connections[i][1]) ;
                m[connections[i][1]]=m[connections[i][0]];
                d[m[connections[i][0]]]=m[connections[i][0]];
            }else if(m[connections[i][0]]==-1 && m[connections[i][1]]!=-1){
                m[connections[i][0]]=connections[i][1];
            }else if(m[connections[i][0]]!=-1 && m[connections[i][1]]==-1){
                m[connections[i][1]]=connections[i][0];
            }else{
                if(m[connections[i][0]]<m[connections[i][1]] && m[connections[i][0]]!=d[m[connections[i][1]]]){
                    d[m[connections[i][1]]]=m[connections[i][0]];
                }else if(m[connections[i][0]]>m[connections[i][1]] && m[connections[i][1]]!=d[m[connections[i][0]]]){
                    d[m[connections[i][0]]]=m[connections[i][1]];
                }else{
                    count++;
                }
            }
        }
        int p=0;
        for(int i=0;i<n;i++){
            System.out.print(d[i]+" ");
            if(d[i]==i){
                p++;
            }
            if(m[i]==-1){
                p++;
            }
        }
        System.out.println(count+" "+p);
        if(count<p-1){
            return -1;
        }else{
            return p-1;
        }
    }
}
