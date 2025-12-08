class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,0,dp);
    }

    private int helper(int[] nums,int i,int[] dp){
        if( i >= nums.length ) return 0;
        if(dp[i] != -1){
            return dp[i];
        }
        int fromfirst = nums[i] + helper(nums,i+2,dp);
        int fromsecond = helper(nums,i+1,dp);
        return dp[i] = Math.max(fromfirst,fromsecond);
    }
}