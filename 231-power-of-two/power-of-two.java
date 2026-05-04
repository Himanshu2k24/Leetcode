class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        if(n < 0) return false;
        int num = 2;
        for(int i = 0; i < 33;i++){
            if(1 << i == n) return true;
        }
        return false;
    }
}