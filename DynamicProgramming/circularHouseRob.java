public class circularHouseRob {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int dp[]=new int[nums.length];
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            if(i-2>=0){
                dp[i]=Integer.max(dp[i], dp[i-2]+nums[i]);
            }
            if(i-3>=0){
                dp[i]=Integer.max(dp[i], dp[i-3]+nums[i]);
            }
            if(dp[i]==0){
                dp[i]=nums[i];
            }
            ans=Integer.max(ans, dp[i]);
        }
        int dp1[]=new int[nums.length];
        dp1[0]=0;
        for(int i=1;i<nums.length;i++){
            if(i-2>=0){
                dp1[i]=Integer.max(dp1[i], dp1[i-2]+nums[i]);
            }
            if(i-3>=0){
                dp1[i]=Integer.max(dp1[i], dp1[i-3]+nums[i]);
            }
            if(dp1[i]==0){
                dp1[i]=nums[i];
            }
            ans=Integer.max(ans, dp1[i]);
        }
        for(int i=0;i<dp.length;i++){
            System.out.print(dp1[i]+" ");
        }
        System.out.println(ans);
        return ans;
    }
}
