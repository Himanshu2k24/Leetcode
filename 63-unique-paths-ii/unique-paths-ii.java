class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int[] d : dp) Arrays.fill(d,-1);
        return helper(obstacleGrid,0,0,obstacleGrid.length,obstacleGrid[0].length,dp);
    }
    private int helper(int[][] oG, int row,int col, int rows,int cols,int[][] dp){
        if(row == rows || col == cols || oG[row][col]  == 1) return 0;
        if(row == rows -1 && col == cols -1) return 1;

        if(dp[row][col] != -1) return dp[row][col];

        int right = helper(oG,row,col +1,rows,cols,dp);
        int down = helper(oG,row + 1,col,rows,cols,dp);
        return dp[row][col] = right + down;
    }
}