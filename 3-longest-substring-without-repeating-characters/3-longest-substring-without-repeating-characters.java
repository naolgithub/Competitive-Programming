class Solution {
    public int lengthOfLongestSubstring(String s) {
        // it is a sliding window question
        // lets take two pointers and hashSet 
        // since hashset only stores unique data
        int a_pointer=0;
        int b_pointer=0;
        int longestSubstring=0;
        // we are gonna use HashSet since it stores only unique data
        HashSet<Character> hashSet=new HashSet<>();
        while(b_pointer<s.length()){
            //adding elements into hashSet
            if(!hashSet.contains(s.charAt(b_pointer))){
                hashSet.add(s.charAt(b_pointer));
                b_pointer++;
        //finding the maximum substring length
        longestSubstring=Math.max(longestSubstring,hashSet.size());
            }
                // if you encounter any previous element, remove the previously added element not the new encountered one.
            else if(hashSet.contains(s.charAt(a_pointer))){
                  hashSet.remove(s.charAt(a_pointer));
                  a_pointer++;   
                 }
            
        }
        return longestSubstring;
    }
}