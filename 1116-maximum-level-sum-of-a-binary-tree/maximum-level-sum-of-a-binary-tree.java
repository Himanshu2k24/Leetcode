class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int max = Integer.MIN_VALUE;
        int level = 0;
        int ans = 0;

        while(!q.isEmpty()){
            level++;
            int size = q.size();
            int sum = 0;
            for(int i =0; i<size;i++){
                TreeNode temp = q.poll();
                sum += temp.val;

                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);            
            }
            if(sum > max){
                max = Math.max(max,sum);
                ans = level;
            }
            
        }
        return ans;
    }
}