class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int mini = Integer.MAX_VALUE;
        int sum =0;
        int[][] dp = new int[rows][cols];
        for(int[] d : dp){
            Arrays.fill(d,Integer.MAX_VALUE);
        }
        for(int i =0; i<cols; i++){
            mini = Math.min(mini,helper(matrix,0,i,rows,cols,sum,dp));
        }
        return mini;
    }
    private int helper(int[][] matrix,int row,int col,int rows,int cols,int sum,int[][] dp){
        if(col >= cols || col < 0) return Integer.MAX_VALUE;

        if(row == rows - 1) return matrix[row][col]; 
        if(dp[row][col] != Integer.MAX_VALUE) return dp[row][col];
        
        int left =  helper(matrix,row + 1,col -1,rows,cols,sum,dp);
        int same = helper(matrix,row + 1,col,rows,cols,sum,dp);
        int right = helper(matrix,row + 1,col + 1,rows,cols,sum,dp);

        int min1 = Math.min(left,right);
        int min2 = Math.min(min1,same);
        
        return dp[row][col] = matrix[row][col] + min2;
    }
}