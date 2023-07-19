public class HouseRobber {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        int ans=0;
        for(int i=0;i<nums.length;i++){
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
        return ans;
    }
}
