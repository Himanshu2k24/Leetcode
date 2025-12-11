class Solution {
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dp = new int[rows][cols];
        for(int[] r : dp){
            Arrays.fill(r,-1);
        }
        return helper(0,0,grid,rows,cols,dp);
    }
    private int helper(int row,int col,int[][] grid,int rows,int cols,int[][] dp){
        
        if(row == rows - 1 && col == cols -1) return grid[row][col];
        if(row == rows || col == cols) return Integer.MAX_VALUE;
        

        if(dp[row][col] != -1) return dp[row][col];

        int right = helper(row,col + 1,grid,rows,cols,dp);
        int down = helper(row +1,col,grid,rows,cols,dp);
        return dp[row][col] = grid[row][col] + Math.min(down ,right);
    }
}