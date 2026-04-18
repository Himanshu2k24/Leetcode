class Solution {
    public int minDistance(String word1, String word2) {
        StringBuilder s1 = new StringBuilder(word1);
        StringBuilder s2= new StringBuilder(word2);
        int i = s1.length() , j = word2.length();
        int[][] dp = new int[i+1][j+1];
        for(int[] d : dp) Arrays.fill(d,-1);
        return helper(s1,s2,i -1, j -1,dp);
    }
    public int helper(StringBuilder s1, StringBuilder s2,int i,int j,int[][] dp) {
        if(i == -1) return j+1;
        if(j == -1) return i+1;

        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j] = helper(s1,s2,i-1,j-1,dp);
        }else{
            int del = helper(s1,s2,i-1,j,dp);
            int ins = helper(s1,s2,i,j-1,dp);
            int rep = helper(s1,s2,i-1,j-1,dp);
            return dp[i][j] = 1 + Math.min(del,Math.min(ins,rep));
        }
    }
}