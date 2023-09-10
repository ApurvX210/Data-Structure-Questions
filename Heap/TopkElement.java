import java.util.HashMap;

public class TopkElement {
    public static int partition(int[] ans, HashMap<Integer, Integer> h, int s, int e) {
        int i = s-1;
        int j = s;
        while (j < e) {
            if (h.get(ans[j]) <= h.get(ans[e])) {
                i++;
                int swap = ans[i];
                ans[i] = ans[j];
                ans[j] = swap;
                j++;
            } else {
                j++;
            }
        }
        i++;
        int swap = ans[i];
        ans[i] = ans[e];
        ans[e] = swap;
        return i;
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (h.containsKey(nums[i])) {
                h.put(nums[i], h.get(nums[i]) + 1);
            } else {
                h.put(nums[i], 1);
            }
        }
        int ans[] = new int[h.keySet().size()];
        int j = 0;
        for (int i : h.keySet()) {
            ans[j] = i;
            j++;
        }
        int s=0;
        int e=ans.length-1;
        int index=-1;
        while(true){
            int a=partition(ans, h, 0, e);
            if(a==ans.length-k){
                index=a;
                break;
            }else if(a<ans.length-k){
                s=a+1;
            }else{
                e=a-1;
            }
        }
        int arr[]=new int[k];
        for(int i=index;i<ans.length;i++){
            arr[i-index]=ans[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        int num[] = { 1,1,1,2,2,3 };
        int ans[]=topKFrequent(num, 2);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
