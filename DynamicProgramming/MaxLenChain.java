import java.util.Comparator;

public class MaxLenChain {
    class Pair {
        int x;
        int y;

        public Pair(int a, int b) {
            x = a;
            y = b;
        }
    }

    class GfG {
        int maxChainLength(Pair arr[], int n) {
            Arrays.sort(arr, new Comparator<Pair>() {
                public int compare(Pair o1, Pair o2) {
                    return Integer.compare(o1.y, o2.y);
                }
            });
            // for(int i=0;i<arr.length;i++){
            //     System.out.println(arr[i].x+" "+arr[i].y);
            // }
            int ans=1;
            int num=arr[0].y;
            for(int i=1;i<arr.length;i++){
                if(num<arr[i].x){
                    ans++;
                    num=arr[i].y;
                }
            }
            return ans;
        }
    }
}
