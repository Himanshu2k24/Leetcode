class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();
        if(root == null) return ll;
        Queue<TreeNode> q =new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> arr = new ArrayList<>();
            int size= q.size();
            while(size > 0){
                TreeNode node = q.remove();
                arr.add(node.val);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
                size--;
            }
            ll.add(arr);
        }
        return ll; 
    }
}