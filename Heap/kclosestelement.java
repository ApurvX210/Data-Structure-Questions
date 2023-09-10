public class kclosestelement {
    int[] printKClosest(int[] arr, int n, int k, int x) {
        int l = 0;
        int h = n - 1;
        int mid = -1;
        while (l < h) {
            mid = (l + h) / 2;
            if (arr[mid] > x) {
                h = mid - 1;
            } else if (arr[mid] < x) {
                l = mid + 1;
            } else {
                break;
            }
            if (l == h) {
                mid = l;
            }
        }
        int ans[] = new int[k];
        int j = 0;
        if (arr[mid] != x) {
            ans[j] = arr[mid];
            j++;
            k--;

        }
        l = mid - 1;
        h = mid + 1;

        while (k>0) {
            if(l>=0 && h<n && (Math.abs(x-arr[l]))<(Math.abs(x-arr[h]))){
                ans[j]=arr[l];
                l--;
                k--;
            }else if(l>=0 && h<n && (Math.abs(x-arr[l]))>=(Math.abs(x-arr[h]))){
                ans[j]=arr[h];
                h++;
                k--;
            }else if(h>=n && l>=0){
                ans[j]=arr[l];
                l--;
                k--;
            }else if(h<n && l<=0){
                ans[j]=arr[h];
                h++;
                k--;
            }
            j++;
        }
        return ans;

    }
}
