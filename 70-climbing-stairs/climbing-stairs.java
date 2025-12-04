class Solution {
    public int climbStairs(int n) {
        int[] arr = new int[n+1];
        return helper(n,0,arr);
    }
    public int helper(int n,int index,int[] arr){
        if(index > n){
            return 0;
        }
        if(index == n) return 1;
        if(arr[index] == 0){
            arr[index] = helper(n,index + 1,arr) + helper(n,index + 2,arr);;
        }
        return arr[index];
        
    }
}