public class maxproduct {
    public static int maxProduct(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int prod=Integer.MIN_VALUE;
        int ev=0;
        int odd=Integer.MIN_VALUE;
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(ev==0){
                    ev=1;
                }
                if(odd==Integer.MIN_VALUE && flag==true){
                    odd=1;
                }
                if(odd!=Integer.MIN_VALUE && flag==true){
                    odd*=nums[i];
                }
                ev*=nums[i];
            }else{
                ev=0;
                odd=Integer.MIN_VALUE;
                flag=false;
            }
            if(nums[i]>0){
                if(prod==Integer.MIN_VALUE){
                    prod=1;
                }
                prod*=nums[i];
                ans=Integer.max(Integer.max(ans, odd), Integer.max(prod, ev));
            }else{
                if(nums[i]!=0){
                    flag=true;
                }
                prod=Integer.MIN_VALUE;
                ans=Integer.max(Integer.max(ans, odd), Integer.max(prod, ev));
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int arr[]={-2};
        System.out.println(maxProduct(arr));
    }
}
