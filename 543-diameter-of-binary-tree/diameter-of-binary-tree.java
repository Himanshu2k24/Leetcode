class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int myDia = levels(root.left) + levels(root.right);
        int leftDia = diameterOfBinaryTree(root.left);
        int rightDia = diameterOfBinaryTree(root.right);
        return max(myDia,leftDia,rightDia);
        
    }
    private int levels(TreeNode root){
        if( root == null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }
    private int max(int a, int b, int c){
        if(a >= b && a >= c){
            return a;
        }else if( b >= a && b >= c){
            return b;
        }else{
            return c;
        }
    }
}