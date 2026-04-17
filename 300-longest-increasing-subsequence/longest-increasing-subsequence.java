class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length +1][nums.length +1];
        for(int[] d : dp) Arrays.fill(d,-1);
        return helper(nums,0,-1,dp);
    }
    public int helper(int[] nums,int idx , int prev,int[][] dp) {
        if(idx >= nums.length) return 0;

        if(dp[idx][prev + 1] != -1) return dp[idx][prev + 1];
        int take = 0;
        if(prev == -1 || nums[idx] > nums[prev]){
            take = 1 + helper(nums,idx + 1, idx,dp);
        }
        int skip = helper(nums,idx+1,prev,dp);
        return dp[idx][prev+1] = Math.max(take,skip);
    }
}