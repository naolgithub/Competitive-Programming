/*
class Solution {
    private String sort(String s){
        char[] arrayOfCharacters=s.toCharArray();
        Arrays.sort(arrayOfCharacters);
        return new String(arrayOfCharacters);
    }
    public List<Integer> findAnagrams(String s, String p) {
        //using Sorting approach
 //points noticed: 1 sorting of string using Arrays.sort() method after changing string to array of character.
        List<Integer> list=new ArrayList();
        String sortedP=sort(p);
        for(int i=0;i<=s.length()-p.length();i++){
            String sortedS=sort(s.substring(i,i+p.length()));
            if(sortedP.equals(sortedS)){
                list.add(i);
            }
        }
        return list;
    }
}
*/






class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList();
        if (p.length() > s.length()) return list;
        int[] pmap = new int[26];
        int[] smap = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pmap[p.charAt(i) - 'a']++;
            smap[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length() - p.length(); i++) {
            if (matches(pmap, smap)) list.add(i);
            smap[s.charAt(i + p.length()) - 'a']++;
            smap[s.charAt(i) - 'a']--;
        }
        // checking whether the last window matches the pmap
        if (matches(pmap, smap)) list.add(s.length() - p.length());
        
        return list;
    }
    
    public boolean matches(int[] s1map, int[] s2map) {
        for (int i = 0; i < 26; i++) {
            if (s1map[i] != s2map[i])
                return false;
        }
        return true;
    }
}

