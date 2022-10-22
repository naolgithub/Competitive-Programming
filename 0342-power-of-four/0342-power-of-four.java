class Solution {
    public boolean isPowerOfFour(int n) {
        //using built-in Math function
        /*
        x=log(n)/log(4)
        check n==4^x
        */
        if(n==0) return false;
        int x=(int)(Math.log(n)/Math.log(4));
        return n==(int)Math.pow(4,x);
    }
}