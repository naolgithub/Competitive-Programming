class Solution {
    public boolean isPalindrome(int x) {
      if(x<0 || (x%10==0 && x!=0)){
          return false;
      }
       int sum=0;
        int y=x;
        while(y>0){
            int remainder=y%10;
            sum=sum*10+remainder;
            y=y/10;
        }
        return sum==x;
    }
}