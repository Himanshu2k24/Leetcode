class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int[][] dp = new int[dungeon.length][dungeon[0].length];
        for(int[] d : dp) Arrays.fill(d,-1);
        return helper(dungeon,0,0,dp);
    }
    public int helper(int[][] mat,int i , int j,int[][] dp) {
        if(i >= mat.length || j >= mat[0].length) return Integer.MAX_VALUE;
        if(dp[i][j] != -1) return dp[i][j];
        if(i == mat.length-1 && j == mat[0].length -1){
            if(mat[i][j] < 0) return dp[i][j] = Math.abs(mat[i][j]) + 1;
            else return dp[i][j] = 1;
        }

        int right = helper(mat,i,j+1,dp);
        int down = helper(mat,i+1,j,dp);

        int send = Math.min(right,down) - mat[i][j];
        return dp[i][j] = send <= 0 ? 1 : send;
    }
}