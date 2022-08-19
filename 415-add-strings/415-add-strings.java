import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger A = new BigInteger(num1);
           BigInteger B = new BigInteger(num2);
           BigInteger result = A.add(B);
            return result.toString(); 
    }
}