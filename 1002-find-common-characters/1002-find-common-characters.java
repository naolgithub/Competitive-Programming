class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character, Integer> counter = new HashMap();
        for (char c : words[0].toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> tempCounter = new HashMap();
            for (char c : words[i].toCharArray()) {
                if (counter.containsKey(c)) {
                    // comparing freq of two characters from d/t strings
                    tempCounter.put(c, Math.min(counter.get(c),tempCounter.getOrDefault(c, 0) + 1));
                }
            }
            //update counter  
            counter = tempCounter;
        }
    
        List<String> result = new ArrayList();
        for(Map.Entry<Character,Integer> map:counter.entrySet()){
            //Handling duplicates eg.{e,l,l} <-- here we have two l.
            for(int i=0;i<map.getValue();i++){
                result.add(Character.toString(map.getKey()));
            }
        }

        return result;
    }
}
