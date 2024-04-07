class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        double number = myPow(x,n/2); 
        if(n < 0){
            x = 1/x;
            n = -n;
        }
        if(n % 2 == 0) return number*number;
        return x*number*number;
    }
}