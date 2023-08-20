import java.util.ArrayList;
import java.util.Stack;
import java.util.TreeMap;

public class PrimsAlgo {
    static void add(Stack<int[]>s,int arr[]){
        if(s.size()==0 || arr[0]<s.peek()[0]){
            s.add(arr);
            return;
        }
        else{
            int a[]=s.pop();
            add(s, arr);
            s.add(a);
        }
    }
    static int spanningTree(int n, int m, int edges[][]) {
        int arr[][] = new int[n][n];
        for (int i = 0; i < m; i++) {
            arr[edges[i][0]][edges[i][1]] = edges[i][2];
            arr[edges[i][1]][edges[i][0]] = edges[i][2];
        }
        Stack<int[]> s=new Stack<>();
        // TreeMap<Integer, Integer> t = new TreeMap<>();
        int visited[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[0][i] > 0) {
                // t.put(arr[0][i], i);
                int []a={arr[0][i],i};
                add(s, a);
            }
        }
        
        int ans = 0;
        visited[0] = 1;
        while (s.size() > 0) {
            int array[]=s.peek();
            if(visited[s.peek()[1]]!=1){
                ans += s.peek()[0];
                s.pop();
            }else{
                s.pop();
                continue;
            }
            visited[array[1]] = 1;
            for (int i = 0; i < n; i++) {
                if (arr[array[1]][i] > 0 && visited[i] != 1) {
                    // t.put(arr[t.get(t.firstKey())][i], i);
                    int a[]={arr[array[1]][i],i};
                    // System.out.println(a[0]+" "+a[1]);
                    add(s, a);
                }
            }
        //     for(int i[]: s ){
        //     System.out.println(s.peek()[1]+" "+i[0]+" "+i[1]);
        // }
            
            
        }
        return ans;
    }
}
