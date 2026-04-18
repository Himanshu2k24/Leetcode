class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        int first = helper(cost,0,dp);
        int second = helper(cost,1,dp);
        return Math.min(first,second); 
    }
    public int helper(int[] cost,int idx,int[] dp) {
        if(idx == cost.length -1) return cost[idx];
        if(idx >= cost.length) return 0;

        if(dp[idx] != -1) return dp[idx];
        int first = cost[idx] + helper(cost,idx+1,dp);
        int second = cost[idx] + helper(cost,idx + 2,dp);

        return dp[idx] = Math.min(first,second);
    }
}