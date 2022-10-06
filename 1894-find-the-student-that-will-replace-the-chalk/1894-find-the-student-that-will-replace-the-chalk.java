/*
1.Let's take sumas thesum of chalk[i] from i in range[0, n - 1]. This will store the total chalk used in a single process.
2.We have to only look when the chalk will be replaced where k = k % sum. Because after each k / sum times, the process will restart again from 0th student.
3.We travserse the chalk array and add the current sum till ith index, we will return the index when current sum becomes greater than k % sum for the first time.
*/
class Solution {
    public int chalkReplacer(int[] chalk, int k) {
       
        long sum = 0;
        long currentSum = 0;
        
        for(int eachChalk : chalk)
            sum += eachChalk;
        
        sum = k % sum;
        
        for(int i = 0; i < chalk.length; ++i) {
            currentSum += chalk[i];
            
            if(currentSum > sum)
                return i;
        }
        
        return - 1;
    }
}