class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        dp[n - 1] = nums[n - 1];
        dp[n- 2] = Math.max(dp[n-1],nums[n-2]);

        for(int i = nums.length - 3; i>=0; i--){
            dp[i] = Math.max(dp[i+2] + nums[i],dp[i+1]);
        }
        return dp[0];
    }
   /* public int helper(int[] nums, int i,int[] dp){
        if(i >= nums.length) return 0;
        if(dp[i] != -1) return dp[i];
        int first = nums[i] + helper(nums,i+2,dp);
        int second = helper(nums,i+1,dp);
        return dp[i] = Math.max(first,second);
    }*/
}