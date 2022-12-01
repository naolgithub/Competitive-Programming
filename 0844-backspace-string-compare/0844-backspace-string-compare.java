class Solution {
    public boolean backspaceCompare(String s, String t) {
        /*
        Using StringBuilder
        Time Complexity: O(N+M)
        Space Complexity:O(N+M),where N and M are the s and t lengths respectively.
        */
       StringBuilder sbS = new StringBuilder();
       StringBuilder sbT = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '#') {
                sbS.append(c);
            }
            //if you see a '#' decrease sbS length by one
            else if (sbS.length() != 0) {
                sbS.setLength(sbS.length() - 1);
            }
        }
        
        for (char c : t.toCharArray()) {
            if (c != '#') {
                sbT.append(c);
            }
            //if you see a '#' decrease sbT length by one
            else if (sbT.length() != 0) {
                sbT.setLength(sbT.length() - 1);
            }
        }
        return sbS.toString().equals(sbT.toString());
    }
}