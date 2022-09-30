class Solution {
    public boolean detectCapitalUse(String word) {
        /*
        1.All letters in this word are capitals, like "USA".
        2.All letters in this word are not capitals, like "leetcode".
        3.Only the first letter in this word is capital, like "Google".
        */
        int count=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                count++;
            }
        }
        return count==word.length() || 
               count==0 || 
               count==1 && Character.isUpperCase(word.charAt(0));
    }
}