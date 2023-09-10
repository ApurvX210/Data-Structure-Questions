public class ksmallest {
    public  int pivot(int []arr,int l,int h){
        int piv=arr[h];
        int j=l-1;
        for(int i=l;i<h;i++){
            if(arr[i]<piv){
                j++;
                int a=arr[i];
                arr[i]=arr[j];
                arr[j]=a;
            }
        }
        j++;
        int a=arr[h];
        arr[h]=arr[j];
        arr[j]=a;
        return j;

    }
    public  int kthSmallest(int[] arr, int l, int h, int k) 
    { 
        int size=arr.length;
        int piv=pivot(arr, 0, h);
        while(true){
            if(piv+1>k){
                h=piv-1;
                size=(h-l+1);
                piv=pivot(arr, l, h);
            }else if(piv+1<k){
                l=piv+1;
                size=(h-l+1);
                piv=pivot(arr, l, h);
            }else if(piv==k-1){
                return arr[piv];
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,2,1,5,6,4};
        System.out.println(new ksmallest().kthSmallest(arr,0,arr.length-1,2));
    }
}
