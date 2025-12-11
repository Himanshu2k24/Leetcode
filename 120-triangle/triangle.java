class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        for(int[] r : dp){
            Arrays.fill(r,Integer.MAX_VALUE);
        }
        return helper(triangle,0,0,dp);
    }
    private int helper(List<List<Integer>> triangle,int row,int col,int[][] dp){

        if(row == triangle.size()- 1) return triangle.get(row).get(col);
        if(dp[row][col] != Integer.MAX_VALUE) return dp[row][col];
        int first = helper(triangle,row + 1,col,dp);
        int second = helper(triangle,row + 1,col +1,dp);
        int min = Math.min(first,second);
        return dp[row][col] = triangle.get(row).get(col) + min;

    }
    
}