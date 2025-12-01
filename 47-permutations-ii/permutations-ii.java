class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> arr= new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        helper(nums,ll,arr,visited);
        return ll;
    }
    public void helper(int[] nums, List<List<Integer>> ll,List<Integer> arr, boolean[] visited){
        if(arr.size() == nums.length){
            ll.add(new ArrayList<>(arr));
            return;
        }
        for(int i=0; i<nums.length;i++){
            if(i > 0 && nums[i] == nums[i-1] && !visited[i-1]){
                continue;
            }
            if(!visited[i]){
                visited[i] = true;
                arr.add(nums[i]);
                helper(nums,ll,arr,visited);
                arr.remove(arr.size() - 1);
                visited[i] = false;
            }
        }
    }
}