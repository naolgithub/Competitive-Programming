class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] masks = new int[n];
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            int mask = 0;
            for (char c : words[i].toCharArray()) {
                mask |= 1 << (c - 'a');
            }
            masks[i] = mask;
            array[i] = words[i].length();
        }
        
        int maxValue = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // If the words do not share common letters
                if ((masks[i] & masks[j]) == 0) {
                    maxValue = Math.max(maxValue, array[i] * array[j]);
                }
            }
        }
        
        return maxValue;
    }
}