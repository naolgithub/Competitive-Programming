class Solution {
    public int maxDepth(String s) {
        int current = 0; // the current depth
        int max = 0; // the max depth
        
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (character == '(') { // depth increases
                current++;
            } else if (character == ')') { // depth decreases
                current--;
            }
            max = Math.max(max, current); // get the max
        }
        
        return max;
    }
}