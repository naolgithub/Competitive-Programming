class Solution {
    private int helper(int num,int numberOfSteps){
        if(num==0) return numberOfSteps;
        else if(num%2==0) return helper(num/2,numberOfSteps+1);
        else return helper(num-1,numberOfSteps+1);
    }
    public int numberOfSteps(int num) {
     return helper(num,0);   
    }
}