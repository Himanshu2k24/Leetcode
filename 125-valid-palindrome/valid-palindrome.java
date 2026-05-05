class Solution {
    public boolean isPalindrome(String s) {
        String clear = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i = 0;
        int j = clear.length() - 1;
        while(i <= j){
            if(clear.charAt(i) != clear.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}