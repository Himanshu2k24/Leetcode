class Solution {
    public boolean canPartition(int[] nums) {
        if(nums.length <2) return false;
        int sum = 0;
        for(int num:nums) sum += num;
        if(sum % 2 != 0) return false;
        int[][] dp = new int[nums.length][sum + 1];
        for(int[] d : dp) Arrays.fill(d,-1);
         
        return helper(nums,0,sum /2,dp);
    }
    private boolean helper(int[] nums,int idx,int sum,int[][] dp){
        if(nums.length == idx){
            if(sum == 0) return true;
            return false;
        }
        if(dp[idx][sum] !=-1){
            if(dp[idx][sum] == 1) return true;
            return false;
        }
        boolean ans = false;
        boolean skip = helper(nums,idx+1,sum,dp);
        if(sum - nums[idx] < 0) return skip;
        else{
            boolean take = helper(nums,idx+1,sum - nums[idx],dp);
            ans = skip || take;
        }
        if(ans) dp[idx][sum] = 1;
        else{
            dp[idx][sum] = 0;
        }
        return ans;
    }
}