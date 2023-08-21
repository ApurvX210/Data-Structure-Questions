import java.util.ArrayList;
import java.util.Comparator;

public class vertexCover {
    public static int vertexCover(int n, int m, int[][] edges) {
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(i, new ArrayList<Integer>());
        }
        for(int i=0;i<m;i++){
            ArrayList<Integer> a1=a.get(edges[i][0]);
            a1.add(edges[i][1]);
            ArrayList<Integer> a2=a.get(edges[i][1]);
            a1.add(edges[i][0]);
            a.add(edges[i][0], a1);
            a.add(edges[i][1], a2);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(i);
        }
        arr.sort(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return a.get(o2).size()-a.get(o1).size();
            }
            
        });
        // Arrays.sort(arr,new Comparator<Integer>() {

        //     @Override
        //     public int compare(Integer o1, Integer o2) {
        //         return a.get(o2).size()-a.get(o1).size();
        //     }
            
        // });
        int ans=0;
        int data[]=new int[n];
        for(int i:arr){
            if(data[i]==1){
                continue;
            }
            ans++;
            for(int j :a.get(i)){
                data[j]=1;
            }
        }
        return ans;
    }
}
