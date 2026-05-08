class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 1) return s;
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String rev = sb.toString();
        int n = s.length();
        int[][] dp = new int[n+1][n+1];
        for(int i = 1; i <= n;i++){
            for(int j = 1;j <= n; j++){
                if(s.charAt(i-1) == rev.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        int lasti = 0;
        int lastj = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= n;i++){
            for(int j = 1;j <= n; j++){
                if(dp[i][j] > max){
                    int len = dp[i][j];
                    int start = i - len;
                    int revStart = n - j;
                    if(start == revStart){
                        max = dp[i][j];
                        lasti = i;
                        lastj = j;
                    }
                }
            }
        }

        StringBuilder sbb = new StringBuilder();
        while(lasti > 0 && lastj > 0 && max > 0){
            sbb.append(s.charAt(lasti - 1));
            lasti--;
            lastj--;
            max--;
        }
        return sbb.reverse().toString();
    }
}