public class inversioncount {
    static int count=0;
    public static void merge(long arr[],int l,int mid,int h){
        long a[]=new long[h-l+1];
        int i=l;
        int j=mid+1;
        int m=0;
        while(i<=mid && j<=h){
            if(arr[i]>arr[j]){
                a[m]=arr[j];
                j++;
                count+=mid-i+1;
            }else{
                a[m]=arr[i];
                i++;
            }
            m++;
        }
        while(i<=mid){
            a[m]=arr[i];
            i++;
            m++;
        }
        while(j<=h){
            a[m]=arr[j];
            j++;
            m++;
        }
        m=0;
        for(i=l;i<=h;i++){
            arr[i]=a[m];
            m++;
        }
    }
    public static void sort(long[]arr,int l,int h){
        if(l<h){
            int mid=(l+h)/2;
            sort(arr, l, mid);
            sort(arr, mid+1, h);
            merge(arr,l,mid,h);
        }
        
    }
    static long inversionCount(long arr[], long N)
    {
        sort(arr,0,arr.length-1);
        return count;
    }
    static void printArray(long arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[])
    {
        long arr[] = {2,4,1,3,5};
 
        // System.out.println("Given Array");
        // printArray(arr);
 
        System.out.println(inversionCount(arr, arr.length));
    }
}
