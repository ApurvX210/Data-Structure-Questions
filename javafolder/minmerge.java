public class minmerge {
    public int minstep(int arr[]){
        int ans=0;
        int l=0;
        int h=arr.length-1;
        int var=0;
        int var1=0;
        while(l<h){
            if((var+arr[l])<arr[h]){
                var+=arr[l];
                ans++;
                l++;
            }else if(arr[l]>(var1+arr[h])){
                var1+=arr[h];
                ans++;
                h--;
            }else{
                h--;
                l++;
                var=0;
                var1=0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,5,4,6,3,2,1,5,6,9,1};
        System.out.println(new minmerge().minstep(arr));
    }
}
