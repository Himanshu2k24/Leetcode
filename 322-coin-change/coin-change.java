class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount +1];
        for(int[] d: dp) Arrays.fill(d,-1);
        int r = helper(coins,amount,0,dp);
        if(r == 1000000) return -1;
        return r;
    }
    public int helper(int[] coins, int amount, int i,int[][] dp) {
        if(i == coins.length){
            if(amount == 0) return 0;
            else return 1000000;
        }
        if(dp[i][amount] != -1) return dp[i][amount];
        
        int skip = helper(coins,amount,i+1,dp);
        int take = 1000000;
        if(amount - coins[i] >= 0){
            take = 1 +  helper(coins,amount - coins[i],i,dp);   
        }
        return dp[i][amount] = Math.min(take,skip);
    }
}