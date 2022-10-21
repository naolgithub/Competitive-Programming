class Solution {
    /*
    Maintain a sliding window of size k, keep updating the count of W out of it and find the minimum.

Note: leftBlockBound and rightBlockBound are the lower and upper bounds of the sliding window.
*/
    public int minimumRecolors(String blocks, int k) {
        //change blocks characters to UpperCase.
        blocks=blocks.toUpperCase();
        int min = Integer.MAX_VALUE;
        int leftBlockBound = -1;
        int sumOfWhiteBlocks=0;
        for (int rightBlockBound = 0; rightBlockBound < blocks.length(); rightBlockBound++) {
            sumOfWhiteBlocks +=blocks.charAt(rightBlockBound) == 'W' ? 1 : 0;
            if (rightBlockBound - leftBlockBound >= k) { // the window reaches size of k.
                min = Math.min(min, sumOfWhiteBlocks); // update  minimum.
                // slide 1 step right the leftBlockBound of the sliding
                // window and update the value of sumOfWhiteBlocks count.
                sumOfWhiteBlocks -= blocks.charAt(++leftBlockBound) == 'W' ? 1 : 0;
            }
        }
        return min;
    }
}