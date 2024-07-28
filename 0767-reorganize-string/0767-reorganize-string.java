class Solution {
    public String reorganizeString(String s) {
        // Step 1: Count the frequency of each character
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Find the character with the maximum frequency
        int maxFreq = 0;
        char maxFreqChar = 0;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxFreqChar = entry.getKey();
            }
        }

        // Step 3: Check if it's possible to rearrange the string
        if (maxFreq > (s.length() + 1) / 2) {
            return ""; // Not possible to rearrange
        }

        // Step 4: Create a result array
        char[] result = new char[s.length()];

        // Step 5: Place the most frequent character at even indices
        int index = 0;
        while (charCountMap.get(maxFreqChar) > 0) {
            result[index] = maxFreqChar;
            index += 2;
            charCountMap.put(maxFreqChar, charCountMap.get(maxFreqChar) - 1);
        }

        // Step 6: Place the remaining characters
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            while (count > 0) {
                if (index >= result.length) {
                    index = 1;
                }
                result[index] = c;
                index += 2;
                count--;
            }
        }

        return new String(result);
    }
}