public class Solution {
    public int minMoves(int target, int maxDoubles) {
        int numberOfMovesToOne = 0;
        while (target > 1) {
            if (maxDoubles > 0) {
                if(target % 2 == 0){
                    target /= 2;
                    maxDoubles--;
                }
                else if(target % 2 == 1){
                    target--;
                }
            }  
            else {
                numberOfMovesToOne += (target - 1); 
                break; 
            }
            numberOfMovesToOne++; 
        }
        return numberOfMovesToOne;
    }
}
