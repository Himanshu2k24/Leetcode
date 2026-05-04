class Solution {
    public int reverse(int x) {
        int num = 0;
        
       if(x >  0){
            while(x != 0 ){
                int rem = x % 10;
                if(num > Integer.MAX_VALUE / 10) return 0;
                num = num * 10 + rem;
                x /= 10;
            }
            return num;
       }
       
       int ax = x;
        while(ax != 0 ){
                int rem = ax % 10;
                if(num < Integer.MIN_VALUE / 10) return 0;
                num = num * 10 + rem;
                ax /= 10;
        }
        return num;
    }
}