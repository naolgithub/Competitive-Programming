class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        Map<Character,String> map=new HashMap<>();
        if(pattern.length()!=words.length) return false;
        for(int i=0;i<pattern.length();i++){
            char currentCharacterInPattern=pattern.charAt(i);
            if(map.containsKey(currentCharacterInPattern)){
                if(!map.get(currentCharacterInPattern).equals(words[i])) return false;
            }
            else{
                if(map.containsValue(words[i])) return false;
                map.put(currentCharacterInPattern,words[i]);
            }
        }
        return true;
    }
}