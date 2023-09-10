public class product {
    public static int[] productExceptSelf(int[] arr) {
        int ans[]=new int[arr.length];
        int r[]=new int[arr.length];
        int b[]=new int[arr.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=1;
        }
        for(int i=0;i<r.length;i++){
            if(i==0){
                r[i]=arr[i];
                b[i]=arr[arr.length-1-i];
                continue;
            }
            r[i]=arr[i]*r[i-1];
            b[i]=arr[arr.length-1-i]*b[i-1];
        }       
        for(int i=1;i<arr.length;i++){
            ans[i]=r[i-1];
        }
        for(int i=0;i<arr.length-1;i++){
            ans[i]=ans[i]*b[b.length-2-i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={-1,1,0,-3,3};
        int ans[]=productExceptSelf(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
