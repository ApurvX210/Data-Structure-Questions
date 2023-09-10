public class ksmallest {
    static void buildHeap(int arr[], int n)
    {
        for(int i=n/2-1;i>=0;i--){
            heapify(arr, n, i);
        }
    }
 
    //Heapify function to maintain heap property.
    static void heapify(int arr[], int n, int i)
    {
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;

        if(l<n && arr[l]<arr[largest]){
            largest=l;
        }
        if(r<n && arr[r]<arr[largest]){
            largest=r;
        }
        if(largest!=i){
            int swap=arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;
            heapify(arr, n, largest);
        }
    }
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        int n=arr.length;
        buildHeap(arr, n);
        int j=0;
        for (int i = n -1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            j++;
            if(j==k){
                return temp;
            }
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
        return 0;
    } 
}
