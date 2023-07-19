public class JumpGame {
    public boolean canJump(int[] nums) {
        int a=nums[0]-1;
        for(int i=1;i<nums.length;i++){
            a=Integer.max(a,nums[i]);
            if(a==0){
                return false;
            }
            a--;
        }
        return true;
    }
}
