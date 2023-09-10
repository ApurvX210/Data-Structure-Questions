import java.util.ArrayList;
import java.util.HashMap;

public class countdistinctelement {
    ArrayList<Integer> countDistinct(int A[], int n, int k) {
        ArrayList<Integer> a = new ArrayList<>();
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < k; i++) {
            if (h.containsKey(A[i])) {
                h.put(A[i], h.get(A[i]) + 1);
            } else {
                h.put(A[i], 1);
            }
        }
        a.add(h.size());
        for (int i = 0; i < n - k; i++) {
            if (h.containsKey(A[i])) {
                h.put(A[i], h.get(A[i]) - 1);
                if (h.get(A[i]) == 0) {
                    h.remove(A[i]);
                }
            }
            if (h.containsKey(A[i + k])) {
                h.put(A[i + k], h.get(A[i + k]) + 1);
                a.add(h.size());
            } else {
                h.put(A[i + k], 1);
                a.add(h.size());
            }
        }
        return a;
    }
}
