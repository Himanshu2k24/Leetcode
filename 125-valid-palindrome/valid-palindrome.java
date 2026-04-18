class Solution {
    public boolean isPalindrome(String s) {
        
        String clear = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        if(check(clear)) return true;
        return false;
    }
    public boolean check(String s) {
        int i = 0;
        int j = s.length() -1;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}