public class LIS {
    public int lengthOfLIS(int[] nums) {
        int dp[]=new int[nums.length];
        dp[0]=1;
        int ans=1;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Integer.max(dp[i], dp[j]+1);
                    ans=Integer.max(ans, dp[i]);
                }
            }
            if(dp[i]==0){
                dp[i]=1;
            }
        }
        return ans;
    }
}
