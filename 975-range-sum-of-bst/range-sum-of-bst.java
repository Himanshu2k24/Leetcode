class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return helper(root,low,high,0);
    }
    private int helper(TreeNode root,int low,int high,int sum){
        if(root == null) return 0;
        sum = helper(root.left,low,high,sum) + helper(root.right,low,high,sum);
        if(root.val >= low && root.val <=  high){
            sum += root.val;
        }
        return sum;
    }
}