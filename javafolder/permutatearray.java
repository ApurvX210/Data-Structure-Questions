import java.util.Arrays;

public class permutatearray {
    public boolean isPossible(long a[], long b[], int n, long k) {
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if(a[i]+b[n-1-i]<k){
                return false;
            }
        }
        return true;
    }
}
