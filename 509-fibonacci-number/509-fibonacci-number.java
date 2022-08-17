class Solution {
    public int fib(int n) {
    // 0 1 2 3 5 8 13 
        if(n==0||n==1) return n;
        else
            return fib(n-1)+fib(n-2);
    }
}