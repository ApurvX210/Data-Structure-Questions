import java.util.LinkedList;
import java.util.Queue;

public class StepKnight {
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        int[][] step={{2,-1},{2,1},{-2,-1},{-2,1},{1,2},{-1,2},{1,-2},{-1,-2}};
        int [][] visited=new int[N][N];
        Queue<int[]> q=new LinkedList<>();
        q.add(KnightPos);
        int size=q.size();
        int count=0;
        while(q.size()>0){
            int a[]=q.poll();
            // System.out.println(a[0]+" "+a[1]);
            if(visited[a[0]-1][a[1]-1]==1){
                size--;
                if(size==0){
                    size=q.size();
                    count++;
                }
                continue;
            }
            if(a[0]==TargetPos[0] && a[1]==TargetPos[1]){
                break;
            }
            visited[a[0]-1][a[1]-1]=1;
            for(int i=0;i<step.length;i++){
                if(a[0]+step[i][0]>=1 && a[0]+step[i][0]<=N && a[1]+step[i][1]>=1 && a[1]+step[i][1]<=N){
                    int n[]={a[0]+step[i][0],a[1]+step[i][1]};
                    q.add(n);
                }
            }
            size--;
            if(size==0){
                size=q.size();
                count++;
            }
        }
        return count;
    }
}
