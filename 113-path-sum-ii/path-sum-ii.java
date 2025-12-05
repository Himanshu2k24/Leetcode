class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> dummy = new ArrayList<>();
        helper(root,targetSum,arr,dummy);
        return arr;
    }
    private void helper(TreeNode root,int targetSum, List<List<Integer>> arr,List<Integer> nums){
        if(root == null) return;
             nums.add(root.val);
        if(root.left == null && root.right == null){
           
            int sum = 0;
            for(int i=0;i<nums.size();i++){
                sum += nums.get(i);
            }
            if(targetSum == sum){
                arr.add(new ArrayList<>(nums));
            }
        }
        else{

        
            helper(root.left,targetSum,arr,nums);
            helper(root.right,targetSum,arr,nums);
        }
        nums.remove(nums.size() - 1);
    }
}