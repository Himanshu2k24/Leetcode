class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> has = new HashMap<>();
        for(int i = 0; i < n; i++){
            has.put(nums[i],i);
        }
        for(int i = 0 ; i < n; i++){
            int temp = target - nums[i];
            if(has.containsKey(temp) && has.get(temp) != i) return new int[]{i,has.get(temp)};
        }
        return new int[]{0,0};
    }
}