/*
class Solution {
    private String sort(String s){
        char[] arrayOfCharacters=s.toCharArray();
        Arrays.sort(arrayOfCharacters);
        return new String(arrayOfCharacters);
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        s=sort(s);
        t=sort(t);
        char[] sString=s.toCharArray();
        char[] tString=t.toCharArray();
        for(int i=0;i<sString.length;i++){
            if(sString[i]!=tString[i]) return false;
        }
        return true;
    }
}
*/




class Solution {
    private boolean matches(int[] smap, int[] tmap){
        for(int i=0;i<26;i++){
            if(smap[i]!=tmap[i]) return false;
        }
        return true;
    }
    public boolean isAnagram(String s, String t) {
        //the following code works only if inputs a-z characters
        if(s.length()!=t.length()) return false;
        int[] smap=new int[26];
        int[] tmap=new int[26];
        for(int i=0;i<s.length();i++){
            smap[s.charAt(i)-'a']++;
            tmap[t.charAt(i)-'a']++;
        }
        return matches(smap,tmap);
    }
}
