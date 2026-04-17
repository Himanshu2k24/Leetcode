class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            int re = target - nums[i];
            if(hm.containsKey(re)){
                return new int[]{i,hm.get(re)};
            }else{
                hm.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}