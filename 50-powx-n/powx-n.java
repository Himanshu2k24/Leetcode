class Solution {
    public double myPow(double x, int n) {
        long nu = n;
        if(nu > 0){
            return Power(x,-nu);
        }else{
            return 1 / Power(x,nu);
        }
    }
    public double Power(double x,long nu){
        if(nu == 0) return 1;
        if(nu == 1) return x;

        double half = Power(x,nu/2);

        if(nu % 2 == 0){
            return half * half;
        }else{
            return x * half * half;
        }
    }
}