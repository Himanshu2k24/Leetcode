class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int target = 0;
        
        for(int i = 0; i < nums.length; i++) target += nums[i];
        int[][] dp = new int[n][target / 2 + 1];
        for(int[] d : dp) Arrays.fill(d,-1);
        if(target % 2 != 0) return false;
        return helper(nums,0,target / 2,dp);

    }
    private boolean helper(int[] nums,int i,int target,int[][] dp){
        if(target == 0) return true;
        if(i >= nums.length || target < 0) return false;

        if(dp[i][target] != -1){
            return dp[i][target] == 1 ? true : false;
        }
        boolean take = helper(nums,i+1,target - nums[i],dp);
        boolean skip = helper(nums,i+1,target,dp);

        if(take || skip) {
            dp[i][target] = 1;
        }else{
            dp[i][target] = 0;
        }
        return dp[i][target] == 1 ? true : false;
    }
}