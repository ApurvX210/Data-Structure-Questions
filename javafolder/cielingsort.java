public class cielingsort {
    public void cielfloor(int[] arr,int num){
        int l=0;
        int h=arr.length-1;
        int ans=-1;
        boolean flag=true;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==num){
                ans=mid;
                flag=false;
                break;
            }else if(arr[mid]>num){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        if(flag==false){
            System.out.println("Floor : "+arr[ans-1]);
            System.out.println("Cieling : "+arr[ans+1]);
        }else{
            System.out.println("Element not found");
        }
        
    }
}
