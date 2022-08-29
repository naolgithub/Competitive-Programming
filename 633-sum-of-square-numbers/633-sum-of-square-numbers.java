import java.lang.Math;
class Solution {
    public boolean judgeSquareSum(int c) {
     long a=0;
     long b=(long)(Math.sqrt(c));
        while(a<=b){
            long answer=a*a+b*b;
            if(answer==c) return true;
            else if(answer>c){
                b--;
            }
            a++;
        }
        return false;
    }
}