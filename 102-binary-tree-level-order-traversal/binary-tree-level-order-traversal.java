
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();
        if(root == null) return ll;
        helper(ll,root);
        return ll;
    }
    private void helper(List<List<Integer>> ll,TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        while(!q.isEmpty()){
            int s = q.size();
            ArrayList<Integer> arr = new ArrayList<>();

            for(int i = 0;i<s;i++){
                TreeNode temp = q.poll();
                arr.add(temp.val);

                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
            ll.add(arr);
        }
    }
}