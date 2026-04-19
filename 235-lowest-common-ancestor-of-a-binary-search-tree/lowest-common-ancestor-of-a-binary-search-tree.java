class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;
        boolean left = isExist(root.left,p);
        boolean right = isExist(root.left,q);
        if(left != right) return root;
        if(left) return lowestCommonAncestor(root.left,p,q);
        return lowestCommonAncestor(root.right,p,q);
    }
    private boolean isExist(TreeNode root, TreeNode p){
        if(root == null) return false;
        if(root == p) return true;
        return isExist(root.left,p) || isExist(root.right,p);
    }
}