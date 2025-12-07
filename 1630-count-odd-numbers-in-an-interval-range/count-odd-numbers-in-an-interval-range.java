class Solution {
    public int countOdds(int low, int high) {
        int r = 0;
        if(low %2 == 0 && high % 2 == 0 ){
            r = (high - low) / 2; 
        }else{
            r = (high - low) / 2 + 1;
        }
        return r;
    }
}