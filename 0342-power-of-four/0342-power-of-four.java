class Solution {
    public boolean isPowerOfFour(int n) {
        /* 
        1.Using math approach
        if(n==0) return false;
        int x=(int)(Math.log(n)/Math.log(4));
        return n==(int)Math.pow(4,x);
        */
        
        //Using recursion approach
        //keep dividing the element by 4 until its become 1 otherwise return false
        if(n<1) return false;
        if(n%4==0) return isPowerOfFour(n/4);
        return n==1;
    }
}