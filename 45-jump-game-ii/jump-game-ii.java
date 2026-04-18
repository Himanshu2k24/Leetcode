class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(nums,0,dp);
    }
    public int helper(int[] nums,int idx,int[] dp){
        if(idx == nums.length -1) return 0;
        if(dp[idx] != -1) return dp[idx];
        int take = Integer.MAX_VALUE;
        for(int i = 1; i <= nums[idx]; i++){
            if(idx + i < nums.length){
            int next = helper(nums,idx + i,dp);
            if(next != Integer.MAX_VALUE){
                take = Math.min(next + 1, take);
            }

            }
        }
        return dp[idx] = take;
    }
}