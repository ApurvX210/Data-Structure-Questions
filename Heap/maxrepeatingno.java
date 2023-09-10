public class maxrepeatingno {
    int maxRepeating(int[] arr, int n, int k) {
        for(int i=0;i<arr.length;i++){
            arr[arr[i]%n]+=n;
        }
        int ans=0;
        for(int i=1;i<k;i++){
            if(arr[ans]/n < arr[i]/n){
                ans=i;
            }
        }
        return ans;
    }
}
