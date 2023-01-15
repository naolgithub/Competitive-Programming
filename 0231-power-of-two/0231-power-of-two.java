class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if(n==0) return false;
        int x=(int)(Math.log(n)/Math.log(2));
        return n==(int)Math.pow(2,x);
    }
}