public class lnum {
    public void merge(String []arr,int l,int mid,int h){
        String a[]=new String[h-l+1];
        int low=l;
        int high=mid+1;
        int cnt=0;
        while(low<=mid && high<=h){
            String s=arr[low]+arr[high];
            String s1=arr[high]+arr[low];
            if(s1.compareTo(s)>0){
                a[cnt]=arr[high];
                high++;
            }else if(s1.compareTo(s)<0){
                a[cnt]=arr[low];
                low++;
            }else{
                a[cnt]=arr[high];
                high++;
                cnt++;
                a[cnt]=arr[low];
                low++;
            }
            cnt++;
        }
        while(low<=mid){
            a[cnt]=arr[low];
            low++;
            cnt++;
        }
        while(high<=h){
            a[cnt]=arr[high];
            high++;
            cnt++;
        }
        cnt=0;
        for(int i=l;i<=h;i++){
            arr[i]=a[cnt];
            cnt++;
        }
    }
    public void mergesort(String []arr,int l,int h){
        if(l<h){
            int mid=(l+h)/2;
            mergesort(arr, l, mid);
            mergesort(arr, mid+1, h);
            merge(arr,l,mid,h);
        }
        
    }
    String printLargest(String[] arr) {
        mergesort(arr, 0, arr.length-1);
        String ans="";
        for(String s:arr){
            ans+=s;
        }
        return ans;
    }
    public static void main(String[] args) {
        lnum l=new lnum();
        String []arr={"250", "74", "659", "931" ,"273" ,"545", "879","924"};
        System.out.println(l.printLargest(arr));
        
    }
}
