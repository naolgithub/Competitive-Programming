class Solution {
    public int longestContinuousSubstring(String s) {
        //Stores the maxContinuousSubstring, maximum longest continous subarray
        int maxContinuousSubstring=0;
        
        int currentContinuousSubstringLength=0;
        
        //Stores the value of previous character in integer form(ascii)
        int previousCharacter=-1;
        
        for(int i=0;i<s.length();i++){
            //If previousCharacter==-1 means we are at the first character of the string
            if(previousCharacter==-1){
                currentContinuousSubstringLength++;
                previousCharacter=s.charAt(i)-'a';
            }
            else{
                //If current character value is just 1 greater then previous character then it is part of continous substring and now we update current character as previous character andd increment currentContinuousSubstringLength by 1
                if(s.charAt(i)-'a'==previousCharacter+1){
                    currentContinuousSubstringLength++;
                    previousCharacter=s.charAt(i)-'a';
                }
                //Else current character is now the previous character and length is 1
                else{
                    currentContinuousSubstringLength=1;
                    previousCharacter=s.charAt(i)-'a';
                }
            }
            maxContinuousSubstring=Math.max(maxContinuousSubstring,currentContinuousSubstringLength);
        }
        return maxContinuousSubstring;
    }
}