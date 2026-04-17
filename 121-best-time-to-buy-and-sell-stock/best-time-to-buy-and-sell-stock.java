class Solution {
    public int maxProfit(int[] prices) {
        int[][][] dp = new int[prices.length][2][2];
        for(int[][]d2 : dp){
            for(int[]d : d2)Arrays.fill(d,-1);
        }
        return helper(prices,0,0,0,dp);
    }
    private int helper(int[] prices, int flag, int i,int limit,int[][][] dp){
        if(i >= prices.length ||limit == 1) return 0;

        if(dp[i][flag][limit] != -1) return dp[i][flag][limit];
        int buy = 0;
        int sell = 0;
        if(flag == 0){
            buy = Math.max( -prices[i] + helper(prices,1,i+1,0,dp) , helper(prices,0,i+1,0,dp) );
        }else{
            sell = Math.max( prices[i] + helper(prices,0,i+1,1,dp) , helper(prices,1,i+1,0,dp));
        }

        return dp[i][flag][limit] = Math.max(buy,sell);
    }
}