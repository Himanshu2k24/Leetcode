class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        int[][] dp =new int[m][n];
        for(int[] d : dp) Arrays.fill(d,-1);
        return helper(grid,dp,0,0,m,n);
    }
    private int helper(int[][] grid,int[][] dp,int row,int col,int m,int n){
        if(row == m -1 || col == n -1) return 1;
        if(row == m || col == n) return 0;
        if(dp[row][col] != -1) return dp[row][col];
        int right = helper(grid,dp,row,col + 1,m,n);
        int down = helper(grid,dp,row+1,col,m,n);

        return dp[row][col] = down + right;
    }
}