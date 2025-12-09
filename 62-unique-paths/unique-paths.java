class Solution {
    public int uniquePaths(int m, int n) {
        int[][] matrix = new int[m][n];
        int[][] dp = new int[m][n];
        for(int[] d : dp){
            Arrays.fill(d,-1);
        }
        return helper(matrix,0,0,m,n,dp);
    }
    private int helper(int[][] matrix,int i, int j, int m, int n,int[][] dp){
        if(i > m-1 || j > n-1) return 0;
        if(i == m - 1 && j == n -1) return 1;
        
        if(dp[i][j] != -1) return dp[i][j];

        int down = helper(matrix,i+1,j,m,n,dp);
        int right =  helper(matrix,i,j+1,m,n,dp);
        return dp[i][j] = down + right;
    }
}