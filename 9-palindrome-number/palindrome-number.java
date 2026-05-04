class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        if(x < 0) return false;
        int num = 0;
        while(x != 0){
            int rem = x % 10;
            num = num * 10 + rem;
            x /= 10;
        }
        System.out.print(num);
        return temp == num;
    }
}