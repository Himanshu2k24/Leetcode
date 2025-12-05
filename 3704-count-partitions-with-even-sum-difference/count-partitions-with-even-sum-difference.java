class Solution {
    public int countPartitions(int[] nums) {
        int totalsum = 0;
        int ans = 0;
        for(int i = 0; i<nums.length; i++){
            totalsum += nums[i];
        }
        int sum = 0;
        for(int i =0;i<nums.length -1 ;i++){
            sum = sum + nums[i];
            totalsum = totalsum - nums[i];
            if((sum - totalsum) % 2 == 0) ans++;
        }
        return ans;
    }
}