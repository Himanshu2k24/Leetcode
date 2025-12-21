class Solution {
    public int mirrorDistance(int n) {
        String sb = n + "";
        StringBuilder s = new StringBuilder(sb);
        return Math.abs(n - Integer.valueOf(s.reverse().toString()    )    );
    }
}