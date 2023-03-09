import java.util.Arrays;

public class ActivitySelection {
    static void merge(int arr[], int l, int m, int r, int end[]) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
        int LE[] = new int[n1];
        int RE[] = new int[n2];

        /* Copy data to temp arrays */
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
            LE[i] = end[l + i];
        }

        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
            RE[j] = end[m + 1 + j];
        }

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                end[k] = LE[i];
                i++;
            } else {
                arr[k] = R[j];
                end[k] = RE[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            end[k]=LE[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            end[k] = RE[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    static void sort(int arr[], int l, int r, int end[]) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m, end);
            sort(arr, m + 1, r, end);

            // Merge the sorted halves
            merge(arr, l, m, r, end);
        }
    }

    public static int activitySelection(int start[], int end[], int n) {
        sort(start, 0, start.length - 1, end);
        int ans=1;
        int st=0;
        
        for(int i=1;i<start.length;i++){
            if(start[i]<=end[st]){
                int d1=end[st]-start[st];
                int d2=end[i]-start[i];
                if(d1>d2 && end[i]<end[st]){
                    st=i;
                }
            }else{
                ans++;
                st=i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int start[] = { 2,6,1 };
        int end[] = { 5,6,8 };
        System.out.println(activitySelection(start, end, start.length));
    }
}
