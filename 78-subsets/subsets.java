class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(nums);
        //list.add(arr);
        helper(list,arr,nums,0);
        return list;
    }
    private void helper(List<List<Integer>> list,ArrayList<Integer> arr,int[] nums,int idx){
        if(idx == nums.length){
            list.add(new ArrayList(arr));
            return;
        }
        arr.add(nums[idx]);
        helper(list,arr,nums,idx+1);
        arr.remove(arr.size()-1);

        int nextidx = idx + 1;
        while(nextidx < nums.length && nums[idx] == nums[nextidx]){
            nextidx++;
        }
        helper(list,arr,nums,nextidx);
    }
}