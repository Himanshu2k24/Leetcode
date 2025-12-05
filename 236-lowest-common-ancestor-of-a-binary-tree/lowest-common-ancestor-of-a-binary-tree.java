class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root == p || root == q) return root;
        boolean pleft = isexist(root.left,p); 
        boolean qleft = isexist(root.left,q);
        if(pleft != qleft){
            return root;
        }

        if(pleft == true && qleft == true) return lowestCommonAncestor(root.left,p,q);

        return lowestCommonAncestor(root.right,p,q);
    }
    private boolean isexist(TreeNode root,TreeNode n){
        if(root== n) return true;
        if(root == null) return false;
        return isexist(root.left,n) || isexist(root.right,n);
    }
}