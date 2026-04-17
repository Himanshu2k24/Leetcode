class Solution {
    public int uniquePaths(int m, int n) {
        int[][] mat = new int[m][n];
        int[][] dp = new int[m][n];
        for(int[] d : dp) Arrays.fill(d,-1);
        return helper(mat,0,0,dp);
    }
    private int helper(int[][] mat,int i,int j,int[][] dp){
        if(i >= mat.length || j >= mat[0].length) return 0;
        if(i == mat.length -1 && j == mat[0].length -1) return 1;

        if(dp[i][j] != -1) return dp[i][j];

        int down = helper(mat,i+1,j,dp);
        int right = helper(mat,i,j+1,dp);
        return  dp[i][j] = down + right;
    }
}