class Solution {
    public boolean checkPowersOfThree(int n) {
        if(n%3==2) return false;
        else if(n==1) return true;
        return checkPowersOfThree(n/3); 
    }
}