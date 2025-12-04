/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        reverseit(root.left,root.right,0);
        return root;
    }
    private void reverseit(TreeNode left,TreeNode right,int idx){
        if(left == null || right ==null) return;
        if(idx % 2 == 0 ){
            int  temp = left.val;
            left.val = right.val;
            right.val = temp;
        }
        reverseit(left.left,right.right,idx + 1);
        reverseit(left.right,right.left,idx + 1);
    }
}