import java.math.BigInteger;
class Solution {
    private boolean canSplit(String s, BigInteger previousValue, int start) {
        if (start == s.length()) {
            return true;
        }
        
        BigInteger currentValue = BigInteger.ZERO;
        for (int i = start; i < s.length(); i++) {
            currentValue = currentValue.multiply(BigInteger.TEN).add(BigInteger.valueOf(s.charAt(i) - '0'));
            
            if (currentValue.compareTo(previousValue) >= 0) {
                return false;
            }
            
            if (previousValue.subtract(currentValue).equals(BigInteger.ONE)) {
                if (canSplit(s, currentValue, i + 1)) {
                    return true;
                }
            }
        }
        return false;
    }    
    public boolean splitString(String s) {
        // Iterate over possible lengths of the first substring
        for (int i = 1; i < s.length(); i++) {
            BigInteger firstValue = new BigInteger(s.substring(0, i));
            if (canSplit(s, firstValue, i)) {
                return true;
            }
        }
        return false;
    }
}