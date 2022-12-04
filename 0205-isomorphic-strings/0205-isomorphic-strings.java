class Solution {
    public boolean isIsomorphic(String s, String t) {
        /*
        Using hashmap and hashset
        Time Complexity:O(N)
        Space Complexity:O(N)
        */
        Map<Character,Character> map=new HashMap();
        Set<Character> set=new HashSet();
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(!map.get(s.charAt(i)).equals(t.charAt(i))) return false;
            }
            else if(!map.containsKey(s.charAt(i)) && set.contains(t.charAt(i))){
                return false;
            }
            else{
                map.put(s.charAt(i),t.charAt(i));
                set.add(t.charAt(i));
            }
        }
        return true;
    }
}