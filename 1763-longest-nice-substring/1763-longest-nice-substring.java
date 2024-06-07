class Solution {
    private boolean isNice(String s){
        boolean[] lower=new boolean[26];
        boolean[] upper=new boolean[26];
        for(char c : s.toCharArray()){
            if(Character.isLowerCase(c)){
                lower[c-'a']=true;
            }
            else if (Character.isUpperCase(c)) {
                upper[c - 'A'] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (lower[i] != upper[i]) {
                return false;
            }
        }
        return true;        
    }
    public String longestNiceSubstring(String s) {
        if(s.isEmpty() || s.length()<2) return "";
        String longestSubstring="";
        // Generate all possible substrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                if (isNice(substring) && substring.length() > longestSubstring.length()) {
                    longestSubstring = substring;
                }
            }
        }
        
        return longestSubstring;        
    }
}