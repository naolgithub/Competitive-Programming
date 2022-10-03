class Solution {
    /*intution -> our target is to collect the maximum number of coins possible
but whichever pile we choose Alice will pick first so he will pick the pile with most number of coins , then i will choose ,followed by Bob 
so  a trick is to choose two piles with max number of coins (for me and alice) and one pile with the least number of coins

eg. [9,8,7,6,5,1,2,3,4]
lets sort it
[1,2,3,4,5,6,7,8,9]
 pick two piles from last [8,9]->Alice will pick 9 leaving 8 for me
 [1] -> from first for Bob
 repeat this [2,6,7] my count=8+6=14
 [3,4,5]
 ans=14+4=18;
 */
    public int maxCoins(int[] piles) {
        // we have to sort before computing 3n piles of coins stuff
       Arrays.sort(piles);
       int left=0;
       int right=piles.length-1;
        int result=0;
        while(left<right){
            result+=piles[right-1];
            right-=2;
            left++;
        }
        return result;
    }
}
