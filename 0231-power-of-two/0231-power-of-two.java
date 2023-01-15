class Solution {
    public boolean isPowerOfTwo(int n) {
        //1.Using recursion
        /*
        if(n<1) return false;
        if(n%2==0) return isPowerOfTwo(n/2);
        return n==1;
        */
        
        //2.Using math approach
        if(n==0) return false;
        int x=(int)(Math.log(n)/Math.log(2));
        return n==(int)Math.pow(2,x);
    }
}