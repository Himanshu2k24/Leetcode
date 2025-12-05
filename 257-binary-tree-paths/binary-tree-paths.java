class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> arr = new ArrayList<>();
        helper(root,arr,"");
        return arr;
    }
    private void helper(TreeNode root, List<String> arr,String s){
        if(root == null) return;
        if(root.left == null && root.right == null){
            s += root.val;
            arr.add(s);
            return;
        }
        s = s + root.val + "->";
        helper(root.left,arr,s);
        helper(root.right,arr,s);
    }
}