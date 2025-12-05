class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n =cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        int idx0 = helper(cost,0,dp);
        int idx1 = helper(cost,1,dp);
        return Math.min(idx0,idx1);
    }
    private int helper(int[] cost,int i,int[] dp){
        if(i > cost.length-1) return 0;
        if(dp[i] != -1){
            return dp[i];
        }else{
            return dp[i] = cost[i] + Math.min(helper(cost,i+1,dp),helper(cost,i+2,dp));
        }
        
    }
}