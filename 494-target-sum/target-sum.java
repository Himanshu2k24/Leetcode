class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,target,0);
    }
    public int helper(int[] nums, int target,int idx) {
        if(idx == nums.length && target == 0) return 1;
        if(idx >=  nums.length) return 0;

        int add = helper(nums,target + nums[idx],idx+1);
        int sub = helper(nums,target - nums[idx],idx+1);
        return add + sub;
    }
}