/*This is a math problem：
1 = 1
4 = 1 + 3
9 = 1 + 3 + 5
16 = 1 + 3 + 5 + 7
25 = 1 + 3 + 5 + 7 + 9
36 = 1 + 3 + 5 + 7 + 9 + 11
....
so 1+3+...+(2n-1) = (2n-1 + 1)n/2 = nn
*/
class Solution {
    public boolean isPerfectSquare(int num) {
        // Any valid perfect square has 1 + 3 + 5 + 7 + 9 +......pattern.
    // so we keep deducting 1,3,5,...from INT NUM until we get zero. and    //if we get 0 it is indeed a valid perfect square 
    // if not it is not a valid perfect square
      int i = 1;
      while(num > 0) {
        num -= i;
        i += 2;      // The  1 + 3 + 5 + 7 + 9 +......pattern.
      }
      return num == 0;
    }
}