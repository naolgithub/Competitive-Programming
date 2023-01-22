/*
class Solution {
    private String sort(String s){
        char[] arrayOfCharacters=s.toCharArray();
        Arrays.sort(arrayOfCharacters);
        return new String(arrayOfCharacters);
    }
    public boolean checkInclusion(String s1, String s2) {
        //
        //let l1 be the length of string s1 and s2 be the //length of string s2
  //      Time complexity:O(l1Log(l1) + (l2-l1)l1Log(l1))
    //    Space complexity:O(1)
        
        //points noticed: 1 sorting of string using Arrays.sort() method after changing string to array of character.
        String sortedSOne=sort(s1);
        for(int i=0;i<=s2.length()-s1.length();i++){
            String sortedSTwo=sort(s2.substring(i,i+s1.length()));
            if(sortedSOne.equals(sortedSTwo)){
                return true;
            }
        }
        return false;
    }
}
*/

public class Solution {
    public boolean matches(int[] s1map, int[] s2map) {
        for (int i = 0; i < 26; i++) {
            if (s1map[i] != s2map[i])
                return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] s1map = new int[26];
        for (int i = 0; i < s1.length(); i++)
            s1map[s1.charAt(i) - 'a']++;
        
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            int[] s2map = new int[26];
            for (int j = 0; j < s1.length(); j++) {
                s2map[s2.charAt(i + j) - 'a']++;
            }
            if (matches(s1map, s2map))
                return true;
        }
        return false;
    }
}


