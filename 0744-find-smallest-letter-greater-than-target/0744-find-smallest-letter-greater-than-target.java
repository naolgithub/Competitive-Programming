class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        //we dont consider the target is equal to letters[middle] ...because we return the character in letters which is greater than target. and If such a character does not exist, return the first character in letters.
        while(start<=end){
            int middle=start+(end-start)/2;
            if(target<letters[middle]) end=middle-1;
            else start=middle+1;
        }
        return letters[start%letters.length];
    }
}