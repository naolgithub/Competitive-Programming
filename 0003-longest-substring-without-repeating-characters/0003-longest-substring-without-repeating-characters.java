class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Define the character range
        int CHAR_RANGE = 128;
         // base case
        if (s == null || s.length() == 0) {
            return 0;
        }
 
        // boolean array to mark characters present in the current window
        boolean[] window = new boolean[CHAR_RANGE];
 
        // stores the longest substring boundaries
        int begin = 0;
        int end = 0;
        for(int low=0,high=0;high<s.length();high++){
            //if character is present in the current window
            if(window[s.charAt(high)]){
         // remove characters from the left of the window till
         // we encounter the current character
                while(s.charAt(low)!=s.charAt(high)){
                    window[s.charAt(low)]=false;
                    low++;
                }
                low++;
            }
            else{
                // if the current character is not present in the current
                // window, include it
                window[s.charAt(high)]=true;
             // update the maximum window size if necessary
                if(end-begin<high-low){
                    begin=low;
                    end=high;
                }
            }
        }
        return s.substring(begin,end+1).length();
        
    }
}