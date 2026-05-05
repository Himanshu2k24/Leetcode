class Solution {
    public boolean isHappy(int n) {
        if(n < 0) return false;
        int num = n;
        HashSet<Integer> has = new HashSet<>();
        while(n != 1){
            if(has.contains(n)) return false;
            has.add(n);
            int sum =  0;
            while(n != 0){
                int rem = n % 10;
                sum += rem * rem;
                n /= 10;
            }
            n = sum;
        }
        return true;
    }
}