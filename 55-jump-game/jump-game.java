class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        Boolean[] dp = new Boolean[n];
        return helper(nums,0,dp);
    }
    public boolean helper(int[] nums,int idx,Boolean[] dp){
        if(idx == nums.length -1) return true;
        if(idx >= nums.length) return false;
        
        if(dp[idx] != null) return dp[idx];
        boolean take = false;
        for(int i = 1; i <= nums[idx]; i++ ){
            take = helper(nums,idx + i,dp);
            if(take) break;
        }
        return dp[idx] = take;
    }
}