class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return helper(root,targetSum,0);        
    }
    private boolean helper(TreeNode root, int targetSum,int sum){
        if(root == null) return false;
        sum += root.val;
        if(sum == targetSum && root.left == null && root.right == null) return true;
        

        boolean left = helper(root.left,targetSum,sum);
        boolean right = helper(root.right,targetSum,sum);
        return left || right;
    }
}