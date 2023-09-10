class a{
    public int search(int[]arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[low]<=arr[mid]){
               if(target>=arr[low] && target<=arr[mid]){
                high=mid;
                continue;
               }
                else{
                    low=mid+1;
                    continue;
                }
            
            }else if(arr[low]>=arr[mid]){
                if(target>=arr[mid+1] && target<=arr[high]){
                    low=mid+1;
                    continue;
                }else{
                    high=mid;
                    continue;
                }
            }else if(arr[low]==arr[high]){
                if(target!=arr[low]){
                    return -1;
                }
            }else if(arr[low]==arr[mid]){
                if(target==arr[low]){
                    return low;    
                }else{
                    if(target==arr[high]){
                        return high;
                    }else{
                        return -1;
                    }
                }
            }
        }return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        a a1=new a();
        int ans=a1.search(arr, 7);
        System.out.println(ans);
    }
}
