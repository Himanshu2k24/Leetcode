class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(goal);
        return helper(s,sb,0);
    }
    private boolean helper(String s, StringBuilder sb,int idx){
        if(idx == s.length()) return false;
        if(s.equals(sb.toString()) ) return true;

        sb.append(sb.charAt(0));
        sb.deleteCharAt(0);

        return helper(s,sb,idx+1);
    }
}