class Solution {
    public int climbStairs(int n) {
        int[] dynamicProgramming=new int[n+1];
        dynamicProgramming[0]=1;
        dynamicProgramming[1]=1;
        for(int i=2;i<=n;i++){
            dynamicProgramming[i]=dynamicProgramming[i-1]+dynamicProgramming[i-2];
        }
        return dynamicProgramming[n];
    }
}