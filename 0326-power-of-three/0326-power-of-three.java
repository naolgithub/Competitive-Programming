class Solution {
    public boolean isPowerOfThree(int n) {
        //1.Using loop
        /*
        if(n<1) return false;
        while(n%3==0) n/=3;
        return n==1;
        */
        //2.Using recursion
        if(n<1) return false;
        if(n%3==0) return isPowerOfThree(n/3);
        return n==1;
    }
}